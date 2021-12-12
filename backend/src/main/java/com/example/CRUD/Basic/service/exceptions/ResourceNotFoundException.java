package com.example.CRUD.Basic.service.exceptions;



public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1l;
	
	public ResourceNotFoundException (String msg) {
		super(msg);
	}
}
