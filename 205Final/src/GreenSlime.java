/**
 * 
 * @author Josh Lake
 * CS 205
 * Final Project
 *
 *
 */


public class GreenSlime extends Creature {
	
	private int gold; 				//these might better be handled through a Treasure interface?
	private int treasureLevel;
	


	//constructor
	public GreenSlime(String name, int health, int attackStrength, int gold, int treasureLevel) {
		super(name, health, attackStrength);

		this.gold = gold;
		this.treasureLevel = treasureLevel;
	}//end constructor

	//polymorphism
	public void move() {
		setPosX(getPosX()+1);
		setPosY(getPosY()+1);
	}

	//polymorphism
	public int attack() {
		int will = random.nextInt(treasureLevel * 4);
		return (getAttackStrength() + will);
	}
	@Override
	public String toString(){
		return super.toString() + "It has " +gold+ " gold and has a treasure Level of: " + treasureLevel;
	}
	
	//getters and setters
	public int getGold(){
		return gold;
	}
	public int getTreasureLevel(){
		return treasureLevel;
	}
	public void setGold(int gold){
		this.gold = gold;
	}
	public void setTreasureLevel(int treasureLevel){
		this.treasureLevel = treasureLevel;
	}
	//end of getters/setters

}//end of GreenSime class
