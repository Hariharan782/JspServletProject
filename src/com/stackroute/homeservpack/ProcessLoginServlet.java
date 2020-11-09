package com.stackroute.homeservpack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stackroute.model.User;
import com.stackrouter.repo.UserRepo;

public class ProcessLoginServlet extends HttpServlet {

	private UserRepo userRepo = new UserRepo();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String password = req.getParameter("pwd");
		String city = req.getParameter("city");
		int code = Integer.parseInt(req.getParameter("code"));
		
		User user = new User(code, uname, city, password);
		//Validate registration form
		//Check if the user is already exists or not
		
		userRepo.addUser(user);
		
		for(User usr : userRepo.getAllUsers()) {
			System.out.println(usr);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	

}
