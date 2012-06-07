/**
 * 
 * @author Josh Lake
 * CS 205
 * StaffMember.java
 * PP 10.2
 *
 */
abstract public class StaffMember {

	protected String name;
	protected String address;
	protected String phone;
	
	//constructor
	public StaffMember(String eName, String eAddress, String ePhone){
		name = eName;
		address = eAddress;
		phone = ePhone;
		
	}//end of constructor
	
	public String toString(){
		String result = "Name: " +name+ "\n";
		
		result += "Address: " +address+	"\n";
		result += "Phone: " +phone;
		
		return result;
	}
	
	//------------------------------
	//Derived classes must define the pay method for each type of Employee
	//_____________________________
	public abstract double pay();
	public abstract int vacation();
}//end of StaffMember class
