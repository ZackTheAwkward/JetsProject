package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	String fileName = "jets.txt";
	List<Jets> jets = readJets(fileName);

	public List<Jets> readJets(String fileName) {
		List<Jets> jetCollection = new ArrayList<Jets>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {

				
				String[] jetFields = line.split(",");
				String type = jetFields[0];
			if(type.equalsIgnoreCase("JetImpl")) {
				
				
				String model = jetFields[1];
				double speed = Double.parseDouble(jetFields[2]);
				int range = Integer.parseInt(jetFields[3]);
				long price = Long.parseLong(jetFields[4]);
				JetImpl ji = new JetImpl(model, speed, range, price);
				jetCollection.add(ji);
			
			}	else if(type.equalsIgnoreCase("CargoCarrier")) { 
				String model = jetFields[1];
				double speed = Double.parseDouble(jetFields[2]);
				int range = Integer.parseInt(jetFields[3]);
				long price = Long.parseLong(jetFields[4]);
				CargoCarrier cc = new CargoCarrier(model, speed, range, price);
				jetCollection.add(cc);
			} 
//				model = jetFighter[1];
//				speed = Double.parseDouble(jetFighter[2]);
//				range = Integer.parseInt(jetFighter[3]);
//				price = Long.parseLong(jetFighter[4]);
//				FighterJet fj = new FighterJet(model, speed, range, price, range);
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return jetCollection;
	}

	public void printJets() {
		System.out.println(jets);
	}
}
