import java.util.Scanner;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);

		int total = 0,  input = 0;
		System.out.print("Enter Integers (a negative will end the program): ");

		do
		{
			if (input%2==0)
				{
			total += input;
				}
		
		input = stdin.nextInt();

		}
		while (input >= 0);
		System.out.println("The sum of all even integers entered is: " + total);

	}

}
