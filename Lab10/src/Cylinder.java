/**
 * 
 * @author Josh Lake
 *
 */
public class Cylinder extends Shape {
	
	private double radius;
	private int height;
	
	//constructor
	public Cylinder(double r, int h){
		
		super("Cylinder");
		radius = r;
		height = h;
		
	}//end of constructor
	
	
	@Override
	public double area() {
		return (2 * (Math.PI * Math.pow(radius, 2))) + (2 * (Math.PI * radius * height)); //area = 2PI * radius^2 + 2PI * radius * height
	}
	@Override
	public String toString(){
		return super.toString() + " of radius " + radius + " and height " + height;
	}

}
