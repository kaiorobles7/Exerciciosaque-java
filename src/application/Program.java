package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Account;
import exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit= sc.nextDouble();
		System.out.println();
		
		Account account = new Account(number, name, balance, withdrawLimit);
		System.out.print("Enter amount for withdraw: ");
		balance = sc.nextDouble();
		account.withdraw(balance);
		System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		} catch(DomainException e) {
		System.out.println(e.getMessage());
		} catch(InputMismatchException e) {
		System.out.println("Entada de dados inválida!");
		} catch (RuntimeException e) {
		System.out.println("Erro inesperado! " + e.getMessage());

		}
		
	
		sc.close();
	}
}