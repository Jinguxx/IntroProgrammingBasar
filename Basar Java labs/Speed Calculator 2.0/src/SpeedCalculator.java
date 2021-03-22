import javax.swing.JOptionPane;

public class SpeedCalculator {

	public static void main(String[] args) {
		
		String input;
			
		int totalTravelDistance;
		double totalAvailableTime;
		int numberOfStops;
		int totalTime;
		double remainingTime;
		double totalTravelSpeed;

		JOptionPane.showMessageDialog(null, "Welcome to Trip Speed Calculator You will have to supply:" 
		+ " " + "+The distance you want to travel in miles" 
		+ " " + "+The time you have available, in hours.");
		
		totalTravelSpeed();

		displayData(totalTravelSpeed());
		
		System.exit(0);
	}
	
	
	public static double totalTravelSpeed() {
		
		int totalTravelDistance;
		int totalAvailableTime;
		int numberOfStops;
		int totalTime;
		double totalTravelSpeed;
		
		String input;
		
		input = JOptionPane.showInputDialog("Enter distance to travel miles:");
		totalTravelDistance = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter time available in hours:");
		totalAvailableTime = Integer.parseInt(input);
		
		numberOfStops =  totalTravelDistance /100;
		totalTime = (int) (totalAvailableTime - ((numberOfStops * 15/60)));
		totalTravelSpeed = totalTravelDistance / totalTime;
		
		return totalTravelSpeed; }
	
	
	public static boolean displayData(double totalTravelSpeed) {		
		if(totalTravelSpeed > 65) {
			return true;
		} else {
			return false;
	    }
		JOptionPane.showMessageDialog(null, "You will have to travel at" + totalTravelSpeed + displayData(double totalTravelSpeed));
	}
}
