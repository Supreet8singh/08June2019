package testCases;

import pages.SearchFlightPage;

public class TC002 {

	public static void tc002() throws Exception {
		SearchFlightPage SFP = new SearchFlightPage();
		
		SFP.fetchFlightPrice();
		SFP.contatcUsLink();
	}
}
