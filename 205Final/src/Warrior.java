/**
 * 
 * @author Josh Lake
 * CS 205
 * Warrior.java
 * 
 * This is a class that the player can control.
 *
 */


public class Warrior extends Creature {
	
	private int level;		//this controls attack and movement rates
	private int armorLevel;	//this controls damage taken
	private int weaponLevel;//could change as weapon changes, must keep number low or too powerful (less than 1) during early levels
	
	//should add an inventory array to store treasure items, 
	
	
	
	//Constructor
	public Warrior(String name, int health, int attackStrength, int armorLevel, int level, int weaponLevel) {
		super(name, health, attackStrength);
		
		this.armorLevel = armorLevel;
		this.level = level;
		this.weaponLevel = weaponLevel;
		
	}//end of constructor

	//polymorphism
	public void move() {//capable of moving more the higher level the warrior is
		
		if(level > 10){
			setPosX(getPosX() + 3); 
			setPosY(getPosY()+2);
		}
		else if (level > 5){
			setPosX(getPosX() + 2); 
			setPosY(getPosY()+1);
		}
		else{
			setPosX(getPosX() + 1); 
			setPosY(getPosY()+1);
		}
	}//end of move method

	//polymorphism
	public int attack() { //added a random number element into the attack, this would allow for critical hits and glancing blows
		int will = random.nextInt(level + 1);
			return (getAttackStrength()+ (will * weaponLevel));
	}
	public int getArmorLevel(){
		return armorLevel;
	}
	public void setArmorLevel(int armorLevel){
		this.armorLevel = armorLevel;
	}

}//end of Warrior class
