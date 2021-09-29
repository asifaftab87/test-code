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


public class EmployeeUpdateContollerNoor extends HttpServlet{

	private static final long serialVersionUID = 8170467442791463622L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String empIdStr = request.getParameter("empId");
		
		System.out.println("employee update do get empId: "+empIdStr);
		
		EmployeeService employeeService= new EmployeeService();
		
		try {
			long empId = Long.valueOf(empIdStr);
			Employee employee = employeeService.findEmployeeById(empId);
			
			if(employee!=null) {
				request.setAttribute("employee", employee);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/employee-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String empIdStr = request.getParameter("empId");
		
		System.out.println("employee update do get empId: "+empIdStr);
		String Name = request.getParameter("name");
		String Age=request.getParameter("age");
		String Salary=request.getParameter("salary");
		
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Salary: "+Salary);
		
		
		EmployeeService employeeService= new EmployeeService();
		
		try {
			int empId = Integer.valueOf(empIdStr);
			
			Employee employee=new Employee();
	        employee.setId(empId);
	 		employee.setName(Name);
	 		employee.setAge(empId);
	 		employee.setSalary(Salary);
	 		employeeService.updateEmployee(employee);
        } 
		
		catch (Exception e) {
            e.printStackTrace();
        }
		
		employeeService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/advance-java/employee/list/noorain");  
	}
}