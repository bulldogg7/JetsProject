package com.skilldistillery.jets.entities;

public class Cargo extends Jet implements CargoCarrier {
	public Cargo(String model, int speedInMph, double d, double price) {
		super(model, speedInMph, d, price);
	}
	
	public void loadCargo() {
		System.out.println("Cargo Has Been Loaded Onto the " + this.model);
	}
}