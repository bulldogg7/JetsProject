package com.skilldistillery.jets.entities;

public abstract class Jet {

	// Fields
	protected String model;
	protected int speedInMph;
	protected int range;
	protected long price;

	// No Argument Constructor
	public Jet() {
	}

	// Constructor
	public Jet(String model, int speedInMph, int range, long price) {
		super();
		this.model = model;
		this.speedInMph = speedInMph;
		this.range = range;
		this.price = price;
	}

	// Getters & Setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeedInMph() {
		return speedInMph;
	}
	public void setSpeedInMph(int speedInMph) {
		this.speedInMph = speedInMph;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	// Methods
	public void fly() {
		double flyTime = range/speedInMph;
		// Override in Each Subclass
		if (range == 0 || speedInMph == 0) {
			System.out.println("This Aircraft is Grounded!");
		} else {
				System.out.println(getModel() + " is Flying & has a Flight Capacity of " + flyTime);
			}
		}
	public double getSpeedInMach() {
		double speedInMach = speedInMph/750;
		return speedInMach;
	}

	// toString Last
	@Override
	public String toString() {
		return "Jet [model=" + model + ", speedInMph=" + speedInMph 
				+ ", range=" + range + ", price=" + price + "]";
	}
}