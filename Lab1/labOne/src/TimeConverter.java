/*****************************************
 * 
 * @author Josh Lake
 * CS 205
 * Lab 01
 * PP 2.9
 *
 *****************************************/
import java.util.Scanner;


public class TimeConverter {

	
	public static void main(String[] args) {
		
		int seconds;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("How many seconds have passed? ");
		seconds = scan.nextInt();
		
		System.out.print(seconds + " seconds is equivalent to: " 
							     + seconds/3600 + " hour(s), ");
		seconds = seconds%3600;//sets seconds to the remainder
		
		System.out.print(seconds/60 + " minute(s), ");
		seconds = seconds%60;//sets seconds to the remainder
		
		System.out.print(seconds + " second(s).");
		
	}//end main

}//end class
