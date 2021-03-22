import java.util.Vector;

public class CommandLineConverter {

	
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		
		for(int i=0; i<args.length; i++) {
			try {
				v.add(doubleConverter(args[i]));	
			}catch(NumberFormatException e) {
				System.out.println("Error:" + e.getMessage());
			}
		}
		
	
		for(int i=0; i<args.length; i++) {
			System.out.println("Maximum number is" + " " + v.get(i));
			break;

		}
	}
	
	private static Double doubleConverter(String stringDouble) {
		Double wrappedDouble = Double.valueOf(stringDouble);
		return wrappedDouble;
	}
	
}
