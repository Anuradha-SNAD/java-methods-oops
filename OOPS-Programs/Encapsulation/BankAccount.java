package org.snad.oops;

import java.util.Scanner;

public class BankAccount {
	private double balance = 10000;
	
	public void deposite(double amount) {
		balance = balance+amount;
		System.out.println(amount + " deposited successfully. ");
		System.out.println("total balance = "+balance);
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance = balance-amount;
			System.out.println(amount + " withdrawn successfully");
			System.out.println("total balance = "+balance);
		}else {
			System.out.println("Insufficient Balance");
			System.out.println("total balance = "+balance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "BankAccount [ balance = "+balance+"]";
	}

}

class BankDriver{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();
		System.out.println("Welcome to the bank....");
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Balance");
		
		int n = sc.nextInt();
		switch (n) {
		case 1: {
			System.out.println("enter the amount how much you want to deposite : ");
			int amount = sc.nextInt();
			bankAccount.deposite(amount);
			break;
		}
		case 2: {
			System.out.println("enter the amount how much you want to withdraw : ");
			int amount = sc.nextInt();
			bankAccount.withdraw(amount);
			break;
		}
		case 3:{
			System.out.println("Total balance = "+ bankAccount.getBalance());
			break;
		}
		default:
			System.out.println("Invalid Option..! choose correct one");
		}
		
	}
}
