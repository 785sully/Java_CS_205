/*************************
 * 
 * @author Josh Lake
 * CS 205
 * PP 8.6
 * LLBankDriver.java
 *
 */
import java.util.Scanner;

public class LLBankDriver {

	public static void main(String[] args) {
		//one idea I had 
		LLBank myBank = new LLBank();
		int choice = 0;
		Scanner stdin = new Scanner (System.in);
		
		while(choice != 5){
		//Start of Menu
		System.out.println("Welcome to MyBank!!!\n" 
						+ "Make your Selection:\n"
						+ "1: Create your Account.\n"
						+ "2: Make a Deposit.\n"
						+ "3: Make a Withdrawl.\n"
						+ "4: Add Interest.\n"
						+ "5: Quit.");
	
		choice = stdin.nextInt();
			switch(choice){
			
			case 1://create Account
				myBank.addAccount();
				break;
			case 2:{//make Deposit
				System.out.println("What is your Account Number? ");
				int acctNum = stdin.nextInt();
				System.out.println("How Much would you like to Deposit? ");
				long amount = stdin.nextLong();
				myBank.deposit(acctNum, amount);
				System.out.println("Thank you. Your new balance is: "
						+ myBank.getBalance(acctNum));
				break;
			}
			case 3:{//make Withdraw
				System.out.println("What is your Account Number? ");
				int acctNum = stdin.nextInt();
				System.out.println("How Much would you like to WithDraw? ");
				long amount = stdin.nextLong();
				myBank.withdrawl(acctNum, amount);
				System.out.println("Thank you. Your new balance is: "
						+ myBank.getBalance(acctNum));
				break;
			}	
			case 4:{//add Interest
				System.out.println("What is your Account Number? ");
				int acctNum = stdin.nextInt();
				System.out.println("Adding Interest to your Account");
				myBank.addInterest(acctNum);
				break;
			}
			default:
				System.out.println("Good Bye!");	
			}//end of switch
			
		}//end of while loop	
		

		
		/*
		//toString and constructor tester
		//LLBankCustomer acct1 = new LLBankCustomer(72354,"Ted Murphy", "444-555-9999", 102.56);
		//LLBankCustomer acct2 = new LLBankCustomer(69713,"Jane Smith", "555-666",  40.00);
		//LLBankCustomer acct3 = new LLBankCustomer(93757, "Edward Demsey","666-222-",  759.32);

	    LLBank llbank = new LLBank();
	    llbank.addAccount();  // test adding an account
	    llbank.addAccount();
	    llbank.addAccount();

	    //llbank.deposit(22, 13.00); // try and find nonexistent account

	    llbank.deposit(69713, 13.00); // try depositing
	    //System.out.println(llbank.getBalance());

	    llbank.withdrawl(72354, 1.0); // try withdrawing
	   // System.out.println(llbank.getBalance());


	    //llbank.addInterest(500.99); // try adding interest
	    //System.out.println(acct3.getBalance());
		*/
	    

		
	}//end of main
}//end of LLBankDriver class
