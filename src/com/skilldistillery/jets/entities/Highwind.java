package com.skilldistillery.jets.entities;

public class Highwind extends Jet implements CargoCarrier {
	public Highwind(String model, int speedInMph, int range, double price) {
		super(model, speedInMph, range, price);
	}
	
	public void loadCargo() {
		System.out.println("Cargo Has Been Loaded onto the " + this.model);
	}
}