import javax.swing.JOptionPane;

public class SpaceCarDealer {
	
	public static void main(String[] args) {
		
		CarDealer spaceCar = new CarDealer("DeLand Space Car Dealer", 0);
		
		spaceCar.buyACar("Dodge Charger", 18000);
		spaceCar.buyACar("Tesla Model 3", 35000);
		spaceCar.buyACar("Ford Mustang", 24000);
	
		
		String[] option = {"Exit","Sell","Update the price", "Buy"};
		int response; 
		
		do {
			response = JOptionPane.showOptionDialog(null, 
					spaceCar, spaceCar.getDealerName(), 
					0, 
					1, 
					null, 
					option, 
					option[3]);
			
			switch(response) {
				case 0: 
						break;
				case 1: 
					Car selectCar = (Car)JOptionPane.showInputDialog(null, 
					          "Select:", 
					          "Update the sale price", 
					          3, 
					          null, 
					          spaceCar.getCarsOnLot(), 
					          spaceCar.getCarsOnLot()[0]);
					        
					        double salePrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the sale price of " + selectCar));
					        double profit = spaceCar.sellACar(selectCar, salePrice);
					        JOptionPane.showMessageDialog(null, "The car purchase price: " + selectCar.getPurchasePrice() 
					          + "The car sale price: " + salePrice 
					          + "The profit is: " + profit);
						break;
				case 2:
					Car carSelection = (Car)JOptionPane.showInputDialog(null, 
					          "Select:", 
					          "Update sale price", 
					          3, 
					          null, 
					          spaceCar.getCarsOnLot(), 
					          spaceCar.getCarsOnLot()[0]);
					        
					        double newSalePrice = Double.parseDouble(JOptionPane.showInputDialog("Enter new sale price of " + carSelection));
					        spaceCar.updateACarSalePrice(carSelection, newSalePrice);
						break;
				case 3:
					String buyModel = JOptionPane.showInputDialog("Enter make and model : ");
			        double purchasePrice = Double.parseDouble(JOptionPane.showInputDialog("Enter purchase price : "));
			        spaceCar.buyACar(buyModel, purchasePrice);
			}
			
		}while(response != 0);
		
		
		
		
	}
}
	
	