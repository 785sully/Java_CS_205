/**
 * 
 * @author Josh Lake
 * CS 205
 * Project2
 * StoreDriver.java
 *
 */

import java.util.Scanner;
import java.io.*;

public class StoreDriver{
	private static int MAX = 7;//assumes a maximum of 7 inventory items or sales
	private Inventory[] invList = new Inventory[MAX];//assumes only 7 inventory items
	private Sales[] salesList = new Sales[MAX];//assumes only 7 sales
	
	
	//Constructor
	public StoreDriver() throws IOException{
		initInv();
		initSales();
		
	
	}//end of Constructor
	

	public static void main(String[] args) throws IOException{
		
		StoreDriver myStore = new StoreDriver();
		
		
		myStore.processSales(myStore.salesList, myStore.invList);
		
		
		//prints report
		
		System.out.println(myStore);
		
	}//end of main
	
	public void initInv() throws IOException{
		
		Scanner fileScan = new Scanner(new File("Inventory.txt"));
		int index = 0;
		
		while (fileScan.hasNext()){
			String temp = fileScan.nextLine();
			invList[index] = new Inventory(temp);
			index++;
		}//end while loop
	}//end of initInv
	
	public void initSales() throws IOException{
 
		Scanner fileScan = new Scanner(new File("SoldSorted.txt"));
		int index = 0;
		
		while(fileScan.hasNext()){
			String temp = fileScan.nextLine();
			salesList[index] = new Sales(temp);
			index++;
		}//end of while loop
	}//end of initSales
	@Override
	public String toString(){
		String report = "Inventory Report: \n";
			  report += "*****************\n";
			  
			  for(int indexB = 0; indexB < invList.length; indexB++)
				  report += invList[indexB].toString();
		return report;
	}
	public void processSales(Sales[] newSales, Inventory[] inv){
			
			for (int indexA = 0; indexA < MAX; indexA++){
				boolean madeSale = false;//variable to check for sale after each Sale item is checked
				for(int indexB = 0; indexB < MAX; indexB++){
				
					if(inv[indexB].getProductCode() == newSales[indexA].getProductCode()){ 
					inv[indexB].postSale(newSales[indexA].getQuantitySold());
					madeSale = true;
					}//end if
				}//end for indexB
				if (!madeSale)//checks for sale, outputs if it doesn't
					System.out.println("Product code: " + newSales[indexA].getProductCode() + " not found.");
			}//end for indexA
	}
}//end of StoreDriver Class
