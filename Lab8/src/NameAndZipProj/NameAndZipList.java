/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 8.8
 * NameAndZipList.java
 *
 */
package NameAndZipProj;
import java.util.Scanner;
import java.io.*;


public class NameAndZipList {
	
	private final int MAX_SIZE = 25;
	private int num;
	private NameAndZip dataArray[];
	
	//Constructor
	public NameAndZipList(){
		num = 0;
		dataArray = new NameAndZip[MAX_SIZE];
	}//end of Constructor
	
	public void addName(NameAndZip n){
		if (num < MAX_SIZE){
			num++;
			dataArray[num-1] = n;
		}
	}
	@Override
	public String toString(){
		String ret = "";
		for (int i = 0; i < num; i++)
			ret += dataArray[i].toString() + "\n";
		return ret;
	}
	//Where the Magic happens
	public static void main (String[] args) throws FileNotFoundException{//had to add throws to make Eclipse happy
		
		Scanner scan = new Scanner (new File("Contacts.txt"));
		NameAndZipList data = new NameAndZipList();
		
		while (scan.hasNext()){
			
			String firstName = scan.next();
			String lastName	= scan.next();
			int zipCode = scan.nextInt();
			NameAndZip myNameAndZip = new NameAndZip(firstName, lastName, zipCode);
			data.addName(myNameAndZip);
			
		}
		System.out.println(data);
	}//end of main
	

}//end of NameAndZipList class
