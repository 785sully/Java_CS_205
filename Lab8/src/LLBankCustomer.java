

/**************************
 * 
 * @author Josh Lake
 * CS 205
 * PP 8.6
 * LLBankCustomer.java
 *
 */
import java.text.NumberFormat;

public class LLBankCustomer {
	
	private int acctNum;
	private String name;
	private String phoneNum;
	private double balance;
	public final double INTEREST = 1.03; //3% interest
	
	//Constructors
	public LLBankCustomer(){
		acctNum = 0;
		name = "aaa";
		phoneNum = "555-555-5555";
		balance = 0.0;
		
	}
	public LLBankCustomer(int acctNum, String name, String phoneNum,  double balance){
		
		this.acctNum = acctNum;
		this.name = name;
		this.phoneNum = phoneNum;
		this.balance = balance;
		
	}//end of Constructor
	
	//start of getters/setters
	
	public void setAcctNum(int number){
		acctNum = number;
	}
	
	public int getAcctNum(){
		return acctNum;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPhoneNum(String newPhoneNum){
		phoneNum = newPhoneNum;
	}
	
	public String getPhoneNum(){
		return phoneNum;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}//end of Setter/Getters
	
	public double deposit(double amount){
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount){
		if(balance < amount){
			System.out.println("Error: Insufficient Funds.");
			return 0;
		}
		else balance -= amount;
			return balance;
	}
	
	public double addInterest(){
		balance += (balance * INTEREST);
		return balance;
	}
	
	@Override
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return (getAcctNum() + "\t" + getName() + "\t" + fmt.format(getBalance()));
	}
	
}//end of LLBankCustomer class
