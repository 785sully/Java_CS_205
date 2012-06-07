/*****************************************
 * 
 * @author Josh Lake
 * CS 205
 * Lab 01
 * PP 2.4
 *
 *****************************************/
import java.util.Scanner;


public class FloatCalculations {

	
	public static void main(String[] args) {
		
		float firstFloat, secondFloat;
		
		Scanner scan = new Scanner (System.in);
		// Input items
			System.out.print("What is the first Number? ");
			firstFloat = scan.nextFloat();
			
			System.out.print("What is the second Number? ");
			secondFloat = scan.nextFloat();
			
		//Output items
			System.out.println(firstFloat + secondFloat);
			System.out.println(firstFloat - secondFloat);
			System.out.println(firstFloat * secondFloat);

	}//end main

}//end class
