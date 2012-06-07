/**
 * 
 * @author Josh Lake
 *
 */
public class HomeAppliance extends Electronics{

	boolean isHomeOffice;
	
	//constructor
	public HomeAppliance(String make, String model, int yearMade, int weight, double cost, int powerUse, boolean isHomeOffice){
		
		super(make, model, yearMade, weight, cost, powerUse);
		
		this.isHomeOffice = isHomeOffice;
	}//end of constructor
	
	@Override
	public String toString(){
		String message;
		if(getIsHomeOffice()){
			message = "This item is used in a home office. \n";
		}
		else{
			message = "This item is not used in a home office. \n";
		}
		return super.toString() + message;
	}
	
	public boolean getIsHomeOffice(){
		return isHomeOffice;
	}
	public void setIsHomeOffice(boolean newIsHomeOffice){
		isHomeOffice = newIsHomeOffice;
	}
}//end of HomeAppliance class
