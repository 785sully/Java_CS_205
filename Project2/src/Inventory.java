/**
 * 
 * @author Josh Lake
 * CS 205
 * Project2
 * Inventory.java
 *
 */

public class Inventory {

	private int productCode;
	private double price;
	private int quantityOnHand;
	
	
	//constructor
	public Inventory(String data){
	String delims = "[,]";
	String[] tokens = data.split(delims);//breaks the string at the ","
	
	//converts the tokens into the correct data type
	productCode = Integer.parseInt(tokens[0]);
	price = Double.parseDouble(tokens[1]);
	quantityOnHand = Integer.parseInt(tokens[2]);
		
		
	}//end of constructor
	
	public void postSale(int sold){
		if (quantityOnHand < sold){
			System.out.println("Error, Quantity Sold is more than Quantity on Hand.");
		}
		else
		quantityOnHand -= sold;
	}
	@Override
	public String toString(){
		String message = "Product: " + productCode + "\tPrice: " + price + "\tQuantity On Hand: " + quantityOnHand + "\n";
		return message;
	}
	
	
	
	//start of getter/setters
	public void setProductCode(int code){
		productCode = code;
	}
	public void setPrice(double newPrice){
		price = newPrice;
	}
	public void setQuantityOnHand(int quantity){
		quantityOnHand = quantity;
	}
	public int getProductCode(){
		return productCode;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantityOnHand(){
		return quantityOnHand;
	}
	//end of getter/setters
	
}//end of Inventory class
