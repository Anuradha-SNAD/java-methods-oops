package org.snad.oops.hasRelationaship;

public class Engine {
	private String type;
	private int capacity;
	
	
	public Engine(String type, int capacity) {
		this.type = type;
		this.capacity = capacity;
	}

	public void start() {
		System.out.println("Engine started...");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", capacity=" + capacity + "]";
	}
	
	

}
