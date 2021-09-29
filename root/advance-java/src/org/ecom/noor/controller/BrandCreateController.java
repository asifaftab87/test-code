package org.ecom.noor.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.Brand;

import org.ecom.noor.service.BrandService;


public class BrandCreateController extends HttpServlet{

private static final long serialVersionUID = 6467649553058598678L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/brand-create.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		System.out.println("brand add do get");
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Name = request.getParameter("name");
		String thumbnails=request.getParameter("thumbnails");
		
		
		System.out.println("Name: "+Name);
		System.out.println("thumbnails: "+thumbnails);
		
		BrandService brandService=new BrandService();
		
		try {
			
	        Brand brand=new Brand();
	 		brand.setName(Name);
	 		brand.setThumbnails(thumbnails);
	 		brandService.createBrand(brand);
	 		
        } 
		catch (Exception e) {
            e.printStackTrace();
        }
		
		brandService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/advance-java/brand/list/noorain");  
	}
}
