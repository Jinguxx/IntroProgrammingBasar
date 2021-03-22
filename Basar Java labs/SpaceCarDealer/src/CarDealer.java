import java.util.Arrays;

public class CarDealer {
	
	private String dealerName;
	private Car[] carsOnLot;
	
	public String getDealerName() {
		return dealerName;
	}


	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}


	public Car[] getCarsOnLot() {
		return carsOnLot;
	}


	public void setCarsOnLot(Car[] carsOnLot) {
		this.carsOnLot = carsOnLot;
	}




	public CarDealer(String dealerName, int num) {
		this.dealerName = dealerName;
		this.carsOnLot = new Car[num];
	}
	

	public boolean buyACar(Car theCars) {
		for(int index = 0; index < carsOnLot.length; index++) {
			if(carsOnLot[index] == null ) {
				carsOnLot[index] = theCars;
				return true;
			}
		}
		return false;
	}
	
	
	public double sellACar(Car theCar, double currentSalePrice) {
		double profit = 0;
		for(int index = 0; index < carsOnLot.length; index++) {
			if( carsOnLot[index] == theCar ) {
				carsOnLot[index] = null;
				profit = currentSalePrice - theCar.getPurchasePrice();
				if(profit < 0) profit = 0;
				break;
			}
		}
		return profit;
	}
	
	
	public boolean updateACarSalePrice(Car theCar, double newSalePrice) {
		for(int index = 0; index < carsOnLot.length; index++) {
			if(carsOnLot[index] == theCar ) {
				carsOnLot[index].updateSalePrice(newSalePrice);
				return true;
			}
		}
		return false;
	}
	
	
	public String toString() {
		return "CarDealer [dealerName=" + dealerName + ", carsOnLot=" + Arrays.toString(carsOnLot) + "]";
	}
	
}