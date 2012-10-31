package com.otv.cache.service;

import java.util.concurrent.ConcurrentHashMap;

import com.otv.user.User;

/**
 * Cache Service Implementation
 * 
 * @author  onlinetechvision.com
 * @since   19 May 2012
 * @version 1.0.0
 *
 */
public class CacheService implements ICacheService {

	//User Map is injected...
	private ConcurrentHashMap<String, User> userMap;

	/**
	 * Gets User Map
	 * 
	 * @return ConcurrentHashMap User Map
	 */
	public ConcurrentHashMap<String, User> getUserMap() {
		return userMap;
	}

	/**
	 * Sets User Map
	 * 
	 * @param ConcurrentHashMap User Map
	 */
	public void setUserMap(ConcurrentHashMap<String, User> userMap) {
		this.userMap = userMap;
	}
		
}
