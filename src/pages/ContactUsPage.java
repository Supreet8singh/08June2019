package pages;

import constantValuesPack.ConstantLocators;
import utilites.CommonMethods;

public class ContactUsPage {

	public void switchWindow() {
		CommonMethods.switchWindow(1);
	}
	
	public void fetchCINNumber() {
		String fetchCIN = CommonMethods.fetchValues(ConstantLocators.CINLocation_ContactUsPage);
		System.out.println("The value of CIN is " + fetchCIN);
	}
	
	public void hoverManage() {
		CommonMethods.mouseHoveringWithoutClick(ConstantLocators.manageLocation_ContactUsPage);
	}
	
	public void loungeServicesClick() {
		CommonMethods.mouseHoveringWithClick(ConstantLocators.loungeServiceLocation_ContactUsPage);
	}
	
}
