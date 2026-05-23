package org.snad.oops.hasRelationaship;

class Car{
	
	private String brand;
	private int cost;
	private Engine engine = new Engine("Electrical",50);	
	
	public Car(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
		 engine.start();
	}
	
	public void startCar() {
		System.out.println("Car Stared....");
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", cost=" + cost + "]";
	}
	
	
}

public class CarDriever {
	public static void main(String[] args) {
		Car car = new Car("Audi",200000);
		System.out.println(car);
		System.out.println(car.getEngine());
		car.startCar();
//		car.getEngine().start();
		
	}

}
