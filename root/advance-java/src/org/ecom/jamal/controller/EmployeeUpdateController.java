package org.ecom.jamal.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.jamal.model.Employee;
import org.ecom.jamal.service.EmployeeService;

public class EmployeeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeeidStr = request.getParameter("employeeid");
		
		System.out.println(" Employee update do get employeeid: "+employeeidStr);
		
		EmployeeService employeeService = new EmployeeService();
		
		try {
			long employeeid = Long.valueOf(employeeidStr);
			Employee employee = employeeService.findEmployeeById(employeeid);
			
			if(employee!=null) {
				request.setAttribute("employee", employee);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "jamal/employee-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeeidStr = request.getParameter("employeeid");
		
		System.out.println("EmployeTwo update do get employeeid: "+employeeidStr);
		
		String Name = request.getParameter("name");
		String email = request.getParameter("email");
		String dobString = request.getParameter("dob");
		String JoinedString = request.getParameter("jdate");
		String ReleaseString = request.getParameter("rdate");
		String NoticePeriod = request.getParameter("notice_period");
		String genderString = request.getParameter("gender");
	
		
		System.out.println("Name: "+Name);
		System.out.println("email: "+email);
		System.out.println("dob String: "+dobString);
		System.out.println("Joined String: "+JoinedString);
		System.out.println("Release String: "+ReleaseString);
		System.out.println("Notice Period: "+NoticePeriod);
		System.out.println("gender: "+genderString);
		
		boolean gender = false;
		if(genderString!=null) {
			gender = Boolean.parseBoolean(genderString);
		}
		
		EmployeeService employeeService = new EmployeeService();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		Date dob = null;
		Date jdate = null;
		Date rdate = null;

		try {	
			int employeeid = Integer.valueOf(employeeidStr);
			
			dob = formatter.parse(dobString);
	        System.out.println(dob);
	        jdate = formatter.parse(JoinedString);
	        System.out.println(jdate);
	        rdate = formatter.parse(ReleaseString);
	        System.out.println(rdate);

			Employee employee = new Employee();
			employee.setId(employeeid);
			employee.setName(String.valueOf(Name));
			employee.setDob(dob);
			employee.setEmail(String.valueOf(email));
			employee.setGender(gender);
			employee.setJoined_date(jdate);
			employee.setRelease_date(rdate);
			employee.setNotice_period(Integer.valueOf(NoticePeriod));
			employeeService.createEmployee(employee);
		 } 
		catch (ParseException e) {
            e.printStackTrace();
        }
		catch (Exception e) {
            e.printStackTrace();
        }

		employeeService.connectionClose();

		// to avoid form submission
		response.sendRedirect("/advance-java/employee/list/jamal");
	}


}
