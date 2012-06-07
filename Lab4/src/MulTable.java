/**********************
 * 
 * @author Josh Lake
 * CS 205
 * MulTable.java
 * PP 6.3
 * Creates a multiplication table of squares 1-12
 * 
 **********************/

import java.util.ArrayList;


public class MulTable {

	public static void main(String[] args) {

			ArrayList<Integer> multiples = new ArrayList<Integer>();

			multiples.add (1); //sets up the ArrayList
			multiples.add (2);
			multiples.add (3);
			multiples.add (4);
			multiples.add (5);
			multiples.add (6);
			multiples.add (7);
			multiples.add (8);
			multiples.add (9);
			multiples.add (10);
			multiples.add (11);
			multiples.add (12);

		for(int indexa = 0; indexa < multiples.size(); indexa++) //loops through first int 1-12
		{
			for (int indexb = 0; indexb < multiples.size(); indexb++) //loops through second int 1-12
			{
				System.out.println(multiples.get(indexa) + " * " + multiples.get(indexb) + " = " + //lists the ints and multiplies them
						multiples.get(indexa)*multiples.get(indexb));
				
			}//end second for loop
		
		}//end first for loop
		

	}//end main

}//end of class MulTable
