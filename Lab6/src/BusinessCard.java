/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 2.20
 * BusinessCard.java
 *
 */
import javax.swing.JApplet;
import java.awt.*;

public class BusinessCard extends JApplet{
	
	public void init(){
		setSize(500,300); //sets size of the applet
	}
	
	public void paint (Graphics page){
		
		//Card
		page.setColor(Color.white);
		page.drawRect(0, 0, 150, 50);
		
		
		//Card Text
		page.setColor(Color.black);
		page.drawString("Josh Lake",170,140);
		page.drawString("Director of Operations",170,160);
		page.drawString("1-800-999-1234",170,180);
		
		//Card Graphic
		page.setColor(Color.blue);
		int h[ ] = {10,70,70,170,190,220,
	            190,220,190,170,70,70,10};
	   
		int v[ ] = {60,10,40,40,20,20,
	            60,100,100,80,80,110,60};
	   	page.fillPolygon (h, v, h.length);
		page.setColor(Color.red);
		page.fillRect(70, 50, 85, 45);
		page.setColor(Color.yellow);
		page.fillOval(55,25,60,60);
		
	
	
	
	
	
	}//end of paint

}//end of BusinessCard class