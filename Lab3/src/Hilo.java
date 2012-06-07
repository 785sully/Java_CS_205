/**********************
 * 
 * @author Josh Lake
 * CS 205
 * 
 * Hilo.Java
 * 
 * class that simulates a Hi-Low Game
 *
 **********************/
import java.util.Scanner;
import java.util.Random;


public class Hilo {

	
	public static void main(String[] args) {
		
		
		int hiLoNum = 0;
		int guessCount = 0;
		int guess = -1;
		
		Random randomInt = new Random();
		Scanner stdin	= new Scanner(System.in);
		
		
		System.out.println("Welcome to the Hi-Lo Game! ");
		
		hiLoNum = randomInt.nextInt(99) + 1; //generates random Hi Lo number 1-100
		
		//Start the loop that keeps going until the user quits by entering 0 or guesses the number
		while (guess != 0 && guess != hiLoNum)
		{
			System.out.println("Guess the number, 1-100 or type 0 to quit.");
			guess = stdin.nextInt();
			guessCount++;
			
			//check guess against number, print out appropriate response
			if (guess == hiLoNum)
			{
				System.out.println("Congratulations you guessed the number!");
				System.out.println("It took you " + guessCount + " guesses.");
			}
			else if (guess == 0)
			{
				System.out.print("Thanks for playing.");//prints this after the user quits
				System.out.println("You made " + guessCount + " guesses.");
			}
			else if (guess > hiLoNum)
			{
				System.out.println("I'm sorry you guessed too high, please try again.");
				continue;
			}
			else if (guess < hiLoNum)
			{
				System.out.println("I'm sorry you guessed too low, please try again.");
				continue;
			}
			
			
		}

	}//end of main

}//end of Hilo class
