import javax.swing.*;

import java.awt.*;

public class DeerKillsPerYear {
   private static double Road_Kill_Prob_Constant = 1.48;
   private static double US_ROAD_WIDTH_MILES = 0.0045;
   public static void main(String[] args) {
	   
	   double KeyDeerDensity;
	   double lengthOfSideSquare;
	   double lengthOfRoadThroughSquare;
	   double numberOfKeyDeer;
	   double AREA_OF_SQUARE;
	   double RoadSurfaceArea;
	   double ExpectedRoadKill;
	   
	   String input;
	   
	   input =  JOptionPane.showInputDialog("Enter side of square in miles:");
	   lengthOfSideSquare = Double.parseDouble(input);

	   input =  JOptionPane.showInputDialog("Enter roads length running through in miles:");
	   lengthOfRoadThroughSquare = Double.parseDouble(input);

	   
	   input =  JOptionPane.showInputDialog("Enter number of deer:");
	   numberOfKeyDeer = Double.parseDouble(input);
	
	   
	   AREA_OF_SQUARE = lengthOfSideSquare * lengthOfSideSquare;
	   
	   KeyDeerDensity = numberOfKeyDeer / AREA_OF_SQUARE;
	   
	   RoadSurfaceArea = lengthOfRoadThroughSquare * US_ROAD_WIDTH_MILES;
	   
	   ExpectedRoadKill = KeyDeerDensity * RoadSurfaceArea * Road_Kill_Prob_Constant;
	   
	   JOptionPane.showMessageDialog (null, "Expected number of kills is:" + ExpectedRoadKill);
	  
	   
   }
}