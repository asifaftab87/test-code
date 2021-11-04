package org.la.student.one.tahir.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.la.student.one.tahir.model.dto.BalanceDTO;
import org.la.student.one.tahir.model.Balance;
import org.la.student.one.tahir.repository.BalanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tahirBalanceService")
public class BalanceService {

	@Autowired
	private BalanceRepository balanceRepository;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	public BalanceDTO findById(long id, BigDecimal spend) {
		Optional<Balance> optional = balanceRepository.findById(id); 
		if(optional.isPresent()) {
			Balance balance = optional.get();
			//BalanceDTO balanceDTO = toDTOObject(balance);
			BalanceDTO balanceDTO = mapper.map(balance, BalanceDTO.class);
			if(spend.compareTo(balance.getAmount())<=0) {
				balanceDTO.setStatus("sufficient");
			}
			else {
				balanceDTO.setStatus("insufficient");
			}
			return balanceDTO;
		}
		return null;
	}
	
	
	public BalanceDTO toDTOObject(Balance balance) {
		BalanceDTO balanceDTO = new BalanceDTO();
		balanceDTO.setId(balance.getId());
		balanceDTO.setAmount(balance.getAmount());
		balanceDTO.setActive(balance.getActive());
		return balanceDTO;
	}
}
