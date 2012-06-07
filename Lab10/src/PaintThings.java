/**
 * 
 * @author Josh Lake
 * CS 205
 *
 */
import java.text.DecimalFormat;

public class PaintThings {

	
	
	public static void main(String[] args) {
		
		final double COVERAGE = 350;
		Paint paint = new Paint(COVERAGE);
		
		Rectangle deck;
		Sphere bigBall;
		Cylinder tank;
		
		double deckAmt, ballAmt, tankAmt;
		
		//instantiate the three shapes to paint
		deck = new Rectangle(20, 35);
		bigBall = new Sphere(15);
		tank = new Cylinder(10, 30);
		
		//assign values to the Amt variables
		deckAmt = paint.amount(deck);
		ballAmt = paint.amount(bigBall);
		tankAmt = paint.amount(tank);
		
		
		//Print the amount of paint for each
		DecimalFormat fmt = new DecimalFormat("0.#");
		System.out.println("\nNumber of gallons of paint needed...");
		System.out.println("Deck " + fmt.format(deckAmt));
		System.out.println("Big Ball " + fmt.format(ballAmt));
		System.out.println("Tank " + fmt.format(tankAmt));

	}//end of main method

}//end of PaintThings class
