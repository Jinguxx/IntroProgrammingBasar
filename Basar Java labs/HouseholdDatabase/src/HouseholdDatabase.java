import java.util.Scanner;

import javax.swing.*;

public class HouseholdDatabase {
	public static void main(String[] args) {
		String[] houseNumbers = null;
		String[][] householdNames = null;
		int[][] householdAges = null;
	
		ImageIcon iconHouse;
		iconHouse = new ImageIcon("img/house.jpg");
		
		int response;
		String[] options = {"Exit", "Analyze", "Create"};
		
		do {
			response = JOptionPane.showOptionDialog(null, 
													houseNumbers, 
													"Household Database", 
													0, 
													JOptionPane.INFORMATION_MESSAGE, 
													iconHouse, 
													options, 
													options[2]);
			switch(response) {
				case 0: break;
				case 1:	analyzeData(houseNumbers, householdAges);
						break;
				case 2: houseNumbers = inputHouseNumbers();
						householdNames = inputHouseholdNames(houseNumbers);
						householdAges = inputHouseholdAges(houseNumbers, householdNames);
						break;

			}
		}while(response != 0);
	}



	private static void analyzeData(String[] houseNumbers, int[][] householdAges) {
		int totalAge = 0;
		double averageAge;
		int indexHouse;
		int indexPeople;
		
		for(indexHouse = 0; indexHouse < householdAges.length; indexHouse++) {
			totalAge = 0;
			for(indexPeople = 0; indexPeople < householdAges[indexHouse].length; indexPeople++) {
				totalAge = totalAge + householdAges[indexHouse][indexPeople]; 
			}
			averageAge = totalAge / householdAges[indexHouse].length;
			JOptionPane.showMessageDialog(null, "The house " + houseNumbers[indexHouse] + 
												" the average age: " +averageAge);
		}
	}



	private static int[][] inputHouseholdAges(String[] houseNumbers, String[][] householdNames) {
		int[][] tempHouseholdAges;
		String input;
		tempHouseholdAges = new int[householdNames.length][];
		
		for(int indexHouse = 0; indexHouse < householdNames.length; indexHouse++) {
			tempHouseholdAges[indexHouse] = new int[householdNames[indexHouse].length];
		}
		for(int indexHouse = 0; indexHouse < tempHouseholdAges.length; indexHouse++) {
			if(householdNames[indexHouse].length == 0) {
				JOptionPane.showMessageDialog(null," House is vacant!");
			}
			for(int indexPeople = 0; indexPeople < tempHouseholdAges[indexHouse].length; indexPeople++) {
				input = JOptionPane.showInputDialog("House number: " + houseNumbers[indexHouse] + 
						"\nThe age of the " + householdNames[indexHouse][indexPeople] + " : ");
				tempHouseholdAges[indexHouse][indexPeople] = Integer.parseInt(input);
			}
		}
		return tempHouseholdAges;
	}

	private static String[][] inputHouseholdNames(String[] houseNumbers) {
		String[][] tempHouseholdNames;
		tempHouseholdNames = new String[houseNumbers.length][];
		int numberOfPeople;
		String input;
		
		for(int indexHouse = 0; indexHouse<tempHouseholdNames.length; indexHouse++) {
			input = JOptionPane.showInputDialog("How many people live in " + houseNumbers[indexHouse] + ": ");
			numberOfPeople = Integer.parseInt(input);
			tempHouseholdNames[indexHouse] = new String[numberOfPeople];
			for(int indexPeople = 0; indexPeople<tempHouseholdNames[indexHouse].length; indexPeople++) {				
				input = JOptionPane.showInputDialog(" " + (indexPeople+1) + ". person name: " );
				tempHouseholdNames[indexHouse][indexPeople] = input;
			}
		}
		return tempHouseholdNames;
	}

	private static String[] inputHouseNumbers() {
		int numberOfHouses;
		String[] tempHouseNumbers;
		String input;
		input = JOptionPane.showInputDialog("How many houses: ");
		numberOfHouses = Integer.parseInt(input);
		tempHouseNumbers = new String[numberOfHouses];
		
		for(int i=0; i<tempHouseNumbers.length; i++) {
			input = JOptionPane.showInputDialog("What is the " + (i+1) + ". house number: ");
			tempHouseNumbers[i] =input;
		}
		return tempHouseNumbers;
	}
}