package com.skilldistillery.jets.entities;

public class JetImpl extends Jets {

	public JetImpl() {
		super();
	}

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JetImpl [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + "]";
	}

	@Override
	public void fly() {
		super.fly();
	}

	
}
