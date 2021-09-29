package org.ecom.noor.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.noor.model.Company;
import org.ecom.noor.service.CompanyService;

public class CompanyController extends HttpServlet{

private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("CompanyController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/company-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		CompanyService companyService=new CompanyService();
		List<Company> companyList = companyService.getAllCompany();
		
		request.setAttribute("companyList", companyList);
		 companyService.connectionClose();
		
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
