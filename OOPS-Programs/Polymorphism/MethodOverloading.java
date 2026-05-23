package org.snad.oops.Polimorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("Sum : "+calculator.add(2,3));
		System.out.println("Sum : "+calculator.add(2,3,5));
		System.out.println("Sum : "+calculator.add(2,3,5,5));
	}

}
class Calculator{
	
	public int add(int a , int b) {
		return a+b;
	}
	public int add(int a , int b, int c) {
		return a+b+c;
	}
	public int add(int a , int b , int c, int d) {
		return a+b+c+d;
	}
}
