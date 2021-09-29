package org.ecom.noor.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.Brand;
import org.ecom.noor.service.BrandService;

public class BrandController extends HttpServlet {

private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("BrandController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/brand-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		BrandService brandService= new BrandService();
		List<Brand> brandList = brandService.getAllBrand();
		
		//send value from java class to jsp 
		request.setAttribute("brandList", brandList);
		brandService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
