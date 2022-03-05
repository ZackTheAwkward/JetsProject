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
		return " Model = " + getModel() + ", Speed = " + getSpeed() + ", Range = " + getRange()
				+ ", Price = " + getPrice();
	}

	@Override
	public void fly() {
		super.fly();
	}

	
}
