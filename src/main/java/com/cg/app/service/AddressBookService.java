package com.cg.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.app.dto.AddressBookDTO;
import com.cg.app.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<AddressBookData> getAllAddressBookData() {
		List<AddressBookData> addressBookList = new ArrayList<>();
		addressBookList.add(new AddressBookData(1, new AddressBookDTO("Balram", "Singh", "Jaipur", "Jaipur",
				"Rajasthan", "301234", "+91 9469091234", "balram@gmail.com")));
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(long id) {
		AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Balram", "Singh", "Jaipur",
				"Jaipur", "Rajasthan", "301234", "+91 9469091234", "balram@gmail.com"));
		return addressBookData;
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = new AddressBookData(2, addressBookDTO);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = new AddressBookData(2, addressBookDTO);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookDataById(long id) {

	}

}
