package utilites;

import org.openqa.selenium.By;

public class LocatorSplit {
	
public static By splitLocator(String locVariable) {
		
		//fetching the locator type
		String locType = locVariable.split(":")[0];
	
			//fetching the locator value
		String locValue = locVariable.split(":")[1]; 
		
		if (locType.equalsIgnoreCase("ID")) {
			return By.id(locValue);
		}
		
		else if (locType.equalsIgnoreCase("NAME")) {
			return By.name(locValue);
		}
		
		else if (locType.equalsIgnoreCase("XPATH")) {
			return By.xpath(locValue);
		}
		
		else if (locType.equalsIgnoreCase("CSSSELECTOR")) {
			return By.cssSelector(locValue);
		}
		
		else if (locType.equalsIgnoreCase("LINKTEXT")) {
			return By.linkText(locValue);
		}
		
		else if (locType.equalsIgnoreCase("PARTIALLINKTEXT")) {
			return By.partialLinkText(locValue);
		}
	
		return null;

	}
}
