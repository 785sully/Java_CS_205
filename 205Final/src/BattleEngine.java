/**
 * 
 * @author Josh Lake
 * CS 205
 * BattleEngine.java
 * 
 * This class is used to allow the creature objects to fight each other
 * I didn't use this engine because it really only had the fight() method, so I just put that into GameDriver
 *
 */
public class BattleEngine {
	
	//constructor
	public BattleEngine(){
	
	//example of composition	
		
										//(String name, int health, int attackStrength, int armorLevel, int level, int weaponLevel)
	Warrior noobWarrior = new Warrior("noob", 50, 2, 13, 7, 1);
								//String name, int health, int attackStrength, int gold, int treasureLevel)
	GreenSlime greenSlime = new GreenSlime("Slimer", 20, 6, 14, 1);
	}//end of constructor
	


//Battle, fight two people against each other, return values for the setText
//use the game driver for the frame,


}//end of BattleEngine class