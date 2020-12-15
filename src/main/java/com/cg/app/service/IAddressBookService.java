package com.cg.app.service;

import java.util.List;

import com.cg.app.dto.AddressBookDTO;
import com.cg.app.exceptions.AddressBookException;
import com.cg.app.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAllAddressBookData();

	AddressBookData getAddressBookDataById(Long id);

	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(Long id, AddressBookDTO addressBookDTO);

	void deleteAddressBookDataById(Long id);
}
