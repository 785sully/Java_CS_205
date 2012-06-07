/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 5.16
 * TestStatsPanel.java
 *
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class TestStatsPanel  extends JPanel{
	
	//variables
	private JLabel numWordsLabel, aveWordLengthLabel; 
	private TitledBorder titleBoarder = new TitledBorder("Stats Area");
	private JButton refreshButton;
	private static long numWords, numChars, aveWordLength;
	private JTextArea txtArea = new JTextArea(6,15);
	
	
	
	//start of Constructor
	public TestStatsPanel(){
		
		//TextAreaPanel
		JScrollPane scrollingArea = new JScrollPane(txtArea);
		
		//end of TxtArea Content
		
		
		//Stats Area
		JPanel statsPanel = new JPanel();
		
		statsPanel.setBorder(titleBoarder);
		
		numWordsLabel = new JLabel ("Number of Words: " + numWords);
		
		aveWordLengthLabel = new JLabel ("Average Word Length: " + aveWordLength);
		
		
		refreshButton = new JButton ("Refresh");
		refreshButton.addActionListener(new ButtonListener());
		
		statsPanel.add(numWordsLabel);
		statsPanel.add(aveWordLengthLabel);
		statsPanel.add(refreshButton);
		//end of Stats Area Content
		
		
		
		//add all the elements to the TestStatsPanel
		add (scrollingArea, BorderLayout.CENTER);
		add (statsPanel);
		
	}//end of TestStatsPanel Constructor
	
		
	
	
	
	
	
	//ButtonListener
	private class ButtonListener implements ActionListener{
		
		/*private void linecount(String s, JTextArea txtArea){
			
			String line;
			
			do{
				line = txtArea.getText();
				
				if(line != null){
					numChars +=line.length();
					numWords += wordcount(line);
				}
			
			}
			while (line != null);
			
		}//end linecount*/
		
		public void actionPerformed (ActionEvent event){

			//read in the words, count the words and the letters
			String line;
			
			do{
				line = txtArea.getText();
				
				if (line != null){
					numChars += line.length();
					numWords += wordcount(line);	
				}	
			}
			while (line!= null);
			
			aveWordLength = numWords / numChars;
			
			
			
			
			
			
			numWordsLabel.setText("Number of Words: " + numWords);
			aveWordLengthLabel.setText("Average Word Length: " + aveWordLength);
			}//end of actionPerformed method
	}//end of Button Listener
	
	
	//Word Count Method
	private static long wordcount(String line){
		  
		
		int index = 0;
		boolean prevWhiteSpace = true;
		
		while(index < line.length()){
		
			char c = line.charAt(index++);
			boolean currWhiteSpace = Character.isWhitespace(c);
		  
			if(prevWhiteSpace && !currWhiteSpace){
				numWords++;
			}
				prevWhiteSpace = currWhiteSpace;
			}
		  	return numWords;
		}

	
}//end of TestStatsPanel class