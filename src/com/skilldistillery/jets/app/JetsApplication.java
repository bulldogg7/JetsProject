package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.sanctuary.animals.Sanctuary;

public class JetsApplication {
	private AirField airField = new AirField();
	// NO Other Fields

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launchApp();
	}

	public void launchApp() {
	}
		Scanner input = new Scanner(System.in);
		private AirField airfield = new AirField();
		
		boolean running = true;
		
		while (running) {
			menuOptions();
			String selection = input.next();

			switch(selection) {
			case "1":
				airfield.listFleet();
				break;
			case "2":
				airfield.fly();
				break;
			case "3":
				airfield.viewFastestJet();
				break;
			case "4":
				airfield.viewLongestRange();
				break;
			case "5":
				airfield.loadCargo();
				break;
			case "6":
				airfield.engageFight();
				break;
			case "7":
				airfield.addJet();
				break;
			case "8":
				airfield.removeJet();
				break;
			case "9":
				running = false;
				System.out.println("Thanks for Flying With Cloud & Cid Airlines!");
				break;
			default: System.out.println("Invalid Choice; Try Again");
			} 
			input.close();
}				

	public static menuOptions() {
		System.out.println();
		System.out.println("******************************************");
		System.out.println("|| 1) List Fleet    					||");
		System.out.println("|| 2) Fly All Jets    					||");
		System.out.println("|| 3) View Fastest Jet  				||");
		System.out.println("|| 4) View Jet With the Longest Range	||");
		System.out.println("|| 5) Load All Cargo Jets   			||");
		System.out.println("|| 6) Dogfight!    						||");
		System.out.println("|| 7) Add a Jet to the Fleet  			||");
		System.out.println("|| 8) Remove a Jet From the Fleet 	 	||");
		System.out.println("|| 9) Quit the Program 					||");
		System.out.println("******************************************");
		System.out.println("         What Would You Like To Do?");
	}
}
}