/**
 * 
 * @author Josh Lake
 *
 */
public class Surgeon extends Doctor{

	private int numSurgeries;
	
	//constructor
	public Surgeon(String name, double wage, String hireDate, int age, int numGolfClubs, int numSurguries){
		super(name, wage, hireDate, age, numGolfClubs);
		this.numSurgeries = numSurguries;
	}//end of constructor
	
	
	@Override
	public String toString(){
		String surgMessage = getName() + " has performed " + getNumSurgeries() + " . ";
		return super.toString() + surgMessage;
	}
	//getters/setters
	public int getNumSurgeries(){
		return numSurgeries;
	}
	public void setNumSurgeries(int newNumSurgeries){
		numSurgeries = newNumSurgeries;
	}
	
}//end of Surgeon class
