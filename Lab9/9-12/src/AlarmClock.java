/**
 * 
 * @author Josh Lake
 *
 */
public class AlarmClock extends Clock {

	private double radioStation;
	
	
	//constructor
	public AlarmClock(String make, String model, int yearMade, int weight,
			double cost, int powerUse, boolean isHomeOffice, int hour,
			int minute, double radioStation) {
		super(make, model, yearMade, weight, cost, powerUse, isHomeOffice,
				hour, minute);
		this.radioStation = radioStation;
	}//end of Constructor

	@Override
	public String toString(){
		String message = "This Alarm Clock is tuned to: " + getRadioStation() + "FM. \n";
		return super.toString() + message;
	}
	//getters/setters
	public double getRadioStation(){
		return radioStation;
	}
	public void setRadioStation(double newRadioStation){
		radioStation = newRadioStation;
	}
}//end of AlarmClock class
