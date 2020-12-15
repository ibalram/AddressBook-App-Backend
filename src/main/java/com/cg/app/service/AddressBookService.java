package com.cg.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.app.dto.AddressBookDTO;
import com.cg.app.exceptions.AddressBookException;
import com.cg.app.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	private List<AddressBookData> addressBookList = new ArrayList<>();

	@Override
	public List<AddressBookData> getAllAddressBookData() {
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(Long id) {
		try {
			return addressBookList.get((int) (id - 1));
		}catch(Exception e) {
			throw new AddressBookException("Not Found");
		}
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = new AddressBookData(addressBookList.size() + 1, addressBookDTO);
		addressBookList.add(addressBookData);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(Long id, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = this.getAddressBookDataById(id);
		addressBookData.setFullName(addressBookDTO.fullName);
		addressBookData.setAddress(addressBookDTO.address);
		addressBookData.setCity(addressBookDTO.city);
		addressBookData.setState(addressBookDTO.state);
		addressBookData.setZip(addressBookDTO.zip);
		addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
		addressBookList.set((int) (id - 1), addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookDataById(Long id) {
		addressBookList.remove((int) (id - 1));
	}

}
