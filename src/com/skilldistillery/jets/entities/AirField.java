package com.skilldistillery.jets.entities;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AirField {
	String fileName = "jets.txt";
	List<Jets> jets = readJets(fileName);

	Scanner scanner = new Scanner(System.in);

	public List<Jets> readJets(String fileName) {
		List<Jets> jetCollection = new ArrayList<Jets>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {

				String[] jetFields = line.split(",");
				String type = jetFields[0];
				if (type.equalsIgnoreCase("JetImpl")) {

					String model = jetFields[1];
					double speed = Double.parseDouble(jetFields[2]);
					int range = Integer.parseInt(jetFields[3]);
					long price = Long.parseLong(jetFields[4]);
					JetImpl ji = new JetImpl(model, speed, range, price);
					jetCollection.add(ji);

				} else if (type.equalsIgnoreCase("CargoCarrier")) {
					String model = jetFields[1];
					double speed = Double.parseDouble(jetFields[2]);
					int range = Integer.parseInt(jetFields[3]);
					long price = Long.parseLong(jetFields[4]);
					CargoCarrier cc = new CargoCarrier(model, speed, range, price);
					jetCollection.add(cc);
				} else if (type.equalsIgnoreCase("FighterJet")) {
					String model = jetFields[1];
					double speed = Double.parseDouble(jetFields[2]);
					int range = Integer.parseInt(jetFields[3]);
					long price = Long.parseLong(jetFields[4]);
					FighterJet fj = new FighterJet(model, speed, range, price);
					jetCollection.add(fj);
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return jetCollection;
	}

	public void printJets() {
		for (Jets jets2 : jets) {
			System.out.println(jets2);
		}
	}

	public void launch() {
		for (Jets jets2 : jets) {
			jets2.fly();
		}

	}

	public void fastestJet() {
		int counter = 0;
		int index = 0;
		double fastest = jets.get(0).getSpeed();
		for (int i = 0; i < jets.size(); i++) {
			if (fastest < jets.get(i).getSpeed()) {
				fastest = jets.get(i).getSpeed();
				index = counter;
			}
			counter++;
		}
		System.out.println(jets.get(index));
	}

	public void longestRange() {
		int counter = 0;
		int index = 0;
		int farRange = jets.get(0).getRange();
		for (int i = 0; i < jets.size(); i++) {
			if( farRange < jets.get(i).getRange()) {
				farRange = jets.get(i).getRange();
				index = counter;
			}
			counter++;
		}
		System.out.println(jets.get(index));
	}

	public void loadingCargo() {
		CargoCarrier cc = new CargoCarrier();
			cc.loadCargo();
			for (Jets jets2 : jets) {
				if(jets2 == cc) {
					cc.loadCargo();
				}
			}
					
		}

	public void fighting() {
		FighterJet fj = new FighterJet();
		for (Jets jets2 : jets) {
			if (jets2.equals(fj)) {
				fj.fight();
			}
		}
		
	}

	public void addJet() {
		ArrayList<Jets> jetAddition = new ArrayList<Jets>();

		System.out.println("Please enter the model of the Jet");
		String model = scanner.next();

		System.out.println();
		System.out.println("Please enter the speed of the Jet");
		double speed = scanner.nextDouble();
		System.out.println();
		System.out.println("Please enter the range of the Jet");
		int range = scanner.nextInt();
		System.out.println();
		System.out.println("Please enter the price of the Jet");
		long price = scanner.nextLong();
		System.out.println();
		JetImpl ji = new JetImpl(model, speed, range, price);
		jetAddition.add(ji);
		jets.addAll(jetAddition);

	}

	public void removeJet() {
		System.out.println("Enter a number to remove the corresponding Jet");

	}

}