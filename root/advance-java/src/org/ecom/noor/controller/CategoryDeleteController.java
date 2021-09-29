package org.ecom.noor.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.noor.service.CategoryService;

public class CategoryDeleteController extends HttpServlet {

private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String categoryIdStr = request.getParameter("categoryId");
		System.out.println("categoryIdStr: "+categoryIdStr);
		
		CategoryService categoryService=new CategoryService();
		try {
			long categoryId = Long.valueOf(categoryIdStr);
			categoryService.deleteCategoryById(categoryId);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/category/list/noorain");  
	}
}
