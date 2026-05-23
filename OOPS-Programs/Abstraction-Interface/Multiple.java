package org.snad.oops.Interface;

public class Multiple {
	public static void main(String[] args) {
		Cars cars = new Cars();
		System.out.println("< ====Vehicles Brand==== > "+cars.brand);
		System.out.println("< ====Vehicles Type==== > "+cars.type);
		cars.start();
		cars.stop();
		cars.engineStart();
		cars.engineStop();
		
	}

}
interface Vehicles{
	public static final String brand = "BMW";
	
	public void start();
	public void stop();
	
}
interface Engine{
	public static final String type = "Electrical";
	
	public void engineStart();
	public void engineStop();
	
}
class Cars implements Vehicles,Engine{

	@Override
	public void start() {
		System.out.println("Car stated...");
	}

	@Override
	public void stop() {
		System.out.println("Car Stopped...");
	}

	@Override
	public void engineStart() {
		System.out.println("Engine Started...");
	}

	@Override
	public void engineStop() {
		System.out.println("Engine Stopped...");
	}
	
}