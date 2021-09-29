package org.ecom.noor.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.Category;
import org.ecom.noor.service.CategoryService;

public class CategoryController extends HttpServlet {

private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("CategoryControllerBrandController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/category-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		CategoryService categoryService= new CategoryService();
		List<Category> categoryList = categoryService.getAllCategory();
		
		//send value from java class to jsp 
		request.setAttribute("categoryList", categoryList);
		categoryService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}

}
