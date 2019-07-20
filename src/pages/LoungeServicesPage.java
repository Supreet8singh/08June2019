package pages;

import constantValuesPack.ConstantLocators;
import utilites.CommonMethods;

public class LoungeServicesPage {

	public void fetchServices() throws Exception {
		String allServies = CommonMethods.fetchingMultiplValues(ConstantLocators.allServicesLocation_LoungeServicesPage);
		System.out.println(allServies);
		
	}
}
