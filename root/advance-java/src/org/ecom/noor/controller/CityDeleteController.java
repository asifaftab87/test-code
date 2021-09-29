package org.ecom.noor.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.noor.service.CityService;

public class CityDeleteController extends HttpServlet {

	private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cityIdStr = request.getParameter("cityId");
		System.out.println("cityIdStr: "+cityIdStr);
		
		CityService cityService=new CityService();
		
		try {
			long cityId = Long.valueOf(cityIdStr);
			cityService.deleteCityById(cityId);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/city/list/noorain");  
	}
}

