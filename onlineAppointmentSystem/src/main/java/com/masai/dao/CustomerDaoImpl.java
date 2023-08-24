package com.masai.dao;

import java.util.List;

import com.masai.entity.Customer;
import com.masai.entity.LoggedIn;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;
import com.masai.utility.EMUtils;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public void regCustomer(Customer customer) throws DuplicateDataException {
		
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			
			em = EMUtils.getEntityManager();
			et = em.getTransaction();
			
			Query query = em.createQuery("SELECT COUNT(c) FROM Customer c WHERE email = :email");
						 query.setParameter("email", customer.getEmail());
						
			if((long) query.getSingleResult()>0) {
				throw new DuplicateDataException("***********Customer already exists**********");
			}
			
			et.begin();
			
			em.persist(customer);
			
			et.commit();
			
		}catch(IllegalStateException | EntityExistsException e) {
			System.out.println(e.getMessage());
		}finally {
			em.close();
		}
		
	}


	@Override
	public void loginCustomer(String username, String password) throws NoRecordFound {
		
		EntityManager em = null;
		
		try {
			
			em = EMUtils.getEntityManager();
			
			Query query = em.createQuery("SELECT c.id FROM Customer c WHERE username = :un AND password = :pw");
			
			query.setParameter("un", username);
			query.setParameter("pw", password);
			
			List<Integer> list = query.getResultList();
			
			if(list.size() == 0) {
				throw new NoRecordFound("************ User not found************");
			}
			
			LoggedIn.userId = list.get(0);
			
		}catch(IllegalStateException | EntityExistsException e) {
			System.out.println(e.getMessage());
		}finally {
			em.close();
		}
		
	}

}
