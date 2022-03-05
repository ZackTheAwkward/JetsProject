package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

	private void writeJets(List<Jets> jets) {
		try {
			FileWriter fw = new FileWriter(fileName);
			PrintWriter pw = new PrintWriter(fw);

			for (Jets jets2 : jets) {
				StringBuilder sb = new StringBuilder();
				sb.append(jets2.getModel());
				sb.append('\t');
				sb.append(jets2.getSpeed());
				sb.append('\t');
				sb.append(jets2.getRange());
				sb.append('\t');
				sb.append(jets2.getPrice());
				sb.append('\t');
				pw.println(sb);
			}

			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
