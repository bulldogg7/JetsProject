package com.skilldistillery.jets.app;

import java.util.Scanner;
import com.skilldistillery.jets.entities.Airfield;

public class JetsApplication {
	private Airfield airfield = new Airfield();
	Scanner input = new Scanner(System.in);
	// NO Other Fields

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launchApp();
	}
	public void launchApp() {
		menuOptions();
	}
	private void menuOptions() {
		boolean running = true;
		do {
			while (running) {
				System.out.println();
				System.out.println("******************************************");
				System.out.println("|| 1) List Fleet    			||");
				System.out.println("|| 2) Fly All Jets    			||");
				System.out.println("|| 3) View Fastest Jet  		||");
				System.out.println("|| 4) View Jet With the Longest Range	||");
				System.out.println("|| 5) Load All Cargo Jets   		||");
				System.out.println("|| 6) Board Passengers    		||");
				System.out.println("|| 7) Dogfight!    			||");
				System.out.println("|| 8) Add a Jet to the Fleet  		||");
				System.out.println("|| 9) Remove a Jet From the Fleet	||");
				System.out.println("|| 10) Quit the Program 		||");
				System.out.println("******************************************");
				System.out.println("         What Would You Like To Do?");
				String selection = input.next();
				switch (selection) {
				case "1":
					System.out.println();
					airfield.listFleet();
					break;
				case "2":
					System.out.println();
					airfield.flyJets();
					break;
				case "3":
					System.out.println();
					airfield.viewFastestJet();
					break;
				case "4":
					System.out.println();
					airfield.viewLongestRange();
					break;
				case "5":
					System.out.println();
					airfield.loadCargo();
					break;
				case "6":
					System.out.println();
					airfield.boardPassengers();
					break;
				case "7":
					System.out.println();
					airfield.engageFight();
					break;
				case "8":
					System.out.println();
					airfield.addJet();
					break;
				case "9":
					System.out.println();
					airfield.removeJet();
					break;
				case "10":
					running = false;
					System.out.println("Thanks for Flying With Cloud & Cid Airlines!");
					break;
				default:
					System.err.println("Invalid Choice, Your Airship Crashed! Try Again");
					}
				}
		} while (true);
	}
}