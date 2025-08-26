package com.spring.Learning.Spring_Learning.Model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

    private String message;
    private HttpStatus status;

    //  Proper constructor that sets the values
    public ErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ErrorMessage [message=" + message + ", status=" + status + "]";
    }
}
