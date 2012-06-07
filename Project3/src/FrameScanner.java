/**
 * 
 * @author Josh Lake
 * CS 205
 * FrameScanner.java
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class FrameScanner extends JFrame{
	
	
	//constructor
	public FrameScanner(){
	setTitle("Inventory Report Java 205");
	setLayout(new BorderLayout());
	setSize(400, 150);
	Container contentPane = getContentPane();
	
	topPanel = new JPanel(new FlowLayout());
	lookUp = new JButton("Look Up");
	ButtonListener listener = new ButtonListener();
	lookUp.addActionListener(listener);		
	
	productCode = new JTextField("Enter product code here: ");
	topPanel.add(productCode);
	topPanel.add(lookUp);
	
	bottomPanel = new JPanel(new GridLayout(0,2));
	price = new JTextField("      ");
	quantityOnHand = new JTextField("        ");
	status = new JTextField("       ");
	bottomPanel.add(new JLabel("  Price: "));
	bottomPanel.add(price);
	bottomPanel.add(new JLabel("  Quantity On Hand: "));
	bottomPanel.add(quantityOnHand);
	bottomPanel.add(new JLabel("  Status: "));
	bottomPanel.add(status);
	
	contentPane.add(topPanel, BorderLayout.NORTH);
	contentPane.add(bottomPanel, BorderLayout.SOUTH);
	
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}//end WindowClosing
	});//end Listener
	}//end of constructor
	
	static JPanel topPanel;
	static JPanel bottomPanel;
	static JButton lookUp;
	static JTextField productCode;
	static JTextField price;
	static JTextField quantityOnHand;
	static JTextField status;
	static int prodCode = 0; 
	static Inventory[] invArray = new Inventory[5];
	
	//*******************************
	// Start of Main Method
	//*******************************
	public static void main(String[] args)throws FileNotFoundException{
		
		JFrame  frame = new FrameScanner();
		frame.setVisible(true);
		//make Inventory array and read inventory from file
		
			
		Scanner invFile = new Scanner(new FileReader("Inventory.txt"));
			
		int k = 0;//used to iterate through array
		while(invFile.hasNext()){
				
			int invProdCode = invFile.nextInt();
			double invPrice = invFile.nextDouble();
			int invQuant = invFile.nextInt();
				
			Inventory myInv = new Inventory(invProdCode, invPrice, invQuant);
			
			invArray[k++] = myInv;//iterates in same line it assigns	
		}//end while loop
		invFile.close();
		

		
		
		
	}//end of main
	public Inventory binarySearch(Inventory[] invArray, int target){
		int min = 0;
		int max =invArray.length-1;
		int mid = 0;
		boolean found = false;
		

		while(!found && min <=max){
			mid = (min+max) /2;
			if (invArray[mid].getProductCode() == target)
				found = true;
			else
				if (target < invArray[mid].getProductCode())
					max = mid -1;
				else
					min = mid+1;	
		}//end while loop
		if (found)
			return invArray[mid];
		else 
			return null;
	}//end binarySearch method
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == lookUp){
				prodCode = Integer.parseInt(productCode.getText());
				Inventory test = binarySearch(invArray, prodCode);
				if(test != null){
					price.setText(Double.toString(test.getPrice()));
					quantityOnHand.setText(Integer.toString(test.getQuantity()));
					status.setText("Found");
				}
				else{
					price.setText("      ");
					quantityOnHand.setText("          ");
					status.setText("Not Found");
				}	
				
			}
		}//end actionPerfomed

	}//end ButtonListener class
}//end of FrameScanner class
