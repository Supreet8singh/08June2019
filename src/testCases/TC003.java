package testCases;

import pages.ContactUsPage;

public class TC003 {

	public static void tc003() throws Exception {
		ContactUsPage CU = new ContactUsPage();
		
		CU.switchWindow();
		CU.fetchCINNumber();
		CU.hoverManage();
		CU.loungeServicesClick();
	}
}
