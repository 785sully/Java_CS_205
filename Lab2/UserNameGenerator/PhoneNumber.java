/*****************************************
 * PhoneNumber.java
 * @author Josh Lake
 * CS 205
 * Lab 02
 * PP 3.3
 *
 *****************************************/
import java.util.Random;

public class PhoneNumber {

	
	public static void main(String[] args) {
		
		
		Random randomInt = new Random();
		
		
		/*Generates Random phone number 
		with no 8s or 9s in Area Code, 
		and nothing greater than 742 in next three digits
		*/
		System.out.print(randomInt.nextInt(7) + 1);
		System.out.print(randomInt.nextInt(8));
		System.out.print(randomInt.nextInt(8) + "-");
		
		System.out.print(randomInt.nextInt(643) + 100 + "-");
		
		System.out.print(randomInt.nextInt(9000)+ 1000);
		//could fix <1000 & <100 issue with an if statement but we haven't covered those yet
		
		

	}//end main

}//end class
