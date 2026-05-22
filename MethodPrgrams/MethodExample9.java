package org.snad.methods;

import java.util.Scanner;

public class MethodExample9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		armStrong(n);
		
	}
	
	public static void armStrong(int n) {
		 int original = n;
	     int digits = countDigits(n);
	     int sum = powerSum(n, digits);
		if(sum == original) {
			System.out.println("Arm Strong Number");
		}else {
			System.out.println("Not a Arm Strong Number");
		}
	}

	public static int countDigits(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	public static int powerSum(int a, int digits) {
		int sum =0;
		while(a>0) {
			int digit = a % 10;
			sum += (int)(Math.pow(digit, digits));
			a=a/10;
		}
		return sum;
	}

}
