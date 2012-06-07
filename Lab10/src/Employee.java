/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 10.2
 *
 */
public class Employee extends StaffMember {
	
	protected String socialSecurityNumber;
	protected double payRate;
	protected int vacationDays;
	
	//constructor
	public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate, int vacDays){
		
		super (eName, eAddress, ePhone);
		socialSecurityNumber = socSecNumber;
		payRate = rate;
		vacationDays = vacDays;
	}//end of constructor
	
	@Override
	public String toString(){
		
		String result = super.toString();
		
		result += "\nSocial Security Number: " + socialSecurityNumber;
		
		return result;
	}//end of toString

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return payRate;
	}

	@Override
	public int vacation() {
		// TODO Auto-generated method stub
		return vacationDays;
	}

}//end of Employee Class
