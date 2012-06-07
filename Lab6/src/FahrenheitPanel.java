/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 4.13
 * FarenheitPanel.java
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel{
	
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton Button1;
	
	public FahrenheitPanel(){
		inputLabel = new JLabel ("Enter Fahrenheit temperature:");
		outputLabel = new JLabel ("Temperature in Celsius: ");
		resultLabel = new JLabel ("---");
		Button1 = new JButton ("Convert");
		
		fahrenheit = new JTextField (5);
		fahrenheit.addActionListener(new TempListener());
		
		Button1.addActionListener(new TempListener());
		
		add (inputLabel);
		add (fahrenheit);
		add (outputLabel);
		add (resultLabel);
		add (Button1);
		
		setPreferredSize (new Dimension(300, 75));
		setBackground (Color.yellow);
		
	}//end of Constructor
	
	private class TempListener implements ActionListener{
		
		public void actionPerformed (ActionEvent event){
			
		int fahrenheitTemp, celsiusTemp;
		
		String text = fahrenheit.getText();
		
		fahrenheitTemp = Integer.parseInt(text);
		celsiusTemp = (fahrenheitTemp-32) * 5/9;
		
		resultLabel.setText (Integer.toString(celsiusTemp));
		
		}//end of actionPerformed method
		
	}//end of TempListener class
	
	
	

}//end of FarenheitPanel class