package org.ecom.noor.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.Company;
import org.ecom.noor.service.CompanyService;


public class CompanyCreateController extends HttpServlet {

private static final long serialVersionUID = 6467649553058598678L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/company-create.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		System.out.println("company add do get");
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Name = request.getParameter("name");
		String description = request.getParameter("description");
		String primaryContactAttendeeIdString=request.getParameter("primaryContactAttendeeId");

		int primaryContactAttendeeId = Integer.valueOf(primaryContactAttendeeIdString);
		
		
		System.out.println("Name: "+Name);
		System.out.println("description: "+description);
		System.out.println("primaryContactAttendeeId: "+primaryContactAttendeeId);
		
	
		CompanyService companyService=new CompanyService();
		
		try {
	       
			Company company = new Company();
			company.setName(Name);
			company.setdescription(description);
			company.setprimary_contact_attendee_id(primaryContactAttendeeId);
			companyService.createCompany(company);
        } 
	
		catch (Exception e) {
            e.printStackTrace();
        }
		
		companyService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/advance-java/company/list/noorain");  
	}
}
