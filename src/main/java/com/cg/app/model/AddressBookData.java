package com.cg.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.app.dto.AddressBookDTO;

import lombok.Data;

@Data
@Entity
@Table(name = "address_book_data")
public class AddressBookData {
	private static final long serialVersionUID = 2L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "full_name")
	private String fullName;
	
	private String address;
	private String state;
	private String city;
	private String zip;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	public AddressBookData() {}

	public AddressBookData(AddressBookDTO addressBookDTO) {
        //this.id = id;
		this.fullName = addressBookDTO.fullName;
		this.address = addressBookDTO.address;
		this.state = addressBookDTO.state;
		this.city = addressBookDTO.city;
		this.zip = addressBookDTO.zip;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}

}
