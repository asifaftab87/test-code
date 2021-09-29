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

public class CategorySearchController extends HttpServlet {

private static final long serialVersionUID = 8170467442791463622L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		
		System.out.println("search user by name: "+name);
		
		CategoryService categoryService=new CategoryService();
		
		try {
			
			List<Category> categoryList = categoryService.getCategoryByName(name);
			request.setAttribute("categoryList", categoryList);
			 categoryService.connectionClose();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/category-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
}
