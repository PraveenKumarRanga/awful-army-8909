package com.masai.dao;

import com.masai.entity.Customer;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;

public interface CustomerDao {

	void regCustomer(Customer customer) throws DuplicateDataException;

	void loginCustomer(String username, String password) throws NoRecordFound;

}
