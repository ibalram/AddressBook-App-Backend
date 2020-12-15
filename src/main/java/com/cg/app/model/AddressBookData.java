package com.cg.app.model;

import javax.persistence.Entity;

import com.cg.app.dto.AddressBookDTO;

import lombok.Data;

@Data
@Entity
public class AddressBookData {

	private Long id;
	private String fullName;
	private String address;
	private String state;
	private String city;
	private String zip;
	private String phoneNumber;

	public AddressBookData(long id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.fullName = addressBookDTO.fullName;
		this.address = addressBookDTO.address;
		this.state = addressBookDTO.state;
		this.city = addressBookDTO.city;
		this.zip = addressBookDTO.zip;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}

}
