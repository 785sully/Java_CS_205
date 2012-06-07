/********************************************
 * 
 * @author Josh Lake
 * CS 205
 * Project 1
 *
 ********************************************/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class FestivalAdmission {


    
    
	public static void main(String[] args) {
		
		//Project provided constants
		final int CHILD_LIMIT = 50;
	    final int ADULT_LIMIT = 200;
	    final int SENIOR_LIMIT = 100;
	    final int TOT_LIMIT = 300;
	    final double GRAND_AMT = 2500.00;
	    final double TICKET = 10.00;
	    
		
		//stores user input from dialog box
		String numStr;
		String message;
		
		//stores the Ints after parsing
		int numChildren = 0;
		int numAdults = 0;
		int numSeniors = 0;
		int totalVisitors = 0;
		double totalMoney = 0;
		
		DecimalFormat money = new DecimalFormat ("$0.00");
		
		//Starts report in Console
		System.out.println("*******Fesitval Report*******");
		System.out.println();
		
		
		//Welcome Message Dialog box added variables to message for easier updating
		message = "Adult ticket is " + money.format(TICKET) + "\n" +
				"seniors 10% discount, Children 50% discount \n" +
				"Number Children Limit is " + CHILD_LIMIT + ", Number Adult Limit is " + ADULT_LIMIT +"\n" +
				"Number Senior Limit is " + SENIOR_LIMIT + ", Total Visitors Limit is " + TOT_LIMIT + "\n" +
				"Limit Grand Amount is " + money.format(GRAND_AMT);
				
		JOptionPane.showMessageDialog(null, message, "Welcome to Fall Festival", JOptionPane.INFORMATION_MESSAGE );
		
		//Beginning of flag-controlled do-while loop
		//stops loop if any of the user supplied input exceeds the limit
		do 
		{
			
			
			// Children input Box
			numStr = JOptionPane.showInputDialog(
					"Welcome to Fall Fesitval Please enter the number of children in your party:");
			numChildren += Integer.parseInt(numStr);
				
			// Adults input Box
			numStr = JOptionPane.showInputDialog(
						"Please enter the number of adults in your party:");
			numAdults += Integer.parseInt(numStr);
			
			// Seniors input Box
			numStr = JOptionPane.showInputDialog(
						"Please enter the number of seniors in your party:");
			numSeniors += Integer.parseInt(numStr);
			
			
			
			//calculates total visitors
			totalVisitors = numChildren + numAdults + numSeniors;
			
			//calculates Total Money earned based off ticket price and number of visitors formats it 0.00
			totalMoney = (numAdults * TICKET) + (numChildren * (TICKET/2)) + (numSeniors * (TICKET * .9));
			
			
			//Sends Report to Console
			System.out.println("Running Kids: " + numChildren);
			System.out.println("Running Adults: " + numAdults);
			System.out.println("Running Seniors: " + numSeniors + "\n");
			System.out.println("Running Total people: " + totalVisitors);
			System.out.println("Curent GranAmt: " + money.format(totalMoney) + "\n");
				
		}
		while(numChildren <= CHILD_LIMIT && 
				numAdults <= ADULT_LIMIT &&
				numSeniors <= SENIOR_LIMIT &&
				totalVisitors <= TOT_LIMIT &&
				totalMoney <= GRAND_AMT);
		
		//Shows reason that Park closed
		if (numChildren > CHILD_LIMIT)
		{
			System.out.println("children up to limit \n");
		}
		else if (numAdults > ADULT_LIMIT)
		{
			System.out.println("adult up to limit \n");
		}
		else if (numSeniors > SENIOR_LIMIT)
		{
			System.out.println("seniors up to limit \n");
		}
		else if (totalVisitors > TOT_LIMIT)
		{
			System.out.println("total visitors up to the limit \n");
		}
		else if (totalMoney > GRAND_AMT)
		{
			System.out.println("Total Money up to the limit \n");
		}	
		
		
		//Prints Final Report
		System.out.println("Admission Closed - Total Money Collected is " + money.format(totalMoney) + "\n" +
							"Total children admitted was " + numChildren + "\n" +
							"Total adults admitted was " + numAdults + "\n" +
							"Total seniors admitted was " + numSeniors + "\n");
			
		
		
		//Totals Message Box
		message = "Total Money Collected " + money.format(totalMoney) + "\n" +
				"Total Number Children " + numChildren + "\n" +
				"Total Number Adults " + numAdults + "\n" +
				"Total Number Seniors " + numSeniors + "\n" +
				"Total Visitors " + totalVisitors;
				
		JOptionPane.showMessageDialog(null, message, "Admission Closed", JOptionPane.INFORMATION_MESSAGE );
		
		
		
			

	}//end of main

}//end of FestivalAdmission Class
