package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Merchants;
import org.la.student.one.jamal.repository.MerchantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantsService {
	
	@Autowired
	private MerchantsRepository merchantsRepository;
	
	
	public Merchants findById(long id) {
		Optional<Merchants> optional =merchantsRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Merchants> findAll(){
	return merchantsRepository.findAll();
	
	}
	
	public List<Merchants> findByMerchantName(String merchantName){
		return merchantsRepository.findByMerchantName(merchantName);
	}
	
	
	public Merchants create (Merchants merchants) {
		return merchantsRepository.save(merchants);
	}
	
	public Merchants update (Merchants merchants) {
		return merchantsRepository.saveAndFlush(merchants);
	}
	
	
}
