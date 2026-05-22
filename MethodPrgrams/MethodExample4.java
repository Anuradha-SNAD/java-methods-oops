package org.snad.methods;

import java.util.Scanner;

public class MethodExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		even(n);
		System.out.println("===========Non-static==============");
		System.out.println("Enter the 2nd number");
		int n2 = sc.nextInt();
		MethodExample4 methodExample4 = new MethodExample4();
		methodExample4.even2(n2);
		
	}
	public static void even(int a) {
		if(a % 2 == 0) {
			System.out.println("Given Number is Even Number");
		}else {
			System.out.println("Given Number is Odd Number");
		}
	}
	public void even2(int a) {
		if(a % 2 == 0) {
			System.out.println("Given Number is Even Number");
		}else {
			System.out.println("Given Number is Odd Number");
		}
		
	}

}
