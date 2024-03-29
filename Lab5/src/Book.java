/******************
 * 
 * @author Josh Lake
 * CS 205
 * PP 4.5
 * Book.java
 * Creates the Book Object will all getter/setter methods
 *
 */
public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private int copyrightDate;
	
	//Constructor
	Book ( String title, String author, String publisher, int copyrightDate){
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copyrightDate = copyrightDate;
	}
	
	//Start of getter methods
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getPublisher(){
		return publisher;
	}
	
	public int getCopyrightDate(){
		return copyrightDate;
	}// end of getter methods
	
	//Start of Setter methods
	public void setTitle(String setTitle){
		title = setTitle;
	}
	
	public void setAuthor(String setAuthor){
		author = setAuthor;
	}
	
	public void setPublisher(String setPublisher){
		publisher = setPublisher;
	}
	
	public void setCopyrightDate(int setCopyrightDate){
		copyrightDate = setCopyrightDate;
	}//end of setter methods
	
	@Override //toString override returns detailed book description
	public String toString(){
		return title + " was written by " + author + ".\n" + 
				"It was published by " + publisher +" in "+ copyrightDate + ".";
	}
	
}//end of Book class
