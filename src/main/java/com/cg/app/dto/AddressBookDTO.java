package com.cg.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.ToString;

@ToString
public class AddressBookDTO {
	
	@NotEmpty
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}( [A-Z]{1}[a-zA-Z]{2,})*$", message = "Invalid Name")
	public String fullName;
	
	@Pattern(regexp = "^[a-zA-Z0-9-, ]+", message= "Invalid address")
	public String address;
	
	@NotBlank(message = "City is required")
	public String city;
	
	@NotBlank(message = "State is required")
	public String state;
	
	@Pattern(regexp = "^[0-9]{2,}", message = "Invalid zip number")
	public String zip;
	
	@Pattern(regexp = "^[0-9]{1,}[ ][1-9][0-9]{9}$", message = "Invalid phone number")
	public String phoneNumber;

}
