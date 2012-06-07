/*****************************************
 * 
 * @author Josh Lake
 * CS 205
 * Lab 01
 * PP 2.3
 *
 *****************************************/
import java.util.Scanner;


public class InfoParagraph {

	
	public static void main(String[] args) {
	
		String name, college, petName;
		int age;
		
		Scanner scan = new Scanner (System.in);
	// Input items
		System.out.print("What is your name?");
		name = scan.next();
		
		System.out.print("What is your age?");
		age = scan.nextInt();

		System.out.print("Where did you attend college?");
		college = scan.next();
		
		System.out.print("What is the name of your pet?");
		petName = scan.next();
	//end Input items
		
	//Begin Output items
		
		System.out.print("Hello, my name is " + name 
				+ " and I am " + age + " years \n" 
				+ "old. I'm enjoying my time at " + college 
				+ ", though \n" + "I miss my pet " + petName 
				+ " very much!");
		
	}//end main

}//end class
