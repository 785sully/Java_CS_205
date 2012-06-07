/**
 * 
 * @author Josh Lake
 * CS 205
 * PP lab pg 181
 * Shape.java
 *
 */
public abstract class Shape {

	protected String shapeName;
	
	//constructor
	public Shape (String name){
		shapeName = name;
	}
	
	
	@Override
	public String toString(){
		return shapeName;
	}//end of toString method
	
	//derived classes
	public abstract double area();
	
}//end of shape class
