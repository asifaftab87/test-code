package org.la.core.java.student.nizaam.jdbc.controller;

import org.la.core.java.student.nizaam.jdbc.model.User;
import org.la.core.java.student.nizaam.jdbc.service.UserService;

public class UserController {
	
	public static void main(String[] args) {
		UserService us = new UserService();
		
		try {
			us.create("Nizaam", "nizaam.s.m@gmail.com", 29);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
