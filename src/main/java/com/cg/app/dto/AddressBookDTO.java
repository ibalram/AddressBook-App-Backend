package com.cg.app.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	
	@NotEmpty
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}( [A-Z]{1}[a-zA-Z]{2,})*$", message = "Invalid Name")
	public String fullName;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phoneNumber;

	public AddressBookDTO(String fullName, String address, String city, String state, String zip,
			String phoneNumber) {
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [fullName=" + fullName + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}

}
