package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {
	DecimalFormat twoDecimals = new DecimalFormat("0.00");
	DecimalFormat noDecimals = new DecimalFormat("0");
	DecimalFormat commas = new DecimalFormat("#,###");
	
	Scanner input = new Scanner(System.in);
	private List<Jet> fleet = new ArrayList<>();
	// NO Other Fields

	// No Argument Constructor
	public Airfield() {
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
				int speedInMph = Integer.parseInt(fields[2]);
				int range = Integer.parseInt(fields[3]);
				double price = Double.parseDouble(fields[4]);

				Jet newJet = null;

				switch (jetType) {
				case "cargo":
					newJet = new Highwind(fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							Double.parseDouble(fields[4]));
					fleet.add(newJet);
					break;
				case "fighter":
					newJet = new Ragnarok(fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							Double.parseDouble(fields[4]));
					fleet.add(newJet);
					break;
				case "passenger":
					newJet = new Invincible(fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							Double.parseDouble(fields[4]));
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
	}

	public void listFleet() {
		for (Jet jet : fleet) {
			System.out.println(jet);
		}
	}

	public void flyJets() {
		for (Jet jet : fleet) {
			jet.flyJets();
		}
	}

	public void viewFastestJet() {
		Jet fastestJet = null;
		int fastestSpeed = 0;
		for (Jet jet : fleet) {
			if (jet.getSpeedInMph() > fastestSpeed) {
				fastestSpeed = jet.speedInMph;
				fastestJet = jet;
			}
		}
			System.out.println("The Fastest Jet is the " 
					+ (fastestJet.getClass().getSimpleName()) 
					+ ", Whose Speed is " + commas.format(fastestSpeed) 
					+ " MPH or Mach " + (twoDecimals.format(speedInMph/750)));
}
	public void viewLongestRange() {
		Jet longevityJet = null;
		int longestRange = 0;
		for (Jet jet : fleet) {
			if (jet.getRange() > longestRange) {
				longestRange = jet.range;
				longevityJet = jet;
			}
		}
		System.out.println("The Jet With the Longest Range is the " 
							+ (longevityJet.getClass().getSimpleName()) 
							+ ", Whose Range is " + longestRange + " Miles!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
