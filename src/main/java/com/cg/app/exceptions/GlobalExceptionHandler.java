package com.cg.app.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.app.dto.ResponseDTO;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseDTO> handleMethodArgumentException(MethodArgumentNotValidException exception) {
		List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
		List<String> errMsg = errorList.stream().map(errObj -> errObj.getDefaultMessage()).collect(Collectors.toList());
		ResponseDTO respDTO = new ResponseDTO("Exceptions during REST call", errMsg);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AddressBookException.class)
	public final ResponseEntity<ResponseDTO> handleAddressBookException(AddressBookException exception){
		ResponseDTO respDTO = new ResponseDTO("Exception during REST call", exception.getMessage());
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ResponseDTO> anonymousException(Exception e) {
		ResponseDTO status = new ResponseDTO("Exception during REST call", e.getMessage());
		return new ResponseEntity<ResponseDTO>(status, HttpStatus.BAD_REQUEST);
	}
}
