/**
 * @author Josh Lake
 * CS 205
 * PP 4.5
 * BookShelf.java
 * Driver class for Book object
 *
 */
public class BookShelf {

	public static void main(String[] args) {
		// make several book objects and update them
		
		Book book1 = new Book("Big Book of Bass", "BillyBob Bumpkins", "Bubba's Books", 1989);
		Book book2 = new Book("Silly Sally's Sing-a-longs", "Sally Salamander", "SilverPress", 2000);
		Book book3 = new Book("Carl's Candy Cartoons", "Carl Carlman", "Carver Press", 1978);
		
		//output the current book information
		System.out.println(book1 + "\n");
		System.out.println(book2 + "\n");
		System.out.println(book3);
		System.out.println("*********************\n");
		
		//change the values of the book objects
		book1.setTitle("Hey I Wrote This Book!!!");
		book2.setAuthor("Anonymous");
		book3.setCopyrightDate(2000);
		
		//output the book info after updates
		System.out.println(book1 + "\n");
		System.out.println(book2 + "\n");
		System.out.println(book3);
		System.out.println("*********************\n");
		

	}//end of main

}//end of class BookShelf