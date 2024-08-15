package com.project.examportalbackend.services.exception;

public class CategoryNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CategoryNotFoundException(String message) {
        super(message);
    }
}
