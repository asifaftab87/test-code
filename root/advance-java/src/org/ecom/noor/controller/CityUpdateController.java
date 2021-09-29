package org.ecom.noor.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.City;
import org.ecom.noor.service.CityService;

public class CityUpdateController extends HttpServlet {

	private static final long serialVersionUID = 8170467442791463622L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         String cityIdStr = request.getParameter("cityId");
		
		System.out.println("city update do get cityId: "+cityIdStr);
		
		CityService cityService=new CityService();
		
		try {
			long cityId = Long.valueOf(cityIdStr);
			City city =cityService.findCityById(cityId);
			
			if(city!=null) {
				request.setAttribute("city", city);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/city-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String cityIdStr = request.getParameter("cityId");
		 
		 System.out.println("city update do get cityId: "+cityIdStr);
		 
		 String Name = request.getParameter("name");
		 
		 System.out.println("Name: "+Name);
		 
		 CityService cityService=new CityService();
		 
		 try {
				int cityId = Integer.valueOf(cityIdStr);
				City city=new City();
				
				city.setId(cityId);
				city.setName(Name);
				cityService.updateCity(city);
		 }
		 catch (Exception e) {
	            e.printStackTrace();
	        }
			
		 cityService.connectionClose();
			
			//to avoid form submission
			response.sendRedirect("/advance-java/city/list/noorain");  
		}
	}
	
	
