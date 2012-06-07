/**************************
 * 
 * @author Josh Lake
 * CS 205
 * RollingDice2.java
 * 
 * Uses RollingDice.java as template, uses PairOfDice Object
 * 
 *
 **************************/


public class RollingDice2 {

	public static void main(String[] args) {
		
		  PairOfDice freshPair;
		  
		  freshPair = new PairOfDice();
		  

		  freshPair.rollDie1();
		  freshPair.rollDie2();
		  System.out.println ("Die One: " + freshPair.getFaceValueDie1() + ", Die Two: " + freshPair.getFaceValueDie2());
		  System.out.println();
		  
		  System.out.println("Rolling the dice again...");
		  
		  freshPair.rollDie2();
		  freshPair.setFaceValueDie1(4);
		 
		  System.out.println ("Die One: " + freshPair.getFaceValueDie1() + ", Die Two: " + freshPair.getFaceValueDie2());
		  System.out.println ("Sum: " + freshPair);//returns sum based on toString method Override in PairOfDice
		  System.out.println();
		  
		  System.out.println("Rolling the dice again...");
		  
		  freshPair.rollDie1();
		  freshPair.setFaceValueDie2(1);
		  
		  System.out.println ("Die One: " + freshPair.getFaceValueDie1()  + ", Die Two: " + freshPair.getFaceValueDie2() );
		  System.out.println ("New sum: " + freshPair);
		

	}

}