package org.ecom.noor.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.ecom.noor.service.CompanyService;

public class CompanyDeleteController  extends HttpServlet {

private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String companyIdStr = request.getParameter("companyId");
		System.out.println("companyIdStr: "+companyIdStr);
		
		CompanyService companyService=new CompanyService();
		
		try {
			long companyId = Long.valueOf(companyIdStr);
			companyService.deleteCompanyById(companyId);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/company/list/noorain");  
	}
}
