/**
 * 
 * @author Josh Lake
 * CS 205
 * 
 *
 */
public class Sphere extends Shape {

	private double radius; //radius in feet
	
	public Sphere(double r) {
		super("Sphere");
		radius = r;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return 4*Math.PI* radius;
	}

	public String toString(){
		return super.toString() + " of radius " + radius;
	}
	
}//end of Sphere class

