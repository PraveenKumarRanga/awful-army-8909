package com.masai.services;

import com.masai.entity.ServiceProvider;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;

public interface ProviderService {

	void regProvider(ServiceProvider provider) throws DuplicateDataException;

	void logIn(String username, String password) throws NoRecordFound;

}
