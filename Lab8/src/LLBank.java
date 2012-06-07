/*******************
 * 
 * @author Josh Lake
 * CS 205
 * PP 8.6
 * LLBank.Java
 *
 */
import java.util.Scanner;

public class LLBank {
	
	private final int MAX = 30; //max number of customers
	
	public static int count = 0;
	private LLBankCustomer[] customers;
	
	
	
	//Constructor
	public LLBank(){
		customers  = new LLBankCustomer[MAX];
		count = 0;
	}//end of Constructor
	
	
	public double withdrawl(int acctNum, double amount){
		int i = getAcct(acctNum);
		if(i== -1){
			return -1.0;
		}
		else{
			return customers[i].deposit(amount);
		}
	}//end of withdrawl method
	
	public double deposit(int acctNum, double amount){
		int i = getAcct(acctNum);
		if(i == -1){
			return -1.0;
		}	
		else{
			return customers[i].deposit(amount);
		}
		
	}//end of deposit method
	
	public double getBalance(int acctNum){
		int i = getAcct(acctNum);
		if(i == -1){
			return -1.0;
		}	
		else{
			return customers[i].getBalance();
		}
		
	}//end of getBalance method
	
	public double addInterest(int acctNum){
		int i = getAcct(acctNum);
		if(i == -1){
			return -1.0;
		}	
		else{
			return customers[i].addInterest();
		}
		
	}//end of addInterest method
	
	public void addAccount() {
		if (count >= MAX) {
			System.out.println("Error: Accepted too many customers.");
			return;
		}	
		else{
			Scanner stdin = new Scanner (System.in);
			System.out.println("Creating new Account.");
			
			//set account number
			System.out.println("What is your Account Number? ");
			int temp = stdin.nextInt();
			customers[count].setAcctNum(temp);
			
			//set name
			System.out.println("What is your Name? ");
			String owner = stdin.next();
			customers[count].setName(owner);
			
			//set phone Number
			System.out.println("What is your Phone Number? ");
			String pNum = stdin.next();
			customers[count].setPhoneNum(pNum);
			
			//set Initial balance
			System.out.println("How much Money are you Starting with today? ");
			long initial = stdin.nextLong();
			customers[count].setBalance(initial);
			
		    count++;
		}
	}
	
	private int getAcct(int acctNum){
		int notThere = -1;
		for (int i = 0; i < count && notThere == -1; i++)
			if(acctNum ==customers[i].getAcctNum()) 
				notThere = i;
		if (notThere == -1) 
			System.out.println("Error: Account not found.");
		return notThere;
	}
	
	@Override
	public String toString(){
		String output = "";
		for (int i = 0; i < count; i++)
			output += customers[i].toString() + "\n--------\n";
		return output;
		
	}//end of toString override method

}//end of LLBank Class
