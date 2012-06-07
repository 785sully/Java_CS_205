/**
 * 
 * @author Josh Lake
 *
 */
public class Walkman extends PortableElectronics {
	
	private int numTapes;//number of cassette tapes this brand eats in a year

	
	//constructor
	public Walkman(String make, String model, int yearMade, int weight,
			double cost, int powerUse, boolean fitsInPocket, int numTapes) {
		super(make, model, yearMade, weight, cost, powerUse, fitsInPocket);
		this.numTapes = numTapes;
		
	}//end constructor
	
	@Override
	public String toString(){
		String message = "This Walkman eats " + getNumTapes() + " cassettes each year. \n";
		return super.toString() + message;
	}
	//getters / setters
	public int getNumTapes(){
		return numTapes;
	}
	public void setNumTapes(int newNumTapes){
		numTapes = newNumTapes;
	}

}//end of Walkman class
