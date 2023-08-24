package com.masai.services;

import com.masai.entity.Customer;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;

public interface CustomerService {

	void regCustomer(Customer customer) throws DuplicateDataException;

	void logIn(String username, String password) throws NoRecordFound;

}
