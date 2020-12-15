package com.cg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.model.AddressBookData;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Long> {

}
