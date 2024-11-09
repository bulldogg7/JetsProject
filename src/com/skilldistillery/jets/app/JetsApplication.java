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
		
		boolean exit = false;
		
		do {
			menuOptions();
			String selection = input.next();

			switch(selection) {
			case "1":
				airfield.listFleet();
				break;
			case "2":
				airfield.listFleet();
				break;
			case "3":
				airfield.listFleet();
				break;
			case "4":
				airfield.listFleet();
				break;
			case "5":
				airfield.listFleet();
				break;
			case "6":
				airfield.listFleet();
				break;
			case "7":
				airfield.listFleet();
				break;
			case "8":
				airfield.listFleet();
				break;
			case "9":
				exit = true;
				break;
				default: System.out.println("Invalid Choice; Try Again");
			} 
		}	while (exit == false);
				System.out.println("Y'all Come Back Now Ya' Hear?!");
				input.close();
}
}

	public static void menuOptions() {
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