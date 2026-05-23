package org.snad.oops.isARelationaship;

public class SingleInheritance {
	public static void main(String[] args) {
		Dog dog = new Dog("Puppy","Bulldog","White");
		System.out.println(dog);
		System.out.println(dog.name);
		dog.sound();//parent class
		dog.doSound();//child class
	}

}

class Animal {
	String name;
	
	Animal(String name){
		this.name = name ;
	}
	
	public void sound() {
		System.out.println("Sound From Animal...");
	}
	
}
class Dog extends Animal{
	String breed;
	String color;
	
	public Dog(String name,String breed, String color) {
		super(name);
		this.breed = breed;
		this.color = color;
	}
	
	public void doSound() {
		System.out.println("Sound From Dog");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", color=" + color + "]";
	}
	
	
}
