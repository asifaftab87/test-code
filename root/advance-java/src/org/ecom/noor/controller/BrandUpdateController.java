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


public class BrandUpdateController extends HttpServlet {

	
	private static final long serialVersionUID = 8170467442791463622L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String brandIdStr = request.getParameter("brandId");
		
		System.out.println("brand update do get brandId: "+brandIdStr);
		
		BrandService brandService=new BrandService();
		
		try {
			long brandId = Long.valueOf(brandIdStr);
			Brand brand = brandService.findBrandById(brandId);
			
			if(brand!=null) {
				request.setAttribute("brand", brand);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/brand-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String brandIdStr = request.getParameter("brandId");
		
		System.out.println("brand update do get brandId: "+brandIdStr);
		String Name = request.getParameter("name");
		String thumbnails=request.getParameter("thumbnails");
		
		
		System.out.println("Name: "+Name);
		System.out.println("thumbnails: "+thumbnails);
		
		
		BrandService brandService=new BrandService();
		
		try {
			int brandId = Integer.valueOf(brandIdStr);
			
	        Brand brand=new Brand();
	        brand.setId(brandId);
	        brand.setName(Name);
	        brand.setThumbnails(thumbnails);
	        brandService.updateBrand(brand);
        } 
		catch (Exception e) {
            e.printStackTrace();
        }
		
		brandService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/advance-java/brand/list/noorain");  
	}
}
