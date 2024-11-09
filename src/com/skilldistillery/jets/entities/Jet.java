package com.skilldistillery.jets.entities;

import java.text.DecimalFormat;

public abstract class Jet {
	DecimalFormat twoDecimals = new DecimalFormat("0.00");
	DecimalFormat noDecimals = new DecimalFormat("0");
	DecimalFormat commas = new DecimalFormat("#,###");

	// Fields
	protected String model;
	protected int speedInMph;
	protected double range;
	protected double price;

	// No Argument Constructor
	public Jet() {
	}

	// Constructor
	public Jet(String model, int speedInMph, double range, double price) {
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
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSpeedInMach() {
		double speedInMach = speedInMph / 750.0;
		return speedInMach;
	}

	// Methods
	public void flyJets() {
		double flightTimeRange = range / speedInMph;
		// Override in Each Subclass
		if (range == 0 || speedInMph == 0) {
			System.out.println("This Aircraft is Grounded!");
		} else {
			System.out.println(getModel() + " is Flying:");
			System.out.println("Max Speed: " + commas.format(speedInMph) 
			+ " MPH or Mach " + (twoDecimals.format(getSpeedInMach())));
			System.out.println("Range: " + commas.format(range) + " Miles");
			System.out.println("Price: " + (commas.format(price)) + " Gil");
			System.out.println("Flight Time Range: " + twoDecimals.format(flightTimeRange) + " Hour(s)");
			System.out.println();
		}
	}

	// toString Last
	@Override
	public String toString() {
		return "Jet: " + model + " - Max Speed: " + commas.format(speedInMph) + " MPH or Mach "
				+ (twoDecimals.format(getSpeedInMach()) + " - Range: " + commas.format(range) + " Miles - Price: "
						+ (commas.format(price)) + " Gil");
	}
}