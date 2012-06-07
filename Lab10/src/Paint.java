/**
 * 
 * @author Josh Lake
 * CS 205
 *
 */
public class Paint {

	private double coverage; //number of square feet per gallon
	
	//constructor
	public Paint (double c){
		
		coverage = c;
	}//end of constructor
	
	public double amount(Shape s){
		
		System.out.println("Computing amount for " + s);
		
		return s.area() / coverage;
		
	}//end of amount method
	
}//end of Paint class
