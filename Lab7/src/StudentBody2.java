/**
 * 
 * @author Josh Lake
 * CS205
 * PP 7.2
 * StudentBody2.java
 *
 */
public class StudentBody2 {

	public static void main(String[] args){
		//School Address
		Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
		
		//first Student
		Address jHome = new Address("21 Jump ST", "Lynchburg", "VA", 24551);
		Student2 john = new Student2("John", "Smith", jHome, school, 100, 50, 100);
		
		//second Student
		Address mHome = new Address("123 Main ST", "Euclid", "OH", 44132);
		Student2 marsha = new Student2("Marsha", "Jones", mHome, school, 50, 75, 32);
		
		//output
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);
		
	}//end of main method
	
}//end of StudentBody2 class
