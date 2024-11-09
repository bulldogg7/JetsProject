package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	Scanner input = new Scanner(System.in);
	private List<Jet> fleet = new ArrayList<>();
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
				long price = Long.parseLong(fields[3]);
				
				Jet newJet = null;
				
				switch(jetType) {
				case "cargo": 
					newJet = new Highwind(fields[1], Integer.parseInt(fields[2]),
							Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
					fleet.add(newJet);
					break; 
				case "fighter": 
					newJet = new Ragnarok(fields[1], Integer.parseInt(fields[2]), 
							Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
					fleet.add(newJet);
					break; 
				case "passenger": 
					newJet = new Invincible(fields[1], Integer.parseInt(fields[2]), 
							Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
					fleet.add(newJet);
					break; 
				}
				System.out.println(newJet);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// TODO Public Methods for Handling Jets
	}
}
