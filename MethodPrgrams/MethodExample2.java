package org.snad.methods;

public class MethodExample2 {
	public static void main(String[] args) {
		System.out.println(add1(20,30));
		//to access non-static method object creation is mandatory
		MethodExample2 methodExample2 = new MethodExample2();
		System.out.println(methodExample2.add2(50, 50));
	}
	public static int add1(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public int add2(int a, int b) {
		int sum=a+b;
		return sum;
	}

}
