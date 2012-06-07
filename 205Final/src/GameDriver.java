/**
 * 
 * @author Josh Lake
 * CS 205
 * Final Project
 * GameDriver.java
 * 
 * Has a few of the creature objects fight each other. displays results in a JFrame
 * The Creature Object has a lot more functionality that what is presented here, this allows for more features to be added
 * once my Java knowledge increases. I could use those same objects for a graphics based game where the player can move a Hero
 * around on the screen
 *
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;



public class GameDriver extends JFrame{
	
	//constructor
	GameDriver(){
		//example of Composition	
					//(String name, int health, int attackStrength, int armorLevel, int level, int weaponLevel)
		noobWarrior = new Warrior("Noob", 50, 2, 6, 10, 1);
								//String name, int health, int attackStrength, int gold, int treasureLevel)
		greenSlime = new GreenSlime("Slimer", 60, 6, 14, 1);
		
		setTitle("Dungeon Battle");
		setLayout(new BorderLayout());
		setSize(200, 150);
		Container contentPane = getContentPane();
		
		//top panel has both creature info
		//left section and right section
		//left is hero, right is bad guy
		
		topLeftPanel = new JPanel(new GridLayout(4,1)); 
		leftName = new JLabel("   " + noobWarrior.getName());						
		leftHealth = new JLabel("Health: " + noobWarrior.getHealth());
		leftArmor = new JLabel("Armor Lvl: " + noobWarrior.getArmorLevel());
		leftStrength = new JLabel("Strength: " + noobWarrior.getAttackStrength());
		
		topLeftPanel.add(leftName);
		topLeftPanel.add(leftHealth);
		topLeftPanel.add(leftArmor);
		topLeftPanel.add(leftStrength);
		topLeftPanel.setBorder (BorderFactory.createLineBorder(Color.GREEN));
		
		topRightPanel = new JPanel(new GridLayout(3,1));
		rightName = new JLabel(greenSlime.getName()+"   " );
		rightHealth = new JLabel("Health: " + greenSlime.getHealth());
		rightStrength = new JLabel("Strength: " + greenSlime.getAttackStrength());
		
		topRightPanel.add(rightName);
		topRightPanel.add(rightHealth);
		topRightPanel.add(rightStrength);
		topRightPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		topPanel = new JPanel(new BorderLayout());
		topPanel.add(topLeftPanel, BorderLayout.WEST);
		topPanel.add(topRightPanel, BorderLayout.EAST);
		
		//middlePanel has the "Fight button"
		middlePanel = new JPanel(new FlowLayout());
		fight = new JButton("Fight");
		
		ButtonListener listener = new ButtonListener();
		fight.addActionListener(listener);
		middlePanel.add(fight);
		
		again = new JButton("Again?");
		AgainButtonListener againListener = new AgainButtonListener();
		again.addActionListener(againListener);
		//wait to add button until a condition is met
		
		//bottomPanel displays the winner of the battle
		bottomPanel = new JPanel(new BorderLayout());
		leftWinner = new JLabel("     ");
		rightWinner = new JLabel("     ");
		bottomPanel.add(leftWinner, BorderLayout.WEST);
		bottomPanel.add(rightWinner, BorderLayout.EAST);
		
		
		//contentPane
		contentPane.add(topPanel, BorderLayout.NORTH);
		contentPane.add(middlePanel, BorderLayout.CENTER);
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}//end WindowClosing
		});//end Listener
	
	
	
	}//end of constructor
	static JPanel topPanel;
	static JPanel topLeftPanel;
	static JPanel topRightPanel;
	static JPanel middlePanel;
	static JPanel bottomPanel;
	static JButton fight;
	static JButton again;
	static JLabel leftName;
	static JLabel rightName;
	static JLabel leftHealth;
	static JLabel rightHealth;
	static JLabel leftWinner;
	static JLabel rightWinner;
	static JLabel leftArmor;
	static JLabel leftStrength;
	static JLabel rightStrength;
	
	private Warrior noobWarrior;
	private GreenSlime greenSlime;
	
	public static void main(String[] args) {
		
		
		JFrame  frame = new GameDriver();
		frame.setVisible(true);

	}//end of main
	
	//listener for the "fight" button
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == fight){
				//call the fight() method
				if((noobWarrior.getHealth() > 0) && (greenSlime.getHealth() > 0)){
				fight(noobWarrior, greenSlime);
				//display results to Panels
				leftHealth.setText("Health: " + noobWarrior.getHealth());
				rightHealth.setText("Health: " + greenSlime.getHealth());
					if(noobWarrior.getHealth()<= 0){ 			//in the event of a "tie" greenSlime would always win because it checks warrior health first
						leftHealth.setText("Health: 0");		//even though warrior attacks first in the fight() method
						rightWinner.setText("Winner!");			//should probably fix that in future iterations, also randomize who attacks first
						middlePanel.remove(fight);				//output more text either to a window or cmd line to trace what is happening, report critical hits etc.
						middlePanel.add(again);
						middlePanel.revalidate();
					}
					else if(greenSlime.getHealth()<= 0){
						rightHealth.setText("Health: 0");
						leftWinner.setText("Winner!");
						middlePanel.remove(fight);
						middlePanel.add(again);
						middlePanel.revalidate();
					}
				}//end if "health check"
			}//end of if "fight button"
			
		}//end actionPerfomed
	}//end ButtonListener class
	
	//listener for the "again" button
	private class AgainButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == again){
				middlePanel.remove(again);
				middlePanel.add(fight);
				middlePanel.revalidate();//this is supposed to refresh JPanel, but doesn't seem to work for a button until it is pressed
				
				noobWarrior.setHealth(50);
				greenSlime.setHealth(60);
				leftHealth.setText("Health: " + noobWarrior.getHealth());
				rightHealth.setText("Health: " + greenSlime.getHealth());
				topLeftPanel.revalidate();
				topRightPanel.revalidate(); 
				rightWinner.setText("     ");
				leftWinner.setText("     ");
				
				
				
			}//end of if "again button"
		}//end of action performed
	}//end of againListener
	public void fight(Warrior good, GreenSlime bad){//creatures take turns attacking, does order matter?
		
		bad.setHealth(bad.getHealth()-good.attack());//reduces bad's health by good's attack
		good.setHealth(good.getHealth()-(bad.attack() - (good.getArmorLevel()/2))); //reduces good's health by bad's attack minus good's armor level/2
		
		
	}//end of fight method
	
	
}//end of GameDriver class
