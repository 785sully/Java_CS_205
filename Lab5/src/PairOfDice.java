/************************************
 * 
 * @author Josh Lake
 * CS 205
 * Uses the Die class 
 * to make an object of 2 Dice, modeled after Die.java
 * with all needed getter/setter classes
 * Overrides toString method
 *
 ***********************************/


public class PairOfDice{

	private final int MAX = 6;  // maximum face value

	   private int faceValue1;  // current value showing on the die
	   private int faceValue2; 
	   
	   //-----------------------------------------------------------------
	   //  Constructor: Sets the initial face value.
	   //-----------------------------------------------------------------
	   public PairOfDice()
	   {
	      faceValue1 = 1;
	      faceValue2 = 1;
	   }

	   //-----------------------------------------------------------------
	   //  Rolls the dice and returns the result.
	   //-----------------------------------------------------------------
	   public int rollDie1()
	   {
	      faceValue1 = (int)(Math.random() * MAX) + 1;

	      return faceValue1;
	   }
	   public int rollDie2()
	   {
	      faceValue2 = (int)(Math.random() * MAX) + 1;

	      return faceValue2;
	   }

	   //-----------------------------------------------------------------
	   //  Face value mutators.
	   //-----------------------------------------------------------------
	   public void setFaceValueDie1 (int value)
	   {
	      faceValue1 = value;
	   }
	   public void setFaceValueDie2 (int value)
	   {
	      faceValue2 = value;
	   }

	   //-----------------------------------------------------------------
	   //  Face value accessors.
	   //-----------------------------------------------------------------
	   public int getFaceValueDie1()
	   {
	      return faceValue1;
	   }
	   public int getFaceValueDie2()
	   {
	      return faceValue2;
	   }
	   
	   public int getDiceSum(){
		  
		   return faceValue1 + faceValue2;
		   
	   }
	   
	   //-----------------------------------------------------------------
	   //  Returns a string representation of this dice Sum.
	   //-----------------------------------------------------------------
	   @Override
	   public String toString()
	   {
	      return Integer.toString(getDiceSum());
	   }

	
	
	
	
}//end of PairOfDice class