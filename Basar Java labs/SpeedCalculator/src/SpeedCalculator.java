import javax.swing.*;

public class SpeedCalculator {
	public static void main(String[] args) {
		
		int totalTravelDistance;
		double totalAvailableTime;
		int numberOfStops;
		int totalTime;
		double remainingTime;
		double totalTravelSpeed;
		
		String input;

		
		///input =  JOptionPane.showMessageDialog(null, "Welcome to Trip Speed Calculator You will have to supply: + The distance you want to travel in minles + The time you have available, in hours.");

		input =  JOptionPane.showInputDialog("Enter distnace to travel miles:");
		totalTravelDistance = Integer.parseInt(input);

		input =  JOptionPane.showInputDialog("Enter roads length running through in miles:");
		totalAvailableTime = Double.parseDouble(input);
	
		
		numberOfStops = totalTravelDistance /100;
		
		totalTime = (int) (totalAvailableTime - (numberOfStops * 15));
		
		totalTravelSpeed = totalTravelDistance / totalTime;
		
				
	}
	
}

