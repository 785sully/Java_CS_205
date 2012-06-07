/**
 * 
 * @author Josh Lake
 *
 */
public class Admin extends HospitalEmployee{

	private int rank;
	
	//Constructor
	public Admin(String name, double wage, String hireDate, int age, int rank){
		super(name, wage, hireDate, age);
		rank = this.rank;
		
	}//end of Constructor
	
	@Override
	public String toString(){
		
		String adminMessage = "Their rank is: " + rank + ". ";
		return super.toString() + adminMessage;
	}
	
	
	
	//getters/Setters
	public int getRank(){
		return rank;
	}
	public void setRank(int newRank){
		rank = newRank;
	}
	
}//end of Admin class
