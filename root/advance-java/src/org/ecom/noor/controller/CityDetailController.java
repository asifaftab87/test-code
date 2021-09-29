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


public class CityDetailController extends HttpServlet {

	private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
		String cityIdStr = request.getParameter("cityId");
		
		CityService cityService=new CityService();
		
		try {
			long cityId =  Long.valueOf(cityIdStr);
			City city = cityService.findCityById(cityId);
			
			if(city!=null) {
				
				//pass value to jsp 
				request.setAttribute("city",city);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/city-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	}
}
