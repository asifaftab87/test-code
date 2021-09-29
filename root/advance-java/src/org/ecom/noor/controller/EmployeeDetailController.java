package org.ecom.noor.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.Employee;
import org.ecom.noor.service.EmployeeService;


public class EmployeeDetailController extends HttpServlet {

	
	private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String empIdStr = request.getParameter("empId");
		
		System.out.println("employee detail do get empId: "+empIdStr);
		
		EmployeeService employeeService=new EmployeeService();
		
		try {
			long empId = Long.valueOf(empIdStr);
			Employee employee = employeeService.findEmployeeById(empId);
			
			if(employee!=null) {
				
				//pass value to jsp 
				request.setAttribute("employee", employee);
				
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			long empId = Long.valueOf(empIdStr);
			Employee employee = employeeService.findEmployeeById(empId);
			
			if(employee!=null) {
				
				//pass value to jsp 
				request.setAttribute("employee", employee);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/employee-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	}
}
