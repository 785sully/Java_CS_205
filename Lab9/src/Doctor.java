/**
 * 
 * @author Josh Lake
 * CS 205
 * Doctor.java
 *
 */
public class Doctor extends HospitalEmployee{

	private int numGolfClubs;
	
	//constructor
	public Doctor(String name, double wage, String hireDate, int age, int numGolfClubs){
		super(name, wage, hireDate, age);
		this.numGolfClubs = numGolfClubs;
	}//end of constructor
	
	//getters/setters
	public void setNumGolfClubs(int newNumGolfClubs){
		numGolfClubs = newNumGolfClubs;
	}
	public int getNumGolfClubs(){
		return numGolfClubs;
	}
	
	@Override
	public String toString(){
		
		String message = getName() + " has " + numGolfClubs + " golf clubs. ";
		return super.toString() + message;
	}
	
}//end of Doctor class
