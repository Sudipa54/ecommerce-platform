package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDto;
import com.app.entity.User;
import com.app.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl serviceImpl;
	
	@PostMapping("/add")
	public ResponseEntity<?> createUser(@RequestBody UserDto userDto)
	{
		User user = serviceImpl.addUser(userDto);
		
		if (user != null)
			return new ResponseEntity(HttpStatus.OK).ok(user); 
		else
			return new ResponseEntity(HttpStatus.OK).ok("User insertion failed");

	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllUsers()
	{
		List<User> allUser;
		allUser = serviceImpl.viewAllUsers();
		if (allUser != null && !allUser.isEmpty())
			return new ResponseEntity(HttpStatus.OK).ok(allUser);
		
		else
			return new ResponseEntity(HttpStatus.OK).ok("Cannot fetch all the user");

	}
	
	@GetMapping("/{uid}")
	public ResponseEntity<?> getUser(@PathVariable int uid)
	{
		User userById = serviceImpl.viewUser(uid);
		if(userById != null)
			return new ResponseEntity(HttpStatus.OK).ok(userById);
		else
			return new ResponseEntity(HttpStatus.OK).ok("Cannot fetch the user id" + uid);

	}
	
	@DeleteMapping("/delete/{uid}")
	public String deleteAddress(@PathVariable int uid)
	{
		boolean isDeleted = serviceImpl.deleteUser(uid); 
		
		if(isDeleted)
		{
			return "User deleted Sucessfully";
		}
		else
			return "User not deleted";
	}
	
	
	

}
