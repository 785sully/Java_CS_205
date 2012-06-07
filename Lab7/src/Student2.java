/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 7.2
 * Student2.java
 *
 */


public class Student2 {
	
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int test1, test2, test3;
	
	//constructor
	public Student2 (String first, String last, Address home, Address school, int firstTest, int secondTest, int thirdTest){
		
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		test1 = firstTest;
		test2 = secondTest;
		test3 = thirdTest;
	}//end of constructor
	
	//default constructor
	public Student2 (){
		firstName = null;
		lastName = null;
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}//end of default constructor
	
	@Override
	public String toString(){
		String result;
		
		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress +"\n" + "\n";
		result += "School Address:\n" + schoolAddress + "\n" + "\n";
		result += "Test Scores:\n" + test1 + ", " + test2 + ", " + test3 + "\n";
		result += "Test Score Average: " + average() + "\n";
		result += "**********************\n";
		
		
		return result;
	}
	
	public void setTestScore(int testnum, int testscore){
		
		switch(testnum){
		case 1:
			test1 = testscore;
			break;
		case 2:
			test2 = testscore;
			break;
		default:
			test3 = testscore;
		}//end switch
	}//end setTestScore method
	
public int getTestScore(int testnum){
		
		switch(testnum){
		case 1:
			return test1;
		case 2:
			return test2;
		default:
			return test3;
		}//end switch
	}//end getTestScore method

public int average(){
	
	int testAverage = (test1 + test2 + test3) / 3;
	return testAverage;
}//end of average method

}//end of Student2 class
