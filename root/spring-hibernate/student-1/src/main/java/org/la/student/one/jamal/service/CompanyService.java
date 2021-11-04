package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Company;
import org.la.student.one.jamal.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jamalCompanyService")
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	
	public Company findById(Long id) {
		Optional<Company> optional =companyRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Company> findAll(){
	return companyRepository.findAll();
	
	}
	
	public List<Company> findByName(String Name){
		return companyRepository.findByName(Name);
	}
	
	
	public Company create (Company company) {
		return companyRepository.save(company);
	}
	
	public Company update (Company company) {
		return companyRepository.saveAndFlush(company);
	}
	
	
}
