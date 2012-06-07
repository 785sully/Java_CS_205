/**
 * 
 * @author Josh Lake
 * CS 205
 * HospitalDriver.java
 *
 */
public class HospitalDriver {

	
	public static void main (String[] args){
		//(String name, double wage, String hireDate, int age);
		
		Nurse myNurse = new Nurse("Mary Robbins", 36000.00, "5/15/09", 35, true, false, 'A');
		
		Admin myAdmin = new Admin("Billy Crudup", 45.00, "yesterday", 14, 15);
		Doctor myDoctor = new Doctor("Patch Adams", 999999.99, "a really long time ago", 99, 99); 
		Surgeon mySurgeon = new Surgeon("Bobby Cutem", 10000.00, "6/13/78", 45, 150, 15);
		
		System.out.println(myNurse);
		System.out.println(myAdmin);
		System.out.println(myDoctor);
		System.out.println(mySurgeon);
		
	}//end of main
}//end of Hospital Driver Class
