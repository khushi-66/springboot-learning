package com.isrdc.exceptions;

import javax.management.RuntimeErrorException;

public class UnIdentifiedUserException  extends RuntimeException {

	public UnIdentifiedUserException(String msg) {
		super(msg);
	}

	
	
}
