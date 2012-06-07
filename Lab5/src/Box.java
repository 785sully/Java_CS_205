/*****************
 * 
 * @author Josh Lake
 * CS 205
 * PP 4.4
 * 
 * Box Object for BoxTest Driver
 * Has getters/setters and overrides toString()
 *****************/
public class Box {
	
	private static int boxCount = 1; //keeps track of how many box objects are instantiated
	private String boxName = "Box " + boxCount; //names each box object
	private int height;
	private int width;
	private int depth;
	private boolean full;
	
	//Box Constructor
	Box(int height, int width, int depth){

		this.height = height;		
		this.width = width;
		this. depth = depth;
		full = false;
		boxCount++; //increments to keep track of total Objects made
		
	}//end of Box constructor
	
	//start of Getters
	public int getHeight(){
		return height;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getdepth(){
		return depth;
	}
	
	public boolean isFull(){
		if (full)
			return true;
		else 
			return false;
	}
	
	public String getBoxName(){
		return boxName;
	}
	
	public String isFullText(){
		if(full)
			return "The box is full.";
			else
			return "The box is empty.";
	}//end of Getters
	
	
	//start of Setters
	public void setHeight(int newheight){
		height = newheight;
	}
	
	public void setWidth(int newWidth){
		width = newWidth;
	}
	
	public void setDepth(int newDepth){
		depth = newDepth;
	}
	
	public void setBoxCount(int newBoxCount){
		boxCount = newBoxCount;
	}
	
	public void fillBox(boolean fullBox){
		if(fullBox)
			full = true;
	}//end of Setters
	
	@Override //toString() outputs the box information
	public String toString(){
		return "The " + boxName + " demensions are: \n" +
				"Height: " + height + "\n" +
				"Width: " + width + "\n" +
				"Depth: " + depth + "\n" +
				"Volume: " + (height * width * depth) + "\n" + 
				isFullText();
				
	}
}
