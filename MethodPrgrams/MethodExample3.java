package org.snad.methods;

import java.util.Scanner;

public class MethodExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		System.out.println("Given number square is : "+square(n));
		System.out.println("===============================");
		//non-static
		System.out.println("enter the 2nd number : ");
		int n2 = sc.nextInt();
		MethodExample3 example3 = new MethodExample3();
		System.out.println("Given number square is : "+example3.square2(n2));
		
	}
	
	public static int square(int a) {
		return a*a;
	}
	public  int square2(int a) {
		return a*a;
	}

}
