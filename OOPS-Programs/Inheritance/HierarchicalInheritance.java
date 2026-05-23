package org.snad.oops.isARelationaship;

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		System.out.println("=====Car Methods======");
		car.start();//parent
		car.startCar();//child
		
		System.out.println("=====Bike Methods======");
		bike.start();//parent
		bike.startBike();//child
	}

}
class Vehicle{
	String brand;
	
	public void start() {
		System.out.println("Vehicle Stared...");
	}
}
class Car extends Vehicle{
	int carTyres;
	
	public void startCar() {
		System.out.println("Car Stared...");
	}
}
class Bike extends Vehicle{
	int bikeTyres;
	
	public void startBike() {
		System.out.println("Bike Started...");
	}
	
}
