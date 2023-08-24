package com.masai.ui;

import java.util.Scanner;

import com.masai.entity.Customer;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;
import com.masai.services.CustomerService;
import com.masai.services.CustomerServiceImpl;

public class CustomerUI {

	public static void registerCustomer(Scanner sc) {
		
		System.out.println("Enter email");
		String email = sc.next();
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		Customer customer = new Customer(email, username, password);
		CustomerService service = new CustomerServiceImpl();
		
		try {
			service.regCustomer(customer);
			System.out.println("======================================================");
			System.out.println("          Customer Registered successfully");
			System.out.println("======================================================");
		
		} catch (DuplicateDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void loginCustomer(Scanner sc) {
		
		System.out.println("Enter registered username");
		String username = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		CustomerService service = new CustomerServiceImpl();
		
		
		
		try {
			service.logIn(username, password);
			customerMenu(sc);
		}catch(NoRecordFound e) {
			e.getMessage();
		}
		
		
	}

	public static void customerMenu(Scanner sc) {
		
		int choice;
		
		do {
			
			
			
			
			
			choice = sc.nextInt();
		}while(choice!=0);
		
	}

}
