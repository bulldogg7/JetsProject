package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements CombatReady {

	public Fighter(String model, int speedInMph, double d, double price) {
		super(model, speedInMph, d, price);
	}

	public void engageFight() {
		System.out.println("Fighter " + this.model 
			+ " Has Engaged & Eliminated the Enemy Aircraft!");
	}
}