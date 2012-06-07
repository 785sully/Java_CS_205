/*****************************************
 * Distance.java
 * @author Josh Lake
 * CS 205
 * Lab 02
 * PP 3.4
 *
 *****************************************/

import java.util.Scanner;

public class Distance {


	public static void main(String[] args) {
		
		double distance; 
		int x1, x2, y1, y2; 
		
		
		//gets coordinates from input
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the coordinate for x1: ");
		x1 = scan.nextInt();
		System.out.print("Enter the coordinate for y1: ");
		y1 = scan.nextInt();
		System.out.print("Enter the coordinate for x2: ");
		x2 = scan.nextInt();
		System.out.print("Enter the coordinate for y2: ");
		y2 = scan.nextInt();
		
		
		//Compares distance between two points
		distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	
		
		System.out.println("The distance is: " + distance);
	}//end main

}//end class Distance
