package com.masai.ui;

import java.util.Scanner;

import com.masai.entity.ServiceProvider;
import com.masai.exception.DuplicateDataException;
import com.masai.services.ProviderService;
import com.masai.services.ProviderServiceImpl;

public class ServiceProviderUI {

	public static void registerProvider(Scanner sc) {
		
		System.out.println("Enter email");
		String email = sc.next();
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		ServiceProvider provider = new ServiceProvider(email, username, password);
		ProviderService service = new ProviderServiceImpl();
		
		try {
			service.regProvider(provider);
			System.out.println("===================================================");
			System.out.println("  Representative account registered successfully");
			System.out.println("===================================================");
		
		}
		catch(DuplicateDataException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
