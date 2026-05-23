package org.snad.oops.Interface;

public class Multilevel {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start();
		System.out.println(bike.brand);
	}

}
interface Vehicle{
	public static final String brand = "BMW";
	
	public void start();
	
}
class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Car Started...");
	}
	
}
class Bike extends Car{
	
	Bike(){
		super.start();
	}
	public void start() {
		System.out.println("Bike Stated...");
	}
}
