package testCases;

import pages.LoungeServicesPage;

public class TC004 {

	public static void tc004() {
		LoungeServicesPage LSP = new LoungeServicesPage();
		
		LSP.fetchServices();
		
	}
}
