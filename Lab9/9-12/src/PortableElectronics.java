/**
 * 
 * @author Josh Lake
 *
 */
public class PortableElectronics extends Electronics {
	
	private boolean fitsInPocket;
	
	//constructor
	public PortableElectronics(String make, String model, int yearMade,
			int weight, double cost, int powerUse, boolean fitsInPocket) {
		super(make, model, yearMade, weight, cost, powerUse);
		
		this.fitsInPocket = fitsInPocket;
		
	}//end constructor
	
	@Override
	public String toString(){
		String message;
		if(getFitsInPocket()){
			message = "This item fits in your pocket.\n";
		}
		else {
			message = "This item does not fit in your pocket.\n";
		}
		return super.toString() + message;
	}//end toString
	
	//getters/setters
	public boolean getFitsInPocket(){
		return fitsInPocket;
	}
	public void setFitsInPocket(boolean newFitsInPocket){
		fitsInPocket = newFitsInPocket;
	}

}//end of PortableElectronics class
