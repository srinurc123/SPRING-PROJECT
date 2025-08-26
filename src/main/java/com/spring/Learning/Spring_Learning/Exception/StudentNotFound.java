package com.spring.Learning.Spring_Learning.Exception;

public class StudentNotFound extends Exception {

    // Default constructor
    public StudentNotFound() {
        super();
    }

    // Constructor with custom message
    public StudentNotFound(String message) {
        super(message);
    }

    // Constructor with cause
    public StudentNotFound(Throwable cause) {
        super(cause);
    }
    
    public StudentNotFound(String message, Throwable cause) {
        super(message, cause);
    }
    
    protected StudentNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
