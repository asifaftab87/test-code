package org.ecom.noor.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.noor.service.EmployeeService;

public class EmployeeDeleteController extends HttpServlet {

	private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String empIdStr = request.getParameter("empId");
		System.out.println("empIdStr: "+empIdStr);
		
		EmployeeService employeeService= new EmployeeService();
		try {
			long empId = Long.valueOf(empIdStr);
			employeeService.deleteEmployeeById(empId);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/employee/list/noorain");  
	}
}
