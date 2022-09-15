package com.xworkz.customexceptiontask.exception;

public class LimitExceedException extends RuntimeException {
	
	public LimitExceedException(String msg) {
		super(msg);
	}

}
