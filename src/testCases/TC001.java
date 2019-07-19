package testCases;

import pages.HomePage;

public class TC001 {

	public static void tc001() throws Exception {
	
		HomePage HP = new HomePage();
		
		HP.fromLocation();
		HP.toLocation();
		HP.monthYearSelection();
		HP.dateSelection();
		HP.searchFlightButton();
		
		//This is my 3rd modification
	}
}
