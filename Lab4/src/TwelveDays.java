/************************
 * 
 * @author Josh Lake
 * CS 205
 * TwelveDays.java
 * PP 6.10
 * 
 * Prints the verses of the Twelve Days of Christmas
 *
 ***********************/
public class TwelveDays {

	public static void main(String[] args) {
		
		int dayOfChristmas = 1;
		
		while(dayOfChristmas <= 12){
			System.out.print("On the " + dayOfChristmas );
					switch(dayOfChristmas){                  //checks for Xst, Xnd, Xrd to append to dayOfChristmas
						case (1):			
							System.out.print("st ");
							break;
						case (2):
							System.out.print("nd ");
							break;
						case (3):
							System.out.print("rd ");
							break;
						default:
							System.out.print("th ");
					}		
			System.out.println("day of Christmas my true love gave to me.");
		
			switch(dayOfChristmas){                            //this switch prints out verses based on the day
			
			case(12):
				System.out.println("Twelve drummers drumming, ");
			case(11):
				System.out.println("Eleven pipers piping, ");
			case(10):
				System.out.println("Ten lords a-leaping, ");
			case(9):
				System.out.println("Nine ladies dancing, ");
			case(8):
				System.out.println("Eight maids a-milking, ");
			case(7):
				System.out.println("Seven swans a-swimming, ");
			case(6):
				System.out.println("Six geese a-laying, ");
			case(5):
				System.out.println("Five golden rings, ");
			case(4):
				System.out.println("Four calling birds, ");
			case(3):
				System.out.println("Three French hens, ");
			case(2):
				System.out.println("Two turtle doves, and ");
			case(1):
				System.out.println("A partridge in a pear tree.");
			
			}//end of switch
		dayOfChristmas++;
		System.out.println(); //creates a space between days
		}//end of while loop	

	}//end of main

}//end of class TwelveDays
