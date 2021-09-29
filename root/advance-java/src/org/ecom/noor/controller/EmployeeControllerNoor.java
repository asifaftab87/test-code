package org.ecom.noor.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.Employee;
import org.ecom.noor.service.EmployeeService;

public class EmployeeControllerNoor extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("EmployeeController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/employee-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		EmployeeService employeeService= new EmployeeService();
		List<Employee> employeeList = employeeService.getAllEmployee();
		
		//send value from java class to jsp 
		request.setAttribute(" employeeList",  employeeList);
		employeeService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
