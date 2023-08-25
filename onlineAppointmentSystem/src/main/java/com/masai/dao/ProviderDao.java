package com.masai.dao;

import com.masai.entity.ServiceProvider;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;

public interface ProviderDao {

	void regProvier(ServiceProvider provider) throws DuplicateDataException;

	void logIn(String username, String password) throws NoRecordFound;

}
