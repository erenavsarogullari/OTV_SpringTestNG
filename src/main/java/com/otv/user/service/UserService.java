package com.otv.user.service;

import java.util.Collection;
import com.otv.cache.service.ICacheService;
import com.otv.common.exceptions.NonExistentUserException;
import com.otv.user.User;

/**
 * 
 * User Service
 * 
 * @author  onlinetechvision.com
 * @since   19 May 2012
 * @version 1.0.0
 *
 */
public class UserService implements IUserService {
	
	//CacheService is injected...
	private ICacheService cacheService;
	
	/**
	 * Adds User
	 * 
	 * @param  User user
	 * @return boolean whether delete operation is success or not.
	 */
	public boolean addUser(User user) {
		
		getCacheService().getUserMap().put(user.getId(), user);
		if(getCacheService().getUserMap().get(user.getId()).equals(user)) {
			return true;
		}
		
		return false;
	}

	/**
	 * Deletes User
	 * 
	 * @param  User user
	 * @return boolean whether delete operation is success or not.
	 */
	public boolean deleteUser(User user) {
		User removedUser = getCacheService().getUserMap().remove(user.getId());
		if(removedUser != null) {
			return true;
		}
		return false;
	}
	
	/**
	 * Updates User
	 * 
	 * @param  User user
	 * @throws NonExistentUserException 
	 */
	public void updateUser(User user) throws NonExistentUserException {
		if(getCacheService().getUserMap().containsKey(user.getId())) {
			getCacheService().getUserMap().put(user.getId(), user);
		} else {
			throw new NonExistentUserException("Non Existent User can not update! User : "+user);			
		}
	}
	
	/**
	 * Gets User
	 * 
	 * @param  String User Id
	 * @return User
	 */
	public User getUserById(String id) {
		return getCacheService().getUserMap().get(id);
	}

	/**
	 * Gets User List
	 * 
	 * @return Collection - Collection of Users
	 */
	public Collection<User> getUsers() {	
		return (Collection<User>) getCacheService().getUserMap().values();
	}

	/**
	 * Gets Cache Service
	 * 
	 * @return ICacheService - Cache Service
	 */
	public ICacheService getCacheService() {
		return cacheService;
	}

	/**
	 * Sets Cache Service
	 * 
	 * @param ICacheService - Cache Service
	 */
	public void setCacheService(ICacheService cacheService) {
		this.cacheService = cacheService;
	}
	
}
