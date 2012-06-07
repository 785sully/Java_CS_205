/**
 * 
 * @author Josh Lake
 *
 */
public class Nurse extends HospitalEmployee{

	private boolean CNA;
	private boolean pretty;
	private char schedule;//either A, B, or C
	
	//constructor
	public Nurse(String name, double wage, String hireDate, int age, boolean CNA, boolean pretty, char schedule){
		
		super(name, wage, hireDate, age);
		this.CNA = CNA;
		this.pretty = pretty;
		this.schedule = schedule;
	}
	
	@Override
	public String toString(){
	
		String nurseMessage = getName() + " works schedule " + schedule + ". ";
		return super.toString() + nurseMessage;
		
	}
	
}//end of Nurse class
