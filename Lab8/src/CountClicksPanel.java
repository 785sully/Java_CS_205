/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 8.20
 * CountClicksPanel.java
 *
 */

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

public class CountClicksPanel extends JPanel {
	//TODO:	Count number of mouse clicks 
	//		Display number of mouse clicks in center of window
	
	
	public static int clickCount;
	//Constructor
	public CountClicksPanel(){
		
		clickCount = 0;
		addMouseListener (new ClickListener());
		/*
		 * BorderLayout didn't center the text
		 * JLabel didn't update the click count upon repaint()
		 * so I went back to just using drawString for the text
		 * 
		//sets up Layout
		setLayout (new BorderLayout());
		
		//sets up appearance of the text
		JLabel l1 = new JLabel ("Click Count: " + clickCount);
		l1.setForeground(Color.yellow);

		
		add (l1, BorderLayout.CENTER);
		*/
		setBackground (Color.black);
		setPreferredSize (new Dimension(500, 500));	
	}//end of Constructor
	@Override
	public void paintComponent (Graphics page){
		super.paintComponent(page);
		page.setColor(Color.yellow);//what color the words will be
		page.drawString("Click Count: " + clickCount, 225, 250);
		if (clickCount >= 15)
			page.drawString("Isn't this fun?", 225, 270);
		if (clickCount >= 55)
			page.drawString("Seriously, you can stop now...", 225, 290);
	}
	
	private class ClickListener implements MouseListener{
		
		public void mousePressed (MouseEvent event){
			clickCount++;
			repaint();
			
		}
		//Unused Methods
		public void mouseClicked (MouseEvent event){}
		public void mouseReleased (MouseEvent event){}
		public void mouseEntered (MouseEvent event){}
		public void mouseExited (MouseEvent event){}
		
	}//end of ClickListener class
	

}//end of CountClicksPanel
