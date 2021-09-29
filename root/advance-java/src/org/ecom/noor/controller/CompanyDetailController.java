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

public class CompanyDetailController extends HttpServlet {
	
private static final long serialVersionUID = -7234965939251486114L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
		String companyIdStr = request.getParameter("companyId");
		
		CompanyService companyService=new CompanyService();
		
		try {
			long companyId =  Long.valueOf(companyIdStr);
			Company company = companyService.findCompanyById(companyId);
			
			if(company!=null) {
				
				//pass value to jsp 
				request.setAttribute("company",company);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/company-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	}

}
