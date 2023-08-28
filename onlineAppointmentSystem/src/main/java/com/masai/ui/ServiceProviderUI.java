package com.masai.ui;

import java.util.Scanner;

import com.masai.entity.ServiceProvider;
import com.masai.exception.DuplicateDataException;
import com.masai.exception.NoRecordFound;
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
			System.out.println("============================================================");
			System.out.println("  Service Provider account registered successfully");
			System.out.println("============================================================");
		
		}
		catch(DuplicateDataException e) {
			System.out.println("Service provider already exists");
		}
	}

	public static void loginProvider(Scanner sc) {
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		ProviderService service = new ProviderServiceImpl();
		
		try {
			
			service.logIn(username, password);
			providerMenu(sc);
			
		}catch(NoRecordFound e) {
			System.out.println("Please enter valid username and password...");
			
		}
		
		
	}

	public static void providerMenu(Scanner sc) {
		
		int choice;
	do {
		
		System.out.println("===================================================================================");
		System.out.println("| Press 1 view appointment details with customer details                          |");
		System.out.println("| Press 2 Set up availability and working hours with service informantion         |");
		System.out.println("| Press 3 open available slots for appointment                                    |");
		System.out.println("| Press 4 view feedback                                                           |");
		System.out.println("| Press 5 delete account                                                          |");
		System.out.println("| Press 6 change password                                                         |");
		System.out.println("| Press 0 logOut                                                                  |");
		System.out.println("===================================================================================");
		
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			viewAppointments();
			break;
		case 2:
			setAvaillability(sc);
			break;
		case 3:
			openSlots(sc);
			break;
		case 4:
			viewFeedback();
			break;
		case 5:
			deleteAccount(sc);
			break;
		case 6:
			changePassword(sc);
			break;
		case 0:
			System.out.println("Thank you, visit again...");
			break;
		default:
			System.out.println("Enter valid choice...");
		}
	}while(choice!=0);
	}

	
	// methods for menu
	
	
	private static void changePassword(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void deleteAccount(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void viewFeedback() {
		// TODO Auto-generated method stub
		
	}

	private static void openSlots(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void setAvaillability(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void viewAppointments() {
		// TODO Auto-generated method stub
		
	}
	
	
}
