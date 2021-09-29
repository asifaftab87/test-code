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

public class BrandDetailController extends HttpServlet {

	
private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String brandIdStr = request.getParameter("brandId");
		
		System.out.println("brand detail do get brandId: "+brandIdStr);
		
		BrandService brandService=new BrandService();
		
		try {
			long brandId = Long.valueOf(brandIdStr);
			Brand brand = brandService.findBrandById(brandId);
			if(brand!=null) {
				
				//pass value to jsp 
				request.setAttribute("brand", brand);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/brand-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	}
}
