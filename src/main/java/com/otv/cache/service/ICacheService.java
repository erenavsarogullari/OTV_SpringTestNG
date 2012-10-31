package com.otv.cache.service;

import java.util.concurrent.ConcurrentHashMap;

import com.otv.user.User;

/**
 * Cache Service Interface
 * 
 * @author  onlinetechvision.com
 * @since   19 May 2012
 * @version 1.0.0
 *
 */
public interface ICacheService {

   /**
	 * Gets User Map
	 * 
	 * @return ConcurrentHashMap User Map
	 */
	ConcurrentHashMap<String, User> getUserMap();
	
}
