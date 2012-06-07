/**
 * 
 * @author Josh Lake
 *
 */
public class Printer extends HomeAppliance{

	private int pagesPerMin;
	
	//constructor
	public Printer(String make, String model, int yearMade, int weight, double cost, int powerUse, boolean isHomeOffice,int pagesPerMin){
			
		super(make, model, yearMade, weight, cost, powerUse, isHomeOffice);
			
		this.pagesPerMin = pagesPerMin;
	}//end of constructor
	@Override
	public String toString(){
		String message = "It prints " + getPagesPerMin() + " pages per minute. \n";
		return super.toString() + message;
	}
	//getters/setters
	public int getPagesPerMin(){
		return pagesPerMin;
	}
	public void setPagesPerMin(int newPages){
		pagesPerMin = newPages;
	}
	
}//end of Printer class
