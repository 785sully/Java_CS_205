/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 8.20
 * CountClicks.java
 *
 */
import javax.swing.JFrame;

public class CountClicks {
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame ("Clicker Counter");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new CountClicksPanel());
		
		frame.pack();
		frame.setVisible(true);
		
	}//end of main
}//end of CountClicks class
