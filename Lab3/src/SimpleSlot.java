/**********************
 * 
 * @author Josh Lake
 * CS 205
 * 
 * SimpleSlot.Java
 * 
 * class that simulates a Slot Machine
 *
 **********************/
import java.util.Scanner;
import java.util.Random;


public class SimpleSlot {


	public static void main(String[] args){
		
		
		int slotNum1 = 0;
		int slotNum2 = 0;
		int slotNum3 = 0;
		String quitChar = "Y";
		
		Random randomInt = new Random();
		Scanner stdin	= new Scanner(System.in);
		
		System.out.println("Thanks for choosing the Great American Slot Machine! ");
		//Start the loop that keeps going until the user quits by entering n or N
		do
		{
			System.out.print("Slot Machine Results: ");
			System.out.print((slotNum1 = randomInt.nextInt(9) + 1) + ", ");//generates first number and assigns it to variable and prints
			System.out.print((slotNum2 = randomInt.nextInt(9) + 1) + ", ");//second number
			System.out.println(slotNum3 = randomInt.nextInt(9) + 1);//third number
			
			//Check for number matching
			if (slotNum1==slotNum2 && slotNum2==slotNum3)
			{
				System.out.println("Congratulations!! You matched three numbers!!");
			}
			else if(slotNum1==slotNum2 || slotNum1==slotNum3 || slotNum2==slotNum3)
			{
				System.out.println("Congratulations!! You matched two numbers!!");
			}
			
			
			System.out.print("Do you want to play again? (y, or n): ");
			quitChar = stdin.next();
			System.out.println();//create some space between games
			
			
			
			//error checking for input that doesn't match what we asked for
			while (!quitChar.equals("y") && !quitChar.equals("Y") && !quitChar.equals("n") && !quitChar.equals("N")  )
			{
				System.out.println("I'm sorry I didn't understand what you typed.");
				System.out.print("Do you want to play again? (y or n): ");
				quitChar = stdin.next();
				System.out.println();
				continue;	
			}
			
			
		}
		//added a few other options for people to continue to game
		while(quitChar.equals("y") || quitChar.equals("Y") || quitChar.equals("YES") || quitChar.equals("Yes") || quitChar.equals("yes")  || quitChar.equals("yeah") || quitChar.equals("Yeah") || quitChar.equals("YEAH")  );
		
		
		System.out.print("Thanks for playing.");//prints this after the user quits
		

	}//end of main

}//end of SimpleSlot class
