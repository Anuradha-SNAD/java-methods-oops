package org.snad.methods;

import java.util.Scanner;

public class MethodExample8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		strongNumber(n);
	}
	public static void strongNumber(int n) {
		int count=0;
		int originalNumber = n;
		while(n>0) {
			int digit = n % 10;
			int fact = 1;
			for(int i=1;i<=digit;i++) {
				fact = i*fact;
			}
			count=count+fact;
			n= n/10;
		}
		if(originalNumber == count) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong Number");
		}
	}

}
