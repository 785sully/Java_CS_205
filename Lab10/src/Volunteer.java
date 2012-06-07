/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 10.2
 *
 */
public class Volunteer extends StaffMember {

	//Constructor
	public Volunteer(String eName, String eAddress, String ePhone){
		
		super (eName, eAddress, ePhone);
		
	}//end of constructor
	
	
	@Override
	public double pay() {

		return 0.0;
	}

	@Override
	public int vacation() {

		return 0;
	}

}//end of Volunteer class
