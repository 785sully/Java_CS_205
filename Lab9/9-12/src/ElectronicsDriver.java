/**
 * 
 * @author Josh Lake
 *
 */
public class ElectronicsDriver {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Crazy Eddie's Electronics Emporium!!!!");
		System.out.println("These are the Items that we have for sale today: ");
		System.out.println();
		//(String make, String model, int yearMade, int weight, double cost, int powerUse)
		// boolean fitsInPocket, boolean hasTouchScreen
		WallClock myWallClock = new WallClock("Sony", "WallyClocky", 1980, 5, 19.99, 15, true, 5, 55, 8);
		AlarmClock myAlarmClock = new AlarmClock("Toshiba", "Wake-U-Up", 2011, 1, 39.99, 5, false, 12, 10, 96.5  );
		Printer myPrinter = new Printer("HP", "1450", 2012, 10, 99.99, 14, true, 100 );
		CellPhone myCellPhone = new CellPhone("LG", "Unknown", 1789, 7, 1.25, 100,false, false);
		Walkman myWalkman = new Walkman("Not An iPod", "Cheapy", 1979, 1, 89.99, 1, true, 8);
		
		//Output list of items
		System.out.println(myWallClock);
		System.out.println(myAlarmClock);
		System.out.println(myPrinter);
		System.out.println(myCellPhone);
		System.out.println(myWalkman);

	}//end of main

}//end of ElectronicsDriver class
