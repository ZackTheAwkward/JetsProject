package com.skilldistillery.jets.entities;

public class CargoCarrier extends Jets {
	private int capacity;

	public CargoCarrier() {
		super();
	}

	public CargoCarrier(String model, double speed, int range, long price, int capacity) {
		super(model, speed, range, price);
		this.capacity = capacity;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CargoCarrier [capacity=" + capacity + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public void fly() {
		super.fly();
	}
	
	
	
}
