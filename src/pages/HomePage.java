package pages;

import org.openqa.selenium.Keys;
import constantValuesPack.ConstantLocators;
import constantValuesPack.ConstantValues;
import utilites.CommonMethods;

public class HomePage {

	public void fromLocation() throws Exception {
	
	for (int i = 0; i < 20; i++) {
		CommonMethods.handlingKeyBoardKeys(Keys.BACK_SPACE, ConstantLocators.fromLocation_HomePage);
	}
		CommonMethods.handlingTextBoxes(ConstantValues.fromLocation, ConstantLocators.fromLocation_HomePage);		
		CommonMethods.handlingKeyBoardKeys(Keys.ENTER, ConstantLocators.fromLocation_HomePage);
	}
	
	public void toLocation() throws Exception {
		Thread.sleep(2000);
		CommonMethods.handlingTextBoxes(ConstantValues.toLocation, ConstantLocators.toLocation_HomePage);	
		CommonMethods.handlingKeyBoardKeys(Keys.ENTER, ConstantLocators.toLocation_HomePage);
		Thread.sleep(2000);
	}
	
	public void monthYearSelection() throws Exception {
	// Select a particular month and Year
	for (int i = 0; i < 12; i++) {
		
		CommonMethods.handlingClicks(ConstantLocators.nextMonthIconLocation_HomePage);		
		String month = CommonMethods.fetchValues(ConstantLocators.monthLocation_HomePage);
		String year = CommonMethods.fetchValues(ConstantLocators.yearLocation_HomePage);
		
		if (month.equalsIgnoreCase(ConstantValues.monthValue) && year.equalsIgnoreCase(ConstantValues.yearValue)) {
			break;
		}
	}
	}
	
	public void dateSelection() throws Exception {
		CommonMethods.handlingTables(ConstantValues.dateValue, ConstantLocators.dateSelectionLocation_HomePage);
	}
	
	public void searchFlightButton() throws Exception {
		CommonMethods.handlingClicks(ConstantLocators.searchFlightLocation_HomePage);
	}
}
