package org.snad.oops.Interface;

public class SingleLevel {
	public static void main(String[] args) {
		System.out.println(Animal.name);
		Animal.sound();
		Dog dog = new Dog();
		dog.doSound();
		
	}

}

interface Animal{
	public static final String name = "Puppy";
	
	public static void sound() {
		System.out.println("Sound from Animal//static method");
	}
	
	public void doSound();
	
	
}
class Dog implements Animal{
	
	public void doSound() {
		System.out.println("DoSound method from dog...//Overridden");
	}
	
}
