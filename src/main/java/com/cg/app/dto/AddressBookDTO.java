package com.cg.app.dto;

public class AddressBookDTO {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phoneNumber;
	public String email;

	public AddressBookDTO(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ "]";
	}
	

}
