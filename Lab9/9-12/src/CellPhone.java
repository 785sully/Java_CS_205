/**
 * 
 * @author Josh Lake
 *
 */
public class CellPhone extends PortableElectronics {

	private boolean hasTouchScreen;
	
	//constructor
	public CellPhone(String make, String model, int yearMade, int weight,
			double cost, int powerUse, boolean fitsInPocket, boolean hasTouchScreen) {
		super(make, model, yearMade, weight, cost, powerUse, fitsInPocket);
		this.hasTouchScreen = hasTouchScreen;
		
	}//end constructor
	
	@Override
	public String toString(){
		String message;
		if(getHasTouchScreen()){
			message = "It's one of those cool touch screen phones.\n";
		}
		else{
			message = "It's one of those cheap phones that drug dealers use once and then throw away.\n";
		}
		return super.toString() + message;
	}
	//getters/setters
	public boolean getHasTouchScreen(){
		return hasTouchScreen;
	}
	public void setHasTouchScreen(boolean newHasTouchScreen){
		hasTouchScreen = newHasTouchScreen;
	}

}//end CellPhone class
