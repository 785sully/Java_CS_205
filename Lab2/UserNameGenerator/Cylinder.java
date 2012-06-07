/*****************************************
 * 
 * @author Josh Lake
 * CS 205
 * Lab 02
 * PP 3.8
 *
 *****************************************/
import java.util.Random;

public class Cylinder {

	
	public static void main(String[] args) {
		
		Random randomInt = new Random();
		//gets random values for radius and height 1-10
		int radius = (randomInt.nextInt(10) + 1), 
			height = (randomInt.nextInt(10) + 1);
		
		double Area, Volume;
		
		System.out.println("The radius is: " + radius + ".\n" 
							+ "The height is: " + height + ".");
		
		//computes Volume
		Volume = Math.pow(radius, 2) * height * Math.PI;
		
		//computes Area
		Area = 2 * Math.PI * radius * height;
		
		
		//outputs the results
		System.out.println("The Volume of the Cylinder is: "
							+ Volume + ".\n" +
							"The Area of the Cylinder is: "
							+ Area + ".");
		
		
		
		
		
	}//end of main

}//end of class Cylinder
