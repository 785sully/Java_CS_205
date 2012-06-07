/**
 * 
 * @author Josh Lake
 * CS 205
 * Creature.java
 * This class is the abstract that all others will inherit from
 *
 */
import java.util.Random;

public abstract class Creature {

	
	private String name;
	private int health;
	private int attackStrength;
	
	protected Random random = new Random();//used for random num with attacks
  
	
	//two variables used to track the creatures position
	private int posX;
	private int posY;
	
	//Constructor
	public Creature(String name, int health, int attackStrength){
		
		this.name = name;
		this.health = health;
		this.attackStrength = attackStrength;
		
	}//end of constructor
	
	@Override
	public String toString(){
		return name + " has an attack Strength of " + attackStrength + " current position: (" + posX + "," + posY + ")\n";
	}//end of toString method
	
	//start of abstract methods
	abstract public void move(); //method used to move the creature around the battle field
	abstract public int attack(); //method returns the damage a creature inflicts
	
	
	//getters/setters
	public String getName(){
		return name;
	}
	public int getHealth(){
		return health;
	}
	public int getAttackStrength(){
		return attackStrength;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setHealth(int health){
		this.health = health;
	}
	public void setAttackStrength(int attackStrength){
		this.attackStrength = attackStrength;
	}
	//Nav getters/setters
	public void setPosX(int newPosX){
		posX = newPosX;
	}
	public void setPosY(int newPosY){
		posY = newPosY;
	}
	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
}//end of Creature class
