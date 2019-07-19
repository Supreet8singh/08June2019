package constantValuesPack;

public class ConstantLocators {

//	static String locatorValue_ParticularPage = "locatorType:locatorValue";
	
	public static String fromLocation_HomePage = "name:or-src";
	public static String toLocation_HomePage = "name:or-dest";
	public static String nextMonthIconLocation_HomePage = "xpath://*[starts-with(@id,'dp15')]/div/div[2]/div/a/span";
	public static String monthLocation_HomePage = "xpath://*[starts-with(@id,'dp15')]/div/div[2]/div/div/span[1]";
	public static String yearLocation_HomePage = "xpath://*[starts-with(@id,'dp15')]/div/div[2]/div/div/span[2]";
	public static String dateSelectionLocation_HomePage = "xpath://*[starts-with(@id,'dp15')]/div/div[2]/table/tbody/tr";
	public static String searchFlightLocation_HomePage = "xpath://*[@id='bookFlightTab']/form/div[7]/div[6]/button/span[1]";
	
	public static String flightPriceLocation_SearchFlightPage = "xpath://*[@id='bookingWidgetContainer']/div/div/div/div[2]/div[3]/div/div[1]/span";
	public static String contactUsLocation_SearchFlightPage = "linktext:Contact us";
	
	public static String CINLocation_ContactUsPage = "xpath:/html/body/div[6]/div[1]/div[1]/div/div[1]/div/div[1]/p[1]";
	public static String manageLocation_ContactUsPage = "linktext:Manage";
	public static String loungeServiceLocation_ContactUsPage = "linktext:Lounge Services";
	
	public static String allServicesLocation_LoungeServicesPage = "xpath://a[starts-with(@class,'ac_closed acc-lnk panel-title collapsed counterdisplay')]";
	
}
