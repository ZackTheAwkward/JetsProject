package com.skilldistillery.jets.entities;

public class FighterJet extends Jets{
	private int missileCapacity;

	public FighterJet(String model, double speed, int range, long price, int missileCapacity2) {
		super();
	}

	public FighterJet(int missileCapacity) {
		super();
		this.missileCapacity = missileCapacity;
	}

	@Override
	public String toString() {
		return "FighterJet [missileCapacity=" + missileCapacity + ", getModel()=" + getModel() + ", getSpeed()="
				+ getSpeed() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

	public int getMissileCapacity() {
		return missileCapacity;
	}

	public void setMissileCapacity(int missileCapacity) {
		this.missileCapacity = missileCapacity;
	}

	@Override
	public void fly() {
		super.fly();
	}
	

}
