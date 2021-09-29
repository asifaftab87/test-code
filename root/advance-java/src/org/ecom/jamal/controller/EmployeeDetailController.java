package org.ecom.jamal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.jamal.model.Employee;
import org.ecom.jamal.service.EmployeeService;

public class EmployeeDetailController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeeidStr = request.getParameter("employeeid");
		
		System.out.println("Employee detail do get employeeid: "+employeeidStr);
		
		EmployeeService employeeService = new EmployeeService();
		
		try {
			long employeeid = Long.valueOf(employeeidStr);
			Employee employee = employeeService.findEmployeeById(employeeid);
			
			if(employee!=null) {
				
				//pass value to jsp 
				request.setAttribute("employee", employee);
			}
				
			
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			long employeeid = Long.valueOf(employeeidStr);
			Employee employee = employeeService.findEmployeeById(employeeid);
			
			if(employee!=null) {
				
				//pass value to jsp 
				request.setAttribute("employee", employee);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "jamal/employee-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	}

}
