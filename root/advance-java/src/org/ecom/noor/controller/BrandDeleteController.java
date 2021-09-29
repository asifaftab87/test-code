package org.ecom.noor.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.noor.service.BrandService;

public class BrandDeleteController extends HttpServlet {

	
private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String brandIdStr = request.getParameter("brandId");
		System.out.println("brandIdStr: "+brandIdStr);
		
		BrandService brandService=new BrandService();
		try {
			long brandId = Long.valueOf(brandIdStr);
			brandService.deleteBrandById(brandId);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/brand/list/noorain");  
	}
}
