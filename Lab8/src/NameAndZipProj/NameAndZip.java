/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 8.8
 * NameAndZip.java
 *
 */
package NameAndZipProj;

public class NameAndZip {

	private String firstName = "";
	private String lastName = "";
	private int zipCode = 0;
	
	//Constructor
	public NameAndZip(String fname, String lname, int zip){
		
		firstName = fname;
		lastName = lname;
		zipCode = zip;
		
	}//end of Constructor
	
	@Override
	public String toString(){
		return firstName + "\t" + lastName + "\t" + zipCode;
	}
}//end of NameAndZip class
