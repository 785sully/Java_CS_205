/**
 * 
 * @author Josh Lake
 *
 */
public class Clock extends HomeAppliance{

	private int hour;
	private int minute;
	
	//constructor
	public Clock(String make, String model, int yearMade, int weight, double cost, int powerUse, boolean isHomeOffice, int hour, int minute){
			
		super(make, model, yearMade, weight, cost, powerUse, isHomeOffice);
			
		this.hour = hour;
		this.minute = minute;
	}//end of constructor
	
	@Override
	public String toString(){
		String message = "The time is: " + getHour() + ":" + getMinute() + ". \n";
		return super.toString() + message;
	}
	
	//getters/setters
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public void setHour(int newHour){
		hour = newHour;
	}
	public void setMinute(int newMinute){
		minute = newMinute;
	}
}//end of Clock class
