package org.snad.methods;

import java.util.Scanner;

public class MethodExample5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 2 numbers");
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		largest(n1, n2);
		
		System.out.println("=============Non-Static===============");
		System.out.println("enter the 2 numbers");
		int n3= sc.nextInt();
		int n4 = sc.nextInt();
		MethodExample5 methodExample5 = new MethodExample5();
		methodExample5.largest2(n3, n4);
	}
	
	public static void largest(int a, int b) {
		if(a>b) {
			System.out.println("The Largest number is : "+a);
		}else {
			System.out.println("The Largest number is : "+b);
		}
	}
	
	public void largest2(int a,int b) {
		if(a>b) {
			System.out.println("The Largest number is : "+a);
		}else {
			System.out.println("The Largest number is : "+b);
		}
		
	}

}
