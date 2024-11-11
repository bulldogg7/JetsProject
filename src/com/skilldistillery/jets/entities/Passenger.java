package com.skilldistillery.jets.entities;

public class Passenger extends Jet implements PassengerCarrier {
	public Passenger(String model, int speedInMph, double d, double price) {
		super(model, speedInMph, d, price);
}
	public void boardPassengers() {
		System.out.println("Passenger Have Boarded the " + this.model + "!");
	}
}