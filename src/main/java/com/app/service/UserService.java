package com.app.service;

import java.util.List;

import com.app.dto.UserDto;
import com.app.entity.User;

public interface UserService {
	
	User addUser(UserDto user);
	
	List<User> viewAllUsers();
	
	User viewUser(int uid);
	
	boolean deleteUser(int uid);
	

}
