/**
 * Josh Lake
 * CS205
 * 
 */


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextAreaPanel{
	
	JTextArea txt = new JTextArea();
	JScrollPane scrolltxt = new JScrollPane(txt);
	
	//Constructor
	public TextAreaPanel(){
		
		
		scrolltxt.setBounds(3, 3, 300, 200);
		
		
		
	}//end of Constructor

	
	
	
	
}//end of TextAreaPanel Class
