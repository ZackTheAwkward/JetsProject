package com.skilldistillery.jets.entities;

public class FighterJet extends Jets{

	


	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}




	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Model: " + getModel() + ", Speed: "
				+ getSpeed() +  " MPH" + ", Range: " + getRange() + " miles" + ", Price: $" + getPrice();
	}


	

	@Override
	public void fly() {
		super.fly();
	}
	

}
