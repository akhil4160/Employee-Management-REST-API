package com.akhil.employeemanagementapi.exception;

import com.akhil.employeemanagementapi.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)

    @ResponseStatus(HttpStatus.NOT_FOUND)

    public ErrorResponse handleEmployeeNotFound(

            EmployeeNotFoundException ex) {

        return new ErrorResponse(

                ex.getMessage(),

                404

        );

    }
}
