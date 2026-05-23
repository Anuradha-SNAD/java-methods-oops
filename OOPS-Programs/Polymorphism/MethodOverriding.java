package org.snad.oops.Polimorphism;

public class MethodOverriding {
	public static void main(String[] args) {
		Animal dog = new Dog("Puppy","Bull-Dog");
		System.out.println(dog);
		dog.sound();
	}

}
class Animal{
	String name;
	
	 Animal( String name ){
		 this.name = name;
	 }
	public void sound() {
		System.out.println("sound from animal class..");
	}
	
	public String toString() {
		return "Animal[ name = "+name+"]";
	}
	
}
class Dog extends Animal{
	String breed;
	
	Dog( String name,String breed){
		super(name);
//		super.sound();
		this.breed = breed;
	}
	
	public void sound() {
		System.out.println("sound from dog class...");
	}
	public String toString() {
		return "Dog[ name = "+name+" , breed = "+breed+"]";
	}
}
