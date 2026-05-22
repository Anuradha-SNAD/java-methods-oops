package org.snad.methods;

import java.util.Scanner;

public class MethodExample6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println("The factors of number is ");
		factors(n);
		System.out.println();
		System.out.println("==========Factorial==============");
		System.out.println("enter the 2nd number");
		int n1 = sc.nextInt();
		factorial(n1);
	}
	
	public static void factors(int a) {
		for(int i=1;i<=a;i++) {
			if(a % i == 0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void factorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of number is "+ fact);
	}

}
