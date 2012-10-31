package com.otv.user.service;

import java.util.Collection;

import com.otv.common.exceptions.NonExistentUserException;
import com.otv.user.User;

/**
 * 
 * User Service Interface
 * 
 * @author  onlinetechvision.com
 * @since   19 May 2012
 * @version 1.0.0
 *
 */
public interface IUserService {
	
	/**
	 * Adds User
	 * 
	 * @param  User user
	 * @return boolean whether delete operation is success or not.
	 */
	boolean addUser(User user);
	
	/**
	 * Deletes User
	 * 
	 * @param  User user
	 * @return boolean whether delete operation is success or not.
	 */
	boolean deleteUser(User user);
	
	/**
	 * Updates User
	 * 
	 * @param  User user
	 * @throws NonExistentUserException 
	 */
	void updateUser(User user) throws NonExistentUserException;
	
	/**
	 * Gets User
	 * 
	 * @param  String User Id
	 * @return User
	 */
	User getUserById(String id);
	
	/**
	 * Gets User Collection
	 * 
	 * @return List - User list
	 */
	Collection<User> getUsers();
}
