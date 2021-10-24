package org.la.student.one.tahir.service;

import java.util.List;
import java.util.Optional;


import org.la.student.one.tahir.model.Company;
import org.la.student.one.tahir.repository.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public Company findById(long id) {
		Optional<Company> optional = companyRepository.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<Company> findAll(){
		return companyRepository.findAll();
				
			
	}
	
	public List<Company> findByFirstName(String name){
		
		return companyRepository.findByName(name);
	}
	
	public Company create(Company company) {
	
		
		return companyRepository.save(company);
		
	}
}
