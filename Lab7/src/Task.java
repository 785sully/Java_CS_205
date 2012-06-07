/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 7.5
 * Task.java
 *
 */

public class Task implements Priority{
	
	private String taskItem;
	private int taskPriority;
	
	//Constructor
	public Task(String taskItem, int taskPriority){
		
		this.taskPriority = taskPriority;
		this.taskItem = taskItem; 
		}//end of constructor
	
	
	
	
	@Override
	public String toString(){
		
		String Output;
		
		Output = "Task: " + getTask() + ", Priority: " + getPriority();
		
		return Output;
	}
	
	
	
	//Priority interface methods
	public void setPriority(int taskPriority){
		
		this.taskPriority = taskPriority;	
	}
	public int getPriority(){
		
		return taskPriority;	
	}
	
	//getter/setters
	public String getTask(){
		
		return taskItem;
	}
	public void setTask(String taskItem){
		
		this.taskItem = taskItem;
	}
	

}//end of Task class
