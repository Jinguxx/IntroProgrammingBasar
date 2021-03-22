import java.util.Scanner;

import javax.swing.JOptionPane;
public class TaxCalculator {
	private static Scanner keyboard = new Scanner(System.in);
	
	//Constants for tax groups
	private static final double RICH = 250000; 
	private static final double MIDDLE = 70000;
	private static final double AVERAGE = 30000;
	//...
	
	//Constants for tax rates
	private static final double R_RATE = 0.25;
	private static final double M_RATE = 0.12;
	private static final double A_RATE = 0.07;
	private static final double P_RATE = 0.00;
    //..
	
	public static void main(String[] args) {
		
		//Variables
		double[] incomes = new double[20];
		double[] deductions = new double[20];
		double tempInput;
		int indexI = 0;
		int indexD = 0;
		double totalIncome;
		double totalDeduction;
		double taxableIncome;
		char taxGroup;
		double taxAmount;
		
		
		int response;
		String[] options = {"Exit", "Display", "Create"};
		
		do {
			response = JOptionPane.showOptionDialog(null, 
													taxAmount, 
													"Tax Calculator", 
													0, 
													JOptionPane.INFORMATION_MESSAGE, 
													null, 
													options, 
													options[2]);
			switch(response) {
				case 0: break;
				case 1:	displayData(computeTotalIncomes(null), totalDeduction, taxableIncome, taxGroup, taxAmount);
						break;
				case 2: incomes = inputIncomes();
						deductions = inputDeductions(incomes);
						taxableIncome = computeTaxableIncomes(incomes, deductions);
						break;

			
		}
	
		//Input income and deduction		
		//Repeatedly until 0.0 is entered
			//Input income and deduction
			//if positive, add to incomes[]
			//else if negative, add to deductions[]
			//else break;
			
		} while (response != 0);
	}

	//display(double, double, double, char, double);
	private static void displayData(double totalIncomes, double totalDeductions, double taxableIncomes, char taxGroup, double taxAmount ) {
		int totalTax = 0;
		double taxAmount;
		int indexI;
		int indexD;
		
		for(indexI = 0; indexI < taxableIncomes.length; indexI++) {
			totalTax = 0;
			for(indexD = 0; indexD < taxableIncomes[indexI].length; indexD++) {
				totalTax = totalTax + taxableIncomes[indexHouse][indexPeople]; 
			}
			taxAmount = totalTax / taxableIncomes[indexI].length;
			
		}
	}

	
	//taxAmount = computeTax(double taxGroup, char);
	
	private static double computeTax(double taxableIncomes, char taxGroup) {
		double tax = 0;
		switch(taxGroup) {
		case 'R': tax = taxableIncomes * R_RATE;
			break;
		case 'M': tax = taxableIncomes * M_RATE;
			break;
		case 'A': tax = taxableIncomes * A_RATE;
			break;
		case 'p': tax = taxableIncomes * P_RATE;
			break;
		default:
			JOptionPane.showInputDialog("Error");
			break;
		
		}
		return tax;
	}
	
	
	//taxGroup = computeTaxGroup(double taxableIncome);
	
	private static char computeTaxGroup(double taxableIncomes) {
		char taxGroup = 0;
		if(taxableIncomes >= 250000) {
		taxGroup = 'R';
		}else if(taxableIncomes >= 70000) {
		taxGroup = 'M';
		}else if(taxableIncomes >= 30000) {
		taxGroup = 'A';
		}else {
		taxGroup = 'P';
		}
		return taxGroup;
	}
	
	
	//taxableIncome = computeTaxableIncome(double incomes, double deductions);
	
	private static double computeTaxableIncomes(double[] incomes, double[] deductions) {
		double difference = 0;
		
		difference = incomes - deductions;
		
		if(difference < 0) {
		difference = 0; 
		}
		
		return difference;
	}
	
	
	//totalDeduction = computeTotalDeductions(double [] deductions);

	private static double computeTotalDeductions(double[] deductions) {
		double sum = 0;
		
		for(int i = 0; i < deductions.length; i++) {
		    sum = Math.abs(deductions[i]) + sum;
	    }
		return sum;
	}
	
	
	//totalIncome = computeTotalIncome(double [] incomes);
	
	private static double computeTotalIncomes(double[] incomes) {
		double sum = 0;
		
		for(int i = 0; i < incomes.length; i++) {
			sum = incomes[i] + sum;
			
		}
		return sum;
	}
	
	
	private static double[] inputDeductions(double[] incomes) {
		double[][] tempDeductions;
		int indexI = 0;
		int indexD = 0;
		tempDeductions = new double[incomes.length][];
		double amountDeductions;
		String input;
		
		for(int indexHouse = 0; indexI<tempDeductions.length; indexI++) {
			input = JOptionPane.showInputDialog("Enter Amount" + incomes[indexI] + ": ");
			amountDeductions = Double.parseDouble(input);
			tempDeductions[indexI] = new double[tempDeductions];
			
			}
		}
		return tempDeductions;
	
	
	private static double[] inputIncomes () {
		double amountIncomes;
		String[] tempIncomes;
		int indexI = 0;
		int indexD = 0;
		String input;
		input = JOptionPane.showInputDialog("Enter Amount: ");
		amountIncomes = Double.parseDouble(input);
		tempIncomes = new String[(int) amountIncomes];
		
		for(int i=0; i<tempIncomes.length; i++) {
			tempIncomes[i] =input;
			if(tempIncomes > 0) {
				return tempIncomes;
			}else if(tempIncomes < 0) { 
				tempIncomes[indexD] = new double[tempDeductions];
				indexD++;
			}
		}
		return tempIncomes;
	   }

	

		//Compute total income


		
		//Compute total deduction
		
		
		
		//Compute taxable income
		
	
		
		//Compute tax group
		
		
		//Compute tax amount
		

		//Display tax information
		//display(double, double, double, char, double);
		
	//}
	
	//Compute total income
	//computeTotalIncome(double [])

	//Compute total deduction
	//computeTotalDeduction(double [])
			
	//Compute taxable income
	//computeTaxableIncome(double, double)
			
	//Compute tax group
	//computeTaxGroup(double)
			
	//Compute tax amount
	//computeTax(double, char)
			
	//Display tax information
	//display(double, double, double, char, double)
	
	
}