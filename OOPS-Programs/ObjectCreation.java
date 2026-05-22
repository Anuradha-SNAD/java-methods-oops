package org.snad.oops;

public class ObjectCreation extends Object1 {
	public static void main(String[] args) {
		System.out.println(Object1.id); //calling class name as a reference
		Object1.child();
		
		//object Creation
		Object1 object1 = new Object1();
		System.out.println(object1.id); //calling object reference
		System.out.println(object1.address);
		System.out.println(object1.marks);
		object1.child();
		object1.parent();
		
	}

}
class Object1{
	static int id = 1;	 //static variable
	private static String name = "Ram";
	String address="Hyderabad"; 	//Non-static variable
	int marks = 99;
	
	public Object1() { //No-Argument Constructor
		
	}
	public Object1(int id,String name,String address,int marks) { //parameterized constructor
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	public static void child() {
		System.out.println("Playing...");
	}//static method
	
	public void parent() {
		System.out.println("Working...");
	}//non-static
	
	private static void child2() {
		System.out.println("Playing..2...");
	}//private static method
	
	private void parent2() {
		System.out.println("Working..2..");
	}//non-private static method
	
}
