package com.estockMarket.companyService.model;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ErrorMessage {
	
	private HttpStatus httpStatus;
	private String message;
	private List<String> errors;
	public ErrorMessage() {
		super();
	}
	public ErrorMessage(HttpStatus httpStatus, String message, List<String> errors) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
		this.errors = errors;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

}
