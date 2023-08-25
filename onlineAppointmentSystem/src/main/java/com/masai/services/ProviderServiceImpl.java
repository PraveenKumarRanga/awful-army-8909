package com.masai.services;

import com.masai.dao.ProviderDao;
import com.masai.dao.ProviderDaoImpl;
import com.masai.entity.ServiceProvider;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;

public class ProviderServiceImpl implements ProviderService{

	@Override
	public void regProvider(ServiceProvider provider) throws DuplicateDataException {
		
		ProviderDao dao = new ProviderDaoImpl();
		dao.regProvier(provider);
		
	}

	@Override
	public void logIn(String username, String password) throws NoRecordFound {
		ProviderDao dao = new ProviderDaoImpl();
		dao.logIn(username, password);
		
	}

}
