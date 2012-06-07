/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 9.12
 * Electronics.java
 *
 */
public class Electronics {
	
	private String make;
	private String model;
	private int yearMade;
	private int weight;
	private double cost;
	private int powerUse;

	
	//Constructor
	public Electronics(String make, String model, int yearMade, int weight, double cost, int powerUse){
		
		this.make = make;
		this.model = model;
		this.yearMade = yearMade;
		this.weight = weight;
		this.cost = cost;
		this.powerUse = powerUse;	
	}//end of constructor
	
	@Override
	public String toString(){
		String message = "Product Info: \n" + getMake() + " " + getModel() + " \n\t" +
							"Year made: " + getYearMade() + ", " + getWeight() + "lbs., $" + getCost() + ", Uses " + getPowerUse()+ "kw.\n";
		return message;
	}
	
	//getters/setters
	public String getMake(){
		return make;
	}
	public String getModel(){
		return model;
	}
	public int getYearMade(){
		return yearMade;
	}
	public int getWeight(){
		return weight;
	}
	public double getCost(){
		return cost;
	}
	public int getPowerUse(){
		return powerUse;
	}
	public void setMake(String newMake){
		make = newMake;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	public void setYearMade(int newYearMade){
		yearMade = newYearMade;
	}
	public void setWeight(int newWeight){
		weight = newWeight;
	}
	public void setCost(double newCost){
		cost = newCost;
	}
	public void setPowerUse(int newPowerUse){
		powerUse = newPowerUse;
	}
}//end of Electronics class
