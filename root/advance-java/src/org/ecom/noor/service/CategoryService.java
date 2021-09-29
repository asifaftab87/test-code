package org.ecom.noor.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.noor.model.Category;
import org.ecom.noor.repository.CategoryRepository;
import org.ecom.util.GetSqlConnection;

public class CategoryService {

private Connection con = null;
	
	public CategoryService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Category> getAllCategory(){
		
		List<Category> categoryList = new ArrayList<>();
		
		if(con!=null) {
			categoryList = CategoryRepository.getAllCategory(con);
		}
		
		return categoryList;
	}
	
	public Category findCategoryById(long id){
		
		Category category = null;
		
		if(con!=null) {
			category = CategoryRepository.findCategoryById(con, id);
		}
		
		return category;
	}
	
	public int deleteCategoryById(long categoryId) {
		return CategoryRepository.deleteCategoryById(con, categoryId);
	}
	
	public void createCategory(Category category) {
		CategoryRepository.createCategory(con, category);
	}
	
	
	public void updateCategory(Category category) {
		CategoryRepository.updateCategory(con, category);
	}
	
	public List<Category> getCategoryByName(String name){
		return CategoryRepository.getCategoryByName(con, name);
	}
}
