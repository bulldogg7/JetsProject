package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
	private AirField airField = new AirField();
	private static Scanner input;
	// NO Other Fields

	public static void main(String[] args) {
		input = new Scanner(System.in);
			JetsApplication app = new JetsApplication();
			app.launch();
	
				
		input.close();
	}

	private void launch() {
		// TODO Loop
		// displayUserMenu();
		// Get Input From Scanner
		// Act on Choice (Switch)
	}
	private void displayUserMenu() {
		// TODO Sysouts for Menu Items
	}
}