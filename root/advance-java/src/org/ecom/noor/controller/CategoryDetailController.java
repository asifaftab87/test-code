package org.ecom.noor.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.Category;
import org.ecom.noor.service.CategoryService;

public class CategoryDetailController extends HttpServlet {

private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String categoryIdStr = request.getParameter("categoryId");
		
		System.out.println("category detail do get categoryId: "+categoryIdStr);
		
		CategoryService categoryService=new CategoryService();
		
		try {
			long categoryId = Long.valueOf(categoryIdStr);
			Category category = categoryService.findCategoryById(categoryId);
			if(category!=null) {
				
				//pass value to jsp 
				request.setAttribute("category", category);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/category-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	}
}
