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


public class CompanyUpdateController extends HttpServlet {

private static final long serialVersionUID = 8170467442791463622L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         String companyIdStr = request.getParameter("companyId");
		
		System.out.println("company update do get companyId: "+ companyIdStr);
		
		CompanyService companyService=new CompanyService();
		
		try {
			long companyId = Long.valueOf(companyIdStr);
			Company company =companyService.findCompanyById(companyId);
			
			if(company!=null) {
				request.setAttribute("company", company);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/company-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String companyIdStr = request.getParameter("companyId");
		
		System.out.println("company update do get companyId: "+companyIdStr);
		String Name = request.getParameter("name");
		String description = request.getParameter("description");
		Integer Integer_company = 0;
		int primary_contact_attendee_id = Integer_company.intValue();
		
		System.out.println("Name: "+Name);
		System.out.println("description: "+description);
		System.out.println("primary_contact_attendee_id: "+primary_contact_attendee_id);
		

	    CompanyService companyService=new CompanyService();
		
		try {
			int companyId = Integer.valueOf(companyIdStr);
			
	       Company company=new Company();
	       company.setId(companyId);
	       company.setName(Name);
	       company.setdescription(description);
	       company.setprimary_contact_attendee_id(primary_contact_attendee_id);
	       companyService.updateCompany(company);
	       
        } 
		catch (Exception e) {
            e.printStackTrace();
        }
		
		companyService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/advance-java/company/list/noorain");  
	}
}
