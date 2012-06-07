/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 10.2
 * Hourly.java
 *
 */
public class Hourly extends Employee {
	
	private int hoursWorked;
	
	//Constructor
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate, int vacDays) {
		super(eName, eAddress, ePhone, socSecNumber, rate, vacDays);
		
		hoursWorked = 0;
	}//end of Constructor

	public void addHours (int moreHours){
		hoursWorked += moreHours;
	}
	@Override
	public double pay(){
		
		double payment = payRate * hoursWorked;
		
		hoursWorked = 0;
		return payment;
	}//end of pay method
	
	@Override 
	public String toString(){
		
		String result = super.toString();
		
		result += "\nCurrent hours: " +hoursWorked;
		
		return result;
	}
	
	
}//end of Hourly class
