/**
 * 
 * @author Josh Lake
 *
 */
public class Rectangle extends Shape {

	private int length;
	private int width;
	
	//constructor
	public Rectangle(int length, int width){
		super("Rectangle");
		this.length = length;
		this.width = width;
	}//end of constructor
	
	@Override
	public double area(){
		return length * width;
	}
	
	@Override
	public String toString(){
		return super.toString() + " of length " + length + " and width " + width;
	}
	
	
}//end of Rectangle class
