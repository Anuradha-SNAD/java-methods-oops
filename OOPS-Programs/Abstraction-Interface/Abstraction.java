package org.snad.oops.abstraction;

public class Abstraction {
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.stop();
		
	}

}
abstract class Vehicle{
	String brand;
	
	public abstract void start();
	
	public void stop() {
		System.out.println("Stop...");
	}
}
class Car extends Vehicle{
	
	Car(){
		super.stop();//calling parent class method
	}

	@Override
	public void start() {
		System.out.println("Car Stated...");
	}
	public void stop() {
		System.out.println("Car Stop..");
	}
}
