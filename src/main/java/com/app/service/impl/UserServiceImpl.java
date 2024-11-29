package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.UserDto;
import com.app.entity.User;
import com.app.repo.UserRepo;
import com.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userImpl;
	
	@Override
	public User addUser(UserDto userDto) {
		// TODO Auto-generated method stub
		
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		user.setStatus("Active");
		User saveUser = userImpl.save(user);
		return saveUser;
		
	}

	@Override
	public List<User> viewAllUsers() {
		// TODO Auto-generated method stub
		return userImpl.findAll();
	}

	@Override
	public User viewUser(int uid) {
		// TODO Auto-generated method stub
		Optional<User> userById = userImpl.findById(uid);
		User user = null;
		if(userById.isPresent())
		{
			user = userById.get();
		}
		return user;
	}

	@Override
	public boolean deleteUser(int uid) {
		boolean flag = false;
		User user;
		user = userImpl.findById(uid).get();
		
		if(user != null)
		{
			user.setStatus("INACTIVE");
			userImpl.deleteById(user.getUid());
			flag = true;
		}
		
		return flag;
	}

}
