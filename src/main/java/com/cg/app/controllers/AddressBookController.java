package com.cg.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.dto.AddressBookDTO;
import com.cg.app.dto.ResponseDTO;
import com.cg.app.model.AddressBookData;
import com.cg.app.service.IAddressBookService;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

	@Autowired
	IAddressBookService addressBookService;

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		List<AddressBookData> addressDataList = addressBookService.getAllAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Successfull", addressDataList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("id") Long id) {
		AddressBookData addressData = null;
		addressData = addressBookService.getAddressBookDataById(id);
		ResponseDTO respDTO = new ResponseDTO("Get Call Success for id: " + id, addressData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressData = null;
		addressData = addressBookService.createAddressBookData(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Successfully for: " + addressBookDTO, addressData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable Long id,
			@Valid @RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressData = null;
		addressData = addressBookService.updateAddressBookData(id, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Successfully for: " + addressBookDTO, addressData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") Long id) {
		addressBookService.deleteAddressBookDataById(id);
		ResponseDTO respDTO = new ResponseDTO("Delete Successfully for id: " + id, id);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

}
