package com.spring.Learning.Spring_Learning.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.spring.Learning.Spring_Learning.Model.ErrorMessage;

@ControllerAdvice
@ResponseStatus
public class RestEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<ErrorMessage> studentNotFound(StudentNotFound exception) {
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}
