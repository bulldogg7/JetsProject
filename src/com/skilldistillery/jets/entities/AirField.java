package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
				String jetType = fields[0];
				String model = fields[1];
				int speedInMph = Integer.parseInt(fields[2]);
				double range = Double.parseDouble(fields[3]);
				double price = Double.parseDouble(fields[4]);

				Jet newJet = null;

				switch (jetType) {
				case "Cargo":
					newJet = new Cargo(fields[1], Integer.parseInt(fields[2]), Double.parseDouble(fields[3]),
							Double.parseDouble(fields[4]));
					fleet.add(newJet);
					break;
				case "Fighter":
					newJet = new Fighter(fields[1], Integer.parseInt(fields[2]), Double.parseDouble(fields[3]),
							Double.parseDouble(fields[4]));
					fleet.add(newJet);
					break;
				case "Passenger":
					newJet = new Passenger(fields[1], Integer.parseInt(fields[2]), Double.parseDouble(fields[3]),
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
		System.out.println("The Fastest Jet is the " + (fastestJet) + ", Whose Speed is " + commas.format(fastestSpeed)
				+ " MPH or Mach " + (twoDecimals.format(fastestSpeed / 750.0)) + "!");
	}
	public void viewLongestRange() {
		Jet longevityJet = null;
		double longestRange = 0.0;
		for (Jet jet : fleet) {
			if (jet.getRange() > longestRange) {
				longestRange = jet.range;
				longevityJet = jet;
			}
		}
		System.out.println("The Jet With the Longest Range is the " + (longevityJet) 
				+ ", Whose Range is " + commas.format(longestRange) + " Miles!");
	}
	public void loadCargo() {
		for (Jet jet : fleet) {
			if (jet instanceof Cargo) {
				((Cargo) jet).loadCargo();
			}
		}
	}
	public void engageFight() {
		for (Jet jet : fleet) {
			if (jet instanceof Fighter) {
				((Fighter) jet).engageFight();
			}
		}
	}
	public void addJet() {
		try {
			System.out.println("******************");
			System.out.println("|| 1) Cargo  	||");
			System.out.println("|| 2) Fighter	||");
			System.out.println("|| 3) Passenger ||");
			System.out.println("******************");
			System.out.println("Enter a Jet Type to Add:");
			String selection = input.nextLine();
			String type = "";
			if (selection.equals("1")) {
				type = "Cargo";
			}
			if (selection.equals("2")) {
				type = "Fighter";
			}
			if (selection.equals("3")) {
				type = "Passenger";
			}
			System.out.println("Enter the Model:");
			String model = input.nextLine();
			System.out.println("Enter the Max Speed (Number in MPH):");
			int speedInMph = input.nextInt();
			System.out.println("Enter the Range:");
			double range = input.nextDouble();
			System.out.println("Enter the Price (Number in Gil):");
			double price = input.nextDouble();
			if (type.equals("Cargo")) {
				Cargo cargo = new Cargo(model, speedInMph, range, price);
				fleet.add(cargo);
			}

			else if (type.equals("Fighter")) {
				Fighter fighter = new Fighter(model, speedInMph, range, price);
				fleet.add(fighter);
			}

			else if (type.equals("Passenger")) {
				Passenger passenger = new Passenger(model, speedInMph, range, price);
				fleet.add(passenger);
			}
			System.out.println();
			System.out.println("Your Airship Has Been Added to the Fleet!");
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input! Your Airship Crashed! Try Again!");
			input.nextLine();
			}
		}
	public void removeJet() {
		try {
			System.out.println("Enter the Number of the Airship You Want to Remove: ");
			System.out.println();
			for (int i = 0; i < fleet.size(); i++) {
				System.out.println(i + 1 + " " + fleet.get(i));
			}
			int selection = input.nextInt();
			if(selection < fleet.size() + 1 && selection > 0) {
				System.out.println();
				System.out.println(fleet.get(selection - 1).getModel() + " Has Been Removed From the Fleet!");
				fleet.remove(selection - 1);
			} if(fleet.size() == 0) {
				System.out.println();
				System.out.println("There Are No Airships Left!");
				input.nextLine();
			}
			else {
				System.out.println("Invalid Choice! You Broke the Airfield!");
			}
		}
		catch (InputMismatchException e) {
	System.out.println("Invalid Input! Your Airship Crashed! Try Again!");
	input.nextLine();
		}
	}
}