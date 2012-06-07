/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 4.13
 * Fahrenheit2.java
 *
 */
import javax.swing.JFrame;

public class Fahrenheit2 {
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Fahrenheit2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FahrenheitPanel panel = new FahrenheitPanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}//end of Main
	
}//end of Fahrenheit2 class
