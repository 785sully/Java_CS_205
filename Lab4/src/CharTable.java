/***********************
 * 
 * @author Josh Lake
 * CS 205
 * CharTable.java
 * PP 6.8
 * 
 * Creates a table of chars and their Unicode values
 *
 */
public class CharTable {

	public static void main(String[] args){
	int rowcount = 0;
	char unicodechar;

	for (int i = 32; i < 126;){   //sets up the loop for all the Unicode chars 32-126

		while (rowcount < 5){     //prints 5 values then starts a new line
		unicodechar = (char)i;
		System.out.print(i + ": " + unicodechar + "\t");
		i++;
		rowcount++;
		}
	System.out.println();
	rowcount = 0;
	}
	
	}//end of main
}//end of class CharTable
