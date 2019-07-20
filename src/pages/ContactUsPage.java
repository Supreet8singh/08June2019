package pages;

import constantValuesPack.ConstantLocators;
import utilites.CommonMethods;

public class ContactUsPage {

	public void switchWindow() throws Exception {
		CommonMethods.switchWindow(1);
	}
	
	public void fetchCINNumber() throws Exception {
		String fetchCIN = CommonMethods.fetchValues(ConstantLocators.CINLocation_ContactUsPage);
		System.out.println("The value of CIN is " + fetchCIN);
	}
	
	public void hoverManage() throws Exception {
		CommonMethods.mouseHoveringWithoutClick(ConstantLocators.manageLocation_ContactUsPage);
	}
	
	public void loungeServicesClick() throws Exception {
		CommonMethods.mouseHoveringWithClick(ConstantLocators.loungeServiceLocation_ContactUsPage);
	}
	
}
