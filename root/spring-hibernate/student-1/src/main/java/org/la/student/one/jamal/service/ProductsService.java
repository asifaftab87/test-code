package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Products;
import org.la.student.one.jamal.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository productsRepository;
	
	
	public Products findById(long id) {
		Optional<Products> optional =productsRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Products> findAll(){
	return productsRepository.findAll();
	
	}
	
	public List<Products> findByName(String name){
		return productsRepository.findByName(name);
	}
	
	
	public Products create (Products products) {
		return productsRepository.save(products);
	}
	
	public Products update (Products products) {
		return productsRepository.saveAndFlush(products);
	}
	
	
}
