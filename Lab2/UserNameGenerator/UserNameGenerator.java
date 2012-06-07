/*****************************************
 * 
 * @author Josh Lake
 * CS 205
 * Lab 02
 * PP 3.1
 *
 *****************************************/

import java.util.Scanner;
import java.util.Random;

public class UserNameGenerator {


	public static void main(String[] args) {
		
		String lName, fName, userName;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("What is your first name? ");
		fName = scan.next();
		
		System.out.print("What is your last name? ");
		lName = scan.next();
		
		Random randomInt = new Random();
		
		//builds userName: first letter of fName, last 5 of lName
		//				then a random int 10-99
		userName = (fName.substring(0, 1) 
				+ lName.substring(0, 5)
				+ (randomInt.nextInt(89) + 10));
		
		
		System.out.println("Your User Name is: " 
							+ userName + ".");
		
		
		

	}//end main

}//end class UserNameGenerator
