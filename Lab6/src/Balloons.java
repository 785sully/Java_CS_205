/**
 * 
 * @author Josh Lake
 * CS205
 * PP 2.17
 * Balloons.java
 * Constructs Various Colored balloons w/a string attached
 *
 */

import javax.swing.JApplet;
import java.awt.*;
import java.util.Random;

public class Balloons extends JApplet{
	
	public void paint (Graphics page){
	
	final int BSIZE = 40; //sets size of balloon	
	final int CENTER = 150; //sets beginning center line for balloon
	final int MAX_BALLOONS = 10; //maximum used for random number of balloons
	
	setBackground (Color.gray);
	
	Random randomInt = new Random();
	int randomNum = randomInt.nextInt(MAX_BALLOONS) + 1;
	
		while (randomNum > 0){ //loop to draw balloons
			
			switch(randomNum){ //sets various colors based on number of balloons
			case 10:
			case 9:
			case 8:
			case 7:
				page.setColor(Color.blue);
				break;
			case 6:
			case 5:
			case 4:
				page.setColor(Color.red);
				break;
			default:
				page.setColor(Color.yellow);
			}//end switch 
			
			//Draws Balloon
			int vCenter = randomInt.nextInt(CENTER);//finds random vertical location of the balloon
			int hCenter = randomInt.nextInt(CENTER);//finds random horizontal location of the balloon
			int bStringLength = 30;//sets balloon string length
			page.fillOval(vCenter, hCenter, BSIZE, BSIZE);
			
			//Draws Balloon String
			page.setColor(Color.black);
			page.drawLine(vCenter + (BSIZE/2),hCenter + BSIZE ,vCenter + (BSIZE/2), (hCenter + BSIZE + bStringLength) );
			
			
			randomNum--;
		}//end of while loop

	}//end of paint
	
}//end of Balloons class
