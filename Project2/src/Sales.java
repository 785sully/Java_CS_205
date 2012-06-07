/**
 * 
 * @author Josh Lake
 * CS 205
 * Project 2
 * Sales.java
 *
 */


public class Sales {
	
	private int productCode;
	private int quantitySold;
	//TODO: read in the data String and convert it to a Sales Object
	//		write getter/setters for each bit of data
	//		override toString method
	
	//Constructor
	public Sales(String data){
		String delims = "[,]";
		String[] tokens = data.split(delims);//breaks the string at the ","
		
		//converts the tokens into the correct data type
		productCode = Integer.parseInt(tokens[0]);
		quantitySold = Integer.parseInt(tokens[1]);
		
	}//end of constructor
	
	@Override
	public String toString(){
		String message = "Product Code: " + productCode + "Number Sold: " + quantitySold;
		return message;
	}
	//start of Getter/Setters
	public void setProductCode(int newCode){
		productCode = newCode;
	}
	public void setQuantitySold(int newQuantity){
		quantitySold = newQuantity;
	}
	public int getProductCode(){
		return productCode;
	}
	public int getQuantitySold(){
		return quantitySold;
	}
}//end of Sales Class
