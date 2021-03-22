public class Car
{
  private String makeAndModel;
  private double purchasePrice;
  private double salePrice;
  
  
  public String getMakeAndModel() {
	return makeAndModel;
}

public void setMakeAndModel(String makeAndModel) {
	this.makeAndModel = makeAndModel;
}

public double getSalePrice() {
	return salePrice;
}

public void setSalePrice(double salePrice) {
	this.salePrice = salePrice;
}

public void setPurchasePrice(double purchasePrice) {
	this.purchasePrice = purchasePrice;
}


  
  public Car() {
    makeAndModel = null;
    purchasePrice = 0;
    salePrice = 0;
  }
  
  public Car(String makeAndModel, double purchasePrice, double salePrice) {
    this();
    this.makeAndModel = makeAndModel;
    this.purchasePrice = purchasePrice;
    this.salePrice = salePrice;
  }
  
  public String toString()
  {
    return String.format("%s $%.2f", new Object[] { makeAndModel, Double.valueOf(salePrice) });
  }
  
  public double getPurchasePrice() {
    return purchasePrice;
  }
  
  public void updateSalePrice(double newPrice) {
    salePrice = newPrice;
  }
}