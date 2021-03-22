import java.util.Scanner;
public class TaxCalculator {
	private static Scanner keyboard = new Scanner(System.in);
	
	private static final double RICH = 250000; 
	private static final double MIDDLE = 70000;
	private static final double AVERAGE = 30000;
	

	
	private static final double R_RATE = 0.25;
	private static final double M_RATE = 0.12;
	private static final double A_RATE = 0.07;
	private static final double P_RATE = 0.00;

	

	public static void main(String[] args) {
		
		double incomes[] = new double[20];
		double deductions[] = new double[20];
		double tempInput;
		int indexI = 0;
		int indexD = 0;
		double totalIncomes;
		double totalDeductions;
		double taxableIncome;
		char taxGroup;
		double taxAmount;
		
		
		do {
			System.out.print("Enter next amount: ");
			tempInput = keyboard.nextDouble();
			if(tempInput > 0) {
				incomes[indexI] = tempInput;
				indexI++;
			}else if(tempInput < 0) { 
				deductions[indexD] = tempInput;
				indexD++;
			}
	
			
		} while (tempInput != 0);
		
		for(int i = 0; i < indexI; i++) {
			System.out.println(incomes[i]);
			
		}
		
		for(int i = 0; i < indexD; i++) {
			System.out.println(deductions[i]);
		
		}
		
		
		totalIncomes = computeTotalIncome(incomes);
		System.out.println("Incomes is: $" + totalIncomes);
		
		totalDeductions = computeTotalDeduction(deductions);
		System.out.println("Deductions is: $" + totalDeductions);

		taxableIncome = computeTaxableIncome(totalIncomes, totalDeductions);
		System.out.println("Taxable income is: $" + taxableIncome);
		
		taxGroup = computeTaxGroup(taxableIncome);
		System.out.println("Tax Group: " + taxGroup);

		taxAmount = computeTax(taxableIncome,taxGroup);
		System.out.println("Tax amount: $" + taxAmount);
		
		
	}
	
	

	
	private static double computeTax(double taxableIncome, char taxGroup) {
		double tax = 0;
		switch(taxGroup) {
		case 'R': tax = taxableIncome * R_RATE;
			break;
		case 'M': tax = taxableIncome * M_RATE;
			break;
		case 'A': tax = taxableIncome * A_RATE;
			break;
		case 'p': tax = taxableIncome * P_RATE;
			break;
		default:
			System.out.println("Error!");
			break;
		
		}
		return tax;
	}




	private static char computeTaxGroup(double taxableIncome) {
		char taxGroup = 0;
		if(taxableIncome >= 250000) {
		taxGroup = 'R';
		}else if(taxableIncome >= 70000) {
		taxGroup = 'M';
		}else if(taxableIncome >= 30000) {
		taxGroup = 'A';
		}else {
		taxGroup = 'P';
		}
		return taxGroup;
	}




	private static double computeTaxableIncome(double totalIncome, double totalDeduction) {
		double difference = 0;
		
		difference = totalIncome - totalDeduction;
		
		if(difference < 0) {
		difference = 0; 
		}
		
		return difference;
	}


	private static double computeTotalDeduction(double[] deductions) {
		double sum = 0;
		
		for(int i = 0; i < deductions.length; i++) {
		    sum = Math.abs(deductions[i]) + sum;
	    }
		return sum;
	}


	private static double computeTotalIncome(double[] incomes) {
		double sum = 0;
		
		for(int i = 0; i < incomes.length; i++) {
			sum = incomes[i] + sum;
			
		}
		return sum;
	}
}
