package org.snad.methods;

import java.util.Scanner;

public class MethodExample10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter inputs");
		int n = sc.nextInt();
		
		if(n == 1) {
			int a = sc.nextInt();
			add(a);
		}else if(n ==2) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			add(a,b);
		}else if(n ==3){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			add(a,b,c);
		}else {
			System.out.println("invalid input");
		}
		
	}
	
	public static void add(int a) {
		System.out.println(a);
	}
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	


}
