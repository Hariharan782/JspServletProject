package com.stackrouter.repo;

import java.util.ArrayList;

import com.stackroute.model.User;

public class UserRepo {
	private ArrayList<User> users = new ArrayList<User>();
	
	public boolean addUser(User user) {
		users.add(user);
		return true;
	}
	
	public ArrayList<User> getAllUsers() {
		return users;
	}
}
