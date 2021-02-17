package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Account client;
		
		System.out.print("Enter account number: ");
		int accountNumber = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolder = input.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = input.next().charAt(0);
		System.out.println();
		
		if (answer == 'y') {
			System.out.print("Enter the initial deposit value: ");
			client = new Account(accountHolder,accountNumber, input.nextDouble());;
		}
		else {
			client = new Account(accountHolder,accountNumber);
		}
		
		
		System.out.printf("Account data:%n" + client.toString() + "%nEnter a deposit value: ");	
		
		client.deposit(input.nextDouble());
		
		System.out.printf("Update account data:%n%s%n", client);
		
		System.out.print("Enter a withdraw value: ");	
		
		client.withdraw(input.nextDouble());
		
		System.out.printf("Update account data:%n%s%n%n", client);
		
		input.close();

	}

}
