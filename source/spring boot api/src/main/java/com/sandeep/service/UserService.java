package com.sandeep.service;

import java.util.List;

import com.sandeep.exception.UserException;
import com.sandeep.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
