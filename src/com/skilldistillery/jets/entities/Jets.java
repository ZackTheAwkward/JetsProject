package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jets {
	private String model;
	private double speed;
	private int range;
	private long price;

	public Jets() {
		super();
	}

	public Jets(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	
	
	
@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jets other = (Jets) obj;
		return Objects.equals(model, other.model) && price == other.price && range == other.range
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

public void fly() {
	double time;
	// Range in miles/ Speed per hour should equal time in air.
	time = range/ speed;
	System.out.println(toString() + " "  + "Flight Time " + String.format("%.2f", time) + " hours");
	System.out.println();
	
}
	
	
}
