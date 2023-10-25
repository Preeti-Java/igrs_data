/**
 * 
 */
package com.cg.neel.igrs.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.neel.igrs.exceptions.SearchingCredentialException;
import com.cg.neel.igrs.utils.GenericResponse;

/**
 * @author Preeti
 * @Des Handle all the User related Exception
 *
 */
@RestControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler{
	
	@Autowired
	private MessageSource messageSource;
	
	@ExceptionHandler({ UsernameNotFoundException.class })
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> handleUsernameNotFoundException(final RuntimeException ex, final WebRequest request){
		final GenericResponse bodyResponse = new GenericResponse(messageSource.getMessage("", null, request.getLocale()));
		return handleExceptionInternal(ex, bodyResponse, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
		
	}
	
	@ExceptionHandler({ SearchingCredentialException.class })
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<Object> handleSearchingCredentialException(final SearchingCredentialException ex, final WebRequest request) {
		final GenericResponse bodyResponse = new GenericResponse(messageSource.getMessage("message.searchingCredentialsException", null, request.getLocale()));
		return handleExceptionInternal(ex, bodyResponse, new HttpHeaders(), HttpStatus.OK, request);
	}
	
	
}
