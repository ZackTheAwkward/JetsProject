package com.skilldistillery.jets.entities;

public class CargoCarrier extends Jets implements CargoCarrierInterface {

	public CargoCarrier() {
		super();
	}

	public CargoCarrier(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "Model: " + getModel() + " Speed: " + getSpeed()
				+ " Range: " + getRange() + " Price: " + getPrice();
	}


	public void fly() {
		super.fly();
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
