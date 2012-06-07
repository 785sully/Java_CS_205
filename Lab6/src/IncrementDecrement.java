/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 4.15
 * IncrementDecrement.java
 *
 */
import javax.swing.JFrame;

public class IncrementDecrement {

	public static void main(String[] args){
		
		JFrame frame = new JFrame ("Increment/Decrement");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new IncrementDecrementPanel());
		frame.pack();
		frame.setVisible(true);
		
	}//end of main
	
}//end of IncrementDecrement class
