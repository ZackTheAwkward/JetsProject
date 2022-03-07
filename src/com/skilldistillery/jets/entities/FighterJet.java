package com.skilldistillery.jets.entities;

public class FighterJet extends Jets implements DogFight{

	


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




	@Override
	public void fight() {
		System.out.println("PEW PEW PEW PEW");
	}

	
}
