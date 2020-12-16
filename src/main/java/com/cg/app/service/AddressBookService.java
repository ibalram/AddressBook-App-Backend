package com.cg.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.dto.AddressBookDTO;
import com.cg.app.exceptions.AddressBookException;
import com.cg.app.model.AddressBookData;
import com.cg.app.repository.AddressBookRepository;

@Service
public class AddressBookService implements IAddressBookService {

	@Autowired
	private AddressBookRepository addressBookRepository;

	@Override
	public List<AddressBookData> getAllAddressBookData() {
		return addressBookRepository.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public AddressBookData getAddressBookDataById(Long id) {
		try {
			return addressBookRepository.findById(id).get();
		} catch (Exception e) {
			throw new AddressBookException("Not Found");
		}
	}

	@Override
	public AddressBookData getAddressBookDataByName(String name) {
		List<AddressBookData> dataList = addressBookRepository.findByFullName(name);
		if (dataList.size() == 0)
			throw new AddressBookException("Not Found");
		return dataList.get(0);
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		List<AddressBookData> dataList = addressBookRepository.findByFullName(addressBookDTO.fullName);
		if (dataList.size() > 0)
			throw new AddressBookException("Already Exist with the same name");
		AddressBookData addressBookData = new AddressBookData(addressBookDTO);
		addressBookRepository.save(addressBookData);
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
		addressBookRepository.save(addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookDataById(Long id) {
		AddressBookData addressBookData = this.getAddressBookDataById(id);
		addressBookRepository.deleteById(addressBookData.getId());
	}

}
