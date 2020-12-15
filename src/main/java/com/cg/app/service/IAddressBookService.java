package com.cg.app.service;

import java.util.List;

import com.cg.app.dto.AddressBookDTO;
import com.cg.app.model.AddressBookData;

public interface IAddressBookService {
	
	List<AddressBookData> getAllAddressBookData();

	AddressBookData getAddressBookDataById(long id);

	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO);

	void deleteAddressBookDataById(long id);
}
