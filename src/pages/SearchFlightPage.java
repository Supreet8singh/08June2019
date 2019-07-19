package pages;

import constantValuesPack.ConstantLocators;
import utilites.CommonMethods;

public class SearchFlightPage {

	public void fetchFlightPrice() throws Exception {
		String flightPrice = CommonMethods.fetchValues(ConstantLocators.flightPriceLocation_SearchFlightPage);
		System.out.println(flightPrice);
	}
	
	public void contatcUsLink() throws Exception {
		// This is a test comment
		CommonMethods.handlingClicks(ConstantLocators.contactUsLocation_SearchFlightPage);	
	}
}
