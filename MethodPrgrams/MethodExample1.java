package org.snad.methods;

public class MethodExample1 {
	public static void main(String[] args) {
		print();
		MethodExample1 methodExample1 = new MethodExample1();
		methodExample1.print1();
	}
	
	public static void print() {
		System.out.println("Hello World From print");
	}
	public void print1() {
		System.out.println("Hello World From print1");
	}

}
