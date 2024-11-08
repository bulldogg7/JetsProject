package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class AirField {

	private List<Jet> fleet;
	// NO Other Fields

	// No Argument Constructor
	public AirField() {
		loadJetsFromFile("jets.txt");
	}

	// Methods
	private void loadJetsFromFile(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while (((line = bufIn.readLine()) != null)) {
				String[] fields = line.split(", ");
				String jetType = fields[0]; // Cargo Fighter
				String model = fields[1];
				int speedInMph = Integer.parseInt(fields[3]);
				int range = Integer.parseInt(fields[2]);
				double price = Double.parseDouble(fields[3]);
				// Jet newJet = new PassengerJet(mod, sp, rng, pr);
				switch(jetType) {
				case "cargo": 
					Highwind highwind = new Highwind(fields[1], Double.parseDouble(fields[2]));
					fleet.add(highwind);
					break; 
				case "fighter": 
					Ragnarok ragnarok = new Ragnarok(fields[1], Double.parseDouble(fields[2]));
					fleet.add(ragnarok);
					break; 
				case "passenger": 
					Invincible invincible = new Invincible(fields[1], Double.parseDouble(fields[2]));
					fleet.add(invincible);
					break; 
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// TODO Public Methods for Handling Jets
	}

