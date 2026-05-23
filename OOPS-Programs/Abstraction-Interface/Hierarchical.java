package org.snad.oops.Interface;

public class Hierarchical {
	public static void main(String[] args) {
		Dogs dogs = new Dogs();
		Cat cat = new Cat();
		dogs.sound();
		cat.sound();
		
	}
}
interface Animals{
	
	public void sound();
	
}
class Dogs implements Animals{

	@Override
	public void sound() {
		System.out.println("Sound from Dogs...");
	}
	
}
class Cat implements Animals{

	@Override
	public void sound() {
		System.out.println("Sound from Cat...");
	}
	
}
