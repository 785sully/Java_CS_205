/************************
 * 
 * @author Josh Lake
 * CS205
 * PP 6.22
 * 
 * SumProduct.java
 *  
 * Dialog boxes to gather two integers displays sum and product, asks to continue
 *
 ***********************/
import javax.swing.JOptionPane;

public class SumProduct {


	public static void main(String[] args) {
		
		int firstInt = 0;
		int secondInt =0;
		char[] testCharArray;
		String numStr = "";
		String message = "";
		
		
		do // makes input boxes and Sum/Products them until the user quits
		{
			
			// first input Box
			numStr = JOptionPane.showInputDialog(
					"Please enter the first Integer: ");
			firstInt = Integer.parseInt(numStr);
			
			//Add error checking here
			
			// second input Box
			numStr = JOptionPane.showInputDialog(
					"Please enter the second Integer: ");
			secondInt = Integer.parseInt(numStr);
			
			//Add error checking here
			
			// results box
			message = "The sum of " + firstInt + " and " + secondInt + " equals: " + (firstInt + secondInt) + "\n"
						+ " The product of " + firstInt + " and " + secondInt + " equals: " + (firstInt * secondInt);
			
			JOptionPane.showMessageDialog(null, message, "Sum and Product App", JOptionPane.INFORMATION_MESSAGE );
			
			//asks if the user wants to continue
			numStr = JOptionPane.showInputDialog(
					"Do you want to do another calculation? (y or n): ");
			
			testCharArray = numStr.toCharArray();
		
		}
		while(testCharArray[0] == 'y' || testCharArray[0] == 'Y');  //tests user continue answer
		
		
		
		
	}//end of main

}//end of class SumProduct
