package com.cg.app.model;

import com.cg.app.dto.AddressBookDTO;

public class AddressBookData {

	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String city;
	private String zip;
	private String phoneNumber;
	private String email;

	public AddressBookData(long id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
		this.address = addressBookDTO.address;
		this.state = addressBookDTO.state;
		this.city = addressBookDTO.city;
		this.zip = addressBookDTO.zip;
		this.phoneNumber = addressBookDTO.phoneNumber;
		this.email = addressBookDTO.email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressBookData [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", state=" + state + ", city=" + city + ", zip=" + zip + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}

}
