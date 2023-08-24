package com.masai.ui;

import java.util.Scanner;

import com.masai.entity.ServiceProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        do {
        	
        	System.out.println("=====================================================");
    		System.out.println("| Press 1 to register customer                      |");
        	System.out.println("| Press 2 to login customer                         |");
        	System.out.println("| Press 3 to register service provider              |");
        	System.out.println("| Press 4 to login service provider                 |");
        	System.out.println("| Press 0 to logout                                 |");
        	System.out.println("=====================================================");
        	
        	System.out.println("Enter your choice : ");
        	choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1:
        		CustomerUI.registerCustomer(sc);
        		break;
        	case 2: 
        		CustomerUI.loginCustomer(sc);
        		break;
        	case 3:
        		ServiceProviderUI.registerProvider(sc);
        		break;
        	case 4:
//        		ServiceProviderUI.loginProvider(sc);
        		break;
        	case 0:
        		System.out.println("=====================================================");
        		System.out.println("             Thankyou visit again");
        		System.out.println("=====================================================");
        		break;
        	default:
        		System.out.println("*****************************************************");
        		System.out.println("             Please enter valid choice");
        		System.out.println("*****************************************************");
        	
        	}
        	
        }while(choice != 0);
    }
}
