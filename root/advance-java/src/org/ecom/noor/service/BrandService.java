package org.ecom.noor.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.noor.model.Brand;
import org.ecom.noor.repository.BrandRepository;
import org.ecom.util.GetSqlConnection;

public class BrandService {

private Connection con = null;
	
	public BrandService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Brand> getAllBrand(){
		
		List<Brand> brandList = new ArrayList<>();
		
		if(con!=null) {
			brandList = BrandRepository.getAllBrand(con);
		}
		
		return brandList;
	}
	
	public Brand findBrandById(long id){
		
		Brand brand = null;
		
		if(con!=null) {
			brand = BrandRepository.findBrandById(con, id);
		}
		
		return brand;
	}
	
	public int deleteBrandById(long brandId) {
		return BrandRepository.deleteBrandById(con, brandId);
	}
	
	public void createBrand(Brand brand) {
		BrandRepository.createBrand(con, brand);
	}
	
	
	public void updateBrand(Brand brand) {
		BrandRepository.updateBrand(con, brand);
	}
	
	public List<Brand> getBrandByName(String name){
		return BrandRepository.getBrandByName(con, name);
	}
}
