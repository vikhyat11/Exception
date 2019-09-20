package com.cg.exception;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
;

@ControllerAdvice
public class TDSServiceErrorAdvice
{
	@ResponseBody
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value=TDSNotFoundException.class)
	protected ErrorInfo handle(Exception e, HttpServletRequest request)
	{
		String message=e.getMessage();
		String details="uri=" +request.getServletPath();
		return new ErrorInfo(LocalDateTime.now().toString(),details,message);
	}
	
}
