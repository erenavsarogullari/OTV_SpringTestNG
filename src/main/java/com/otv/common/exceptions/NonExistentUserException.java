package com.otv.common.exceptions;

/**
 * Non Existent User Exception
 * 
 * @author  Eren Avsarogullari
 * @since   19 May 2012
 * @version 1.0.0
 *
 */
public class NonExistentUserException extends Exception {

	private static final long serialVersionUID = 1L;

	public NonExistentUserException(String message) {
		super(message);
	}
	
}
