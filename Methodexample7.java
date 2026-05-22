package org.snad.methods;

import java.util.Scanner;

public class Methodexample7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to count ");
		int n1 = sc.nextInt();
		System.out.println("Count : "+countOfNumber(n1));
		
		System.out.println("enter the number to sum ");
		int n2 = sc.nextInt();
		System.out.println("Sum : "+sumOfNumber(n2));
		
		System.out.println("enter the number to reverse ");
		int n3 = sc.nextInt();
		System.out.println("Reverse : "+reverse(n3));
	}
	
	public static int countOfNumber(int a) {
		int count = 0;
		while(a>0) {
			a = a/10;
			count++;
		}
		return count;	
	}
	public static int sumOfNumber(int a) {
		int sum=0;
		while(a>0) {
			int digit = a%10;
			sum+=digit;
			a/=10;	
		}
		return sum;
	}
	public static int reverse(int a) {
		int reverse=0;
		while(a>0) {
			int digit = a % 10;
			reverse=reverse*10+digit;
			a/=10;
		}
		return reverse;
	}

}
