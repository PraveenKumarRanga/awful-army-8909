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
			System.out.println("=============================================================");
			System.out.println("| Press 1 view available slots and provider                  |");
			System.out.println("| Press 2 view my appointments                               |");
			System.out.println("| Press 3 book an appointment                                |");
			System.out.println("| Press 4 cancel appointment                                 |");
			System.out.println("| Press 5 change password                                    |");
			System.out.println("| Press 6 delete account                                     |");
			System.out.println("| Press 7 give rating & feedback                             |");
			System.out.println("| Press 0 log_out                                            |");
			System.out.println("=============================================================");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				veiwAvailability();
				break;
			case 2:
				viewAppointment();
				break;
			case 3:
				bookAppointment();
				break;
			case 4:
				cancelAppointment();
				break;
			case 5:
				changePassword();
				break;
			case 6:
				deleteAccount();
				break;
			case 7:
				ratingFeedback();
				break;
			case 0:
				System.out.println("=============================================================");
				System.out.println("                 Thank you, visit again...");
				System.out.println("=============================================================");
				break;
			default:
				System.out.println("=============================================================");
				System.out.println("               Please enter valid choice...");
				System.out.println("=============================================================");
				
				
			}
			
			
		}while(choice!=0);
		
	}

	public static void ratingFeedback() {
		// TODO Auto-generated method stub
		
	}

	public static void deleteAccount() {
		// TODO Auto-generated method stub
		
	}

	public static void changePassword() {
		// TODO Auto-generated method stub
		
	}

	public static void cancelAppointment() {
		// TODO Auto-generated method stub
		
	}

	public static void bookAppointment() {
		// TODO Auto-generated method stub
		
	}

	public static void viewAppointment() {
		// TODO Auto-generated method stub
		
	}

	public static void veiwAvailability() {
		
		
	}

}
