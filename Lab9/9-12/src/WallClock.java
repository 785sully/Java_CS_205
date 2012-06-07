/**
 * 
 * @author Josh Lake
 *
 */
public class WallClock extends Clock {

	private int ftFromFloor;
	
	//Constructor
	public WallClock(String make, String model, int yearMade, int weight,
			double cost, int powerUse, boolean isHomeOffice, int hour,
			int minute, int ftFromFloor) {
		super(make, model, yearMade, weight, cost, powerUse, isHomeOffice,
				hour, minute);
		this.ftFromFloor = ftFromFloor;
		// TODO Auto-generated constructor stub
	}//end constructor

	@Override
	public String toString(){
		String message = "The clock is " + getFtFromFloor() + " ft. from floor. \n";
		return super.toString() + message;
	}
	//getters/setters
	public int getFtFromFloor(){
		return ftFromFloor;
	}
	public void setFtFromFloor(int newFtFromFloor){
		ftFromFloor = newFtFromFloor;
	}
	
	
	
	
}//end class
