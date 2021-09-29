package org.ecom.jamal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.jamal.service.EmployeeService;

public class EmployeeDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeeidStr = request.getParameter("employeeid");
		System.out.println("employeeid: "+employeeidStr);
		
		EmployeeService employeeService = new EmployeeService();
		try {
			long employeeid = Long.valueOf(employeeidStr);
			employeeService.deleteEmployeeById(employeeid);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/employee/list/jamal");
	}

}
