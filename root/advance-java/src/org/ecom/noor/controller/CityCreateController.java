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

public class CityCreateController extends HttpServlet {

	private static final long serialVersionUID = 6467649553058598678L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/city-create.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		System.out.println("city add do get");
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Name = request.getParameter("name");
		
		System.out.println("Name: "+Name);
		
		CityService cityService=new CityService();
		
		try {
			City city=new City();
			city.setName(Name);
			
			cityService.createCity(city);
		}
		
		catch (Exception e) {
            e.printStackTrace();
        }
		
		cityService.connectionClose();
		
		response.sendRedirect("/advance-java/city/list/noorain");  
	}
}
