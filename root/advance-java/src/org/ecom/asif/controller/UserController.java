package org.ecom.asif.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.asif.futur.GeneratePopup;
import org.ecom.asif.model.User;
import org.ecom.asif.service.UserService;
import org.ecom.constant.ProjectConstants;

public class UserController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		System.out.println("UserController doGet");
		try {
			generatePopup();
			System.out.println("1sql path---------------------------");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("2sql path---------------------------");
		String destination = ProjectConstants.JSP_FOLDER_PATH + "asif/user-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		UserService userService = new UserService();
		List<User> userList = userService.getAllUser();
		
		//send value from java class to jsp 
		request.setAttribute("userList", userList);
		userService.connectionClose();
		
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private void generatePopup() throws InterruptedException, ExecutionException {
		GeneratePopup gp = new GeneratePopup();
		Future<Integer> future = gp.calculate(1);
//		Integer i = future.get();
//		System.out.println("result: "+i);
	}
}
