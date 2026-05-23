package org.snad.oops.isARelationaship;

public class MultilevelInheritance {
	public static void main(String[] args) {
		Cat cat = new Cat("Puppy","Bull-dog","White","Black");
		System.out.println(cat);
		cat.sound();//parent
		cat.soundDog();//Dog
		cat.soundCat();//Cat
	}

}

class Animal1{
	String animalName;
	
	Animal1(String animalName){
		this.animalName = animalName ;
	}
	
	public void sound() {
		System.out.println("Sound From Animal...");
	}
}
class Dog1 extends Animal1{
	String breed;
	String color;
	
	public Dog1(String animalName,String breed, String color) {
		super(animalName);
		this.breed = breed;
		this.color = color;
	}
	
	public void soundDog() {
		System.out.println("Sound From Dog...");
	}

	@Override
	public String toString() {
		return "Dog1 [breed=" + breed + ", color=" + color + "]";
	}
}
class Cat extends Dog1 {
	String colorOfCat;

	public Cat(String animalName, String breed, String color,String colorOfCat) {
		super(animalName, breed, color);
		this.colorOfCat = colorOfCat ;	
	}
	
	public void soundCat() {
		System.out.println("Sound From Cat...");
	}

	@Override
	public String toString() {
		return "Cat [colorOfCat=" + colorOfCat + "]";
	}
	
	
}
