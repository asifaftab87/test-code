package org.ecom.noor.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.City;
import org.ecom.noor.service.CityService;

public class CityController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
System.out.println("CityController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/city-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		CityService cityService = new CityService();
		List<City> cityList = cityService.getAllCity();
		
		request.setAttribute("cityList", cityList);
		cityService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    }
}
