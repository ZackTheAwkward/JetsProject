package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoCarrier;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.JetImpl;

public class JetsApplication {
	AirField af = new AirField();

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.printMenu();

	}

	public void printMenu() {
		Scanner scanner = new Scanner(System.in);

		try {
			while (true) {
				
				System.out.println("Please pick an option from the following menu");
				System.out.println("1: List Fleet");
				System.out.println("2: Fly all Jets");
				System.out.println("3: View Fastest Jet");
				System.out.println("4: View Jet With Longest Range");
				System.out.println("5: Load All Cargo Jets");
				System.out.println("6: Dogfight!");
				System.out.println("7: Add A Jet To Fleet");
				System.out.println("8: Remove A Jet From Fleet");
				System.out.println("9: Quit");
				
				int userInput = scanner.nextInt();
				scanner.nextLine();

				if (userInput == 1) {
					af.printJets();
					System.out.println();
					continue;
				} else if (userInput == 2) {
					af.launch();
					continue;
				} else if (userInput == 3) {
					af.fastestJet();
					continue;
				} else if (userInput == 4) {
					af.longestRange();
					continue;
				} else if (userInput == 5) {
					af.loadingCargo();
				} else if (userInput == 6) {
					af.fighting();
				} else if (userInput == 7) {
					af.addJet();
				} else if (userInput == 8) {
					af.removeJet();
				} else if (userInput == 9) {
					System.out.println("Quit");
					break;
				} else {
					System.out.println("Invalid Response, Please Try Again");
					continue;

				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		scanner.close();
	}

}
