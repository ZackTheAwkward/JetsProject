package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	public static void main(String[] args) {
		String fileName = "jets.txt";
		AirField af = new AirField();
		af.readJets(fileName);

		List<Jets> listOfJets = af.readJets(fileName);
	}

	private List<Jets> readJets(String fileName) {

		List<Jets> listOfJets = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
				//change syntax so realine isnt jsut not equal to null but also while its equal to type
			while ((line = bufIn.readLine()) != null) {

					String[] jetRecords = line.split(",");
					String type = jetRecords[0];
					String model = jetRecords[1];
					double speed = Double.parseDouble(jetRecords[2]);
					int range = Integer.parseInt(jetRecords[3]);
					long price = Long.parseLong(jetRecords[4]);
					JetImpl p = new JetImpl(model, speed, range, price);
					System.out.println(p);
				}

		} catch (IOException e) {
			System.err.println(e);
		}

		return listOfJets;
	}

}
