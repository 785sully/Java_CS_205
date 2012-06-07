/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 7.2
 * Address.java
 *
 */
public class Address {

	private String streetAddress, city, state;
	private long zipCode;
	
	//Constructor
	public Address(String street, String town, String st, long zip){
		
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}//end of Address constructor
	
	@Override
	public String toString(){
		String result;
		
		result = streetAddress + "\n";
		result += city + ", " + state + " " + zipCode;
		
		return result;
		
	}
	
}//end of Address class
