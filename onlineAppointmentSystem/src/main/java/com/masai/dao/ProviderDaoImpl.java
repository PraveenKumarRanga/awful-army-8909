package com.masai.dao;

import java.util.List;

import com.masai.entity.LoggedIn;
import com.masai.entity.ServiceProvider;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;
import com.masai.utility.EMUtils;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class ProviderDaoImpl implements ProviderDao{

	@Override
	public void regProvier(ServiceProvider provider) throws DuplicateDataException {
		
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			
			em = EMUtils.getEntityManager();
			et = em.getTransaction();
			
			Query query = em.createQuery("SELECT COUNT(P) FROM ServiceProvider p WHERE email = :email");
							query.setParameter("email", provider.getEmail());
							
			if((long) query.getSingleResult()>0) {
				throw new DuplicateDataException("----------- Service provider already exists -------------");
				
			}
			
			et.begin();
			
			em.persist(provider);
			
			et.commit();
			
		}catch(EntityExistsException | IllegalStateException e) {
			System.out.println(e.getMessage());
		}finally {
			em.close();
		}
		
	}

	@Override
	public void logIn(String username, String password) throws NoRecordFound {
		
		EntityManager em = null;
		
		try {
			
			em = EMUtils.getEntityManager();
			
			Query query = em.createQuery("SELECT p.id FROM ServiceProvider p WHERE username = :un AND password = :pw");
			
			query.setParameter("un", username);
			query.setParameter("pw", password);
			
			List<Integer> list = query.getResultList();
			
			if(list.size()==0) {
				throw new NoRecordFound("----------- User Not Found -------------");
				
			}
			LoggedIn.userId = list.get(0);
			
		}catch(IllegalStateException | EntityExistsException e) {
			System.out.println(e.getMessage());
		}finally {
			em.close();
		}
		
	}

}
