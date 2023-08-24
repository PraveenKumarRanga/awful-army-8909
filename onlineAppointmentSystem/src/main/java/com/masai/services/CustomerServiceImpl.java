package com.masai.services;

import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.entity.Customer;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public void regCustomer(Customer customer) throws DuplicateDataException {
		
		CustomerDao dao = new CustomerDaoImpl();
		dao.regCustomer(customer);

	}

	@Override
	public void logIn(String username, String password) throws NoRecordFound {
		
		CustomerDao dao = new CustomerDaoImpl();
		dao.loginCustomer(username,password);
		
	}

}
