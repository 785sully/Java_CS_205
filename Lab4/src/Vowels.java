/********************
 * 
 * @author Josh Lake
 * 
 * CS 205
 * Vowels.java
 * PP6.9
 * Reads String from stdin outputs the vowel count from that string
 *
 *******************/
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		int counterA = 0;
		int counterE = 0;
		int counterI = 0;
		int counterO = 0;
		int counterU = 0;
		int nonvowel = 0;
		char[] testCharArray;
		String userinput = "";
		
		//takes in user input and converts it to an array of chars
		System.out.print("Please enter a String or Sentence: ");
		Scanner stdin = new Scanner(System.in);
		userinput = stdin.next();
		testCharArray = userinput.toCharArray();
		
		for(int index = 0; index < testCharArray.length; index++){    //runs loop while there are still values in char[]
			switch(testCharArray[index]){  //tests each char in array for vowel, increments the counter
				case ('a'):
					counterA++;
					break;
				case ('e'):
					counterE++;
					break;
				case ('i'):
					counterI++;
					break;
				case ('o'):
					counterO++;
					break;
				case ('u'):
					counterU++;
					break;
				default:
					nonvowel++;
			}//end of Vowel check switch
		}//end of for loop	
		
		System.out.println("This String contained: ");
		System.out.println("lowercase A count: " + counterA);
		System.out.println("lowercase E count: " + counterE);
		System.out.println("lowercase I count: " + counterI);
		System.out.println("lowercase O count: " + counterO);
		System.out.println("lowercase U count: " + counterU);
		System.out.println("All other letters: " + nonvowel);
	}//end of main

}//end of class Vowels
