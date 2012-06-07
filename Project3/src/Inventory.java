/**
 * 
 * @author Josh Lake
 * CS 205
 * Project#3
 *
 */

public class Inventory {
	
	private int productCode;
	private double price;
	private int quantity;

	
	
	//constructor
	public Inventory(int productCode, double price, int quantity){
		
		this.productCode = productCode;
		this.price = price;
		this.quantity = quantity;		
	}//end of constructor
	
	
	//getters/setters
	public void setProductCode(int productCode){
		this.productCode = productCode;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getProductCode(){
		return productCode;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantity(){
		return quantity;
	}

}//end of Inventory class
