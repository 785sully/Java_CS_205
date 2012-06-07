/**
 * 
 * @author Josh Lake
 * CS 205
 * HospitalEmployee.java
 *
 */
public class HospitalEmployee {

	private String name;
	private double	wage;
	private String hireDate;
	private int	age;
	
	//constructor (name, wage, hireDate, age)
	public HospitalEmployee(String name, double wage, String hireDate, int age){
		this.name = name;
		this.wage = wage;
		this.hireDate = hireDate;
		this.age = age;
		
	}
	
	@Override
	public String toString(){
		String message = getName() + " earns " + getWage() + " per year. Is " + getAge() + " years old. And was hired on " + getHireDate() + ". ";
		return message;
	}
	
	public String getName(){
		return name;
	}
	public double getWage(){
		return wage;
	}
	public String getHireDate(){
		return hireDate;
	}
	public int getAge(){
		return age;
	}
	//add setters here:
	public void setName(String newName){
		name = newName;
	}
	public void setWage(double newWage){
		wage = newWage;
	}
	public void setHireDate(String newHireDate){
		hireDate = newHireDate;
	}
	public void setAge(int newAge){
		age = newAge;
	}
	
}//end of Hospital Employee class
