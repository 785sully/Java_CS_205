/**
 * 
 * @author Josh Lake
 * CS 205
 * PP 10.2
 *
 */
public class Executive extends Employee {
	
	private double bonus;
	private int bonusVacDays;
	
	//constructor
	public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate, int vacDays) {
		
		super(eName, eAddress, ePhone, socSecNumber, rate, vacDays);
		
		bonus = 0;
		bonusVacDays = 0;
		
	}//end of Constructor
	
	//awards Bonus to this executive
	public void awardBonus (double execBonus){
		bonus = execBonus;
	}
	public void awardVacBonus (int execVacBonus){//because executives need more time off to spend their extra money
		bonusVacDays = execVacBonus;
		vacationDays += bonusVacDays;
	}
	
	@Override
	public double pay(){
		double payment = super.pay() + bonus;
		
		bonus = 0;
		
		return payment;
	}//end of pay method
	@Override
	public int vacation() {

		return vacationDays;
	}
	
	

}//end of Employee Class
