package utilites;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
	public static WebDriver driver;
	public static boolean tableValue = false;
	public static String all;
	public static String value;
	public static boolean bValue = true;
	
	public static void screenShots(String picName) throws Exception {
		try {
			Date d = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("ddMMyy@hh@mm@ss");
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(System.getProperty("user.dir") + "\\Screenshots\\" + picName + "@" + sf.format(d) + ".png");
			FileUtils.moveFile(src, dest);			
		} catch (Exception e) {
			System.out.println("Screenshot method not working");
			e.printStackTrace();
		}

	}
	
	public static WebDriver browserType(String browserName) {
		
		if (browserName.equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();		
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();		
			driver.manage().window().maximize();
		}
	
	return driver;
	} 
	
	public static void openURL(String testData) throws Exception {
		try {
			driver.get(testData);
		} catch (Exception e) {
			bValue = false;
			screenShots("Url");
			e.printStackTrace();
		}
	}
	
	public static void handlingKeyBoardKeys(Keys testData, String locVariable) throws Exception {
		try {
			WebElement element = driver.findElement(LocatorSplit.splitLocator(locVariable));
			element.sendKeys(testData);
		} catch (Exception e) {
			bValue = false;
			screenShots("KeyboardKeys");
			e.printStackTrace();
		}
	}
	
	//This method is for working with textboxes
	public static void handlingTextBoxes(String testData, String locVariable) throws Exception {
		try {
			WebElement element = driver.findElement(LocatorSplit.splitLocator(locVariable));
			element.sendKeys(testData);
		} catch (Exception e) {
			bValue = false;
			screenShots("TextBoxes");
			e.printStackTrace();
		}
	}
	
		//This method is for working with clicks
	public static void handlingClicks(String locVariable) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorSplit.splitLocator(locVariable)));
			element.click();
		} catch (Exception e) {
			bValue = false;
			screenShots("Clicks");
			e.printStackTrace();
		}
	}
	
	public static String fetchValues(String locVariable) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorSplit.splitLocator(locVariable)));
			value = element.getText();
		} catch (Exception e) {
			bValue = false;
			screenShots("fetchvalues");
			e.printStackTrace();
		}
		return value;
	}
	
		//This method is for working with mousehovering without click
	public static void mouseHoveringWithoutClick(String locVariable) throws Exception {
		try {
			Actions act = new Actions(driver);
			WebElement element = driver.findElement(LocatorSplit.splitLocator(locVariable));
			act.moveToElement(element).perform();
		} catch (Exception e) {
			bValue = false;
			screenShots("hoverwithoutclick");
			e.printStackTrace();
		}
	}
	
	public static void mouseHoveringWithClick(String locVariable) throws Exception {
		try {
			Actions act = new Actions(driver);
			WebElement element = driver.findElement(LocatorSplit.splitLocator(locVariable));
			act.moveToElement(element).click().perform();
		} catch (Exception e) {
			bValue = false;
			screenShots("hoverwithclick");
			e.printStackTrace();
		}
	}
	
	public static void handlingDropDowns(String testData, String locVariable) throws Exception {
		try {
			WebElement element = driver.findElement(LocatorSplit.splitLocator(locVariable));
			Select sel = new Select(element);
			sel.selectByVisibleText(testData);
		} catch (Exception e) {
			bValue = false;
			screenShots("dropdowns");
			e.printStackTrace();
		}
	}
	
	public static void switchWindow(int windowNo) throws Exception {
		try {
			List<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allwindows.get(windowNo));
		} catch (Exception e) {
			bValue = false;
			screenShots("switchwindow");
			e.printStackTrace();
		}
	}
	
	public static void handlingTables(String testData, String locVariable) throws Exception {
	//Find out how many rows are there
			
		try {
			List<WebElement> allRows = driver.findElements(LocatorSplit.splitLocator(locVariable));	
			int noOfRows = allRows.size();
			System.out.println("The number of rows are :" + noOfRows);
	//----------------------------------	
			for (int i = 0; i < noOfRows; i++) {
				if (CommonMethods.tableValue == false) {
					//Find out how many columns are there
					List<WebElement> allTableData = allRows.get(i).findElements(By.tagName("td"));

						int noofColumns = allTableData.size();
							System.out.println("The number of columns are :" + noofColumns);
								//Fetch the value from each table data
									for (int j = 0; j < noofColumns; j++) {
										String value = allTableData.get(j).getText();

											System.out.println("The value in the row number : " + i + " is =" + value);
											
											if (value.equals(testData)) {
												allTableData.get(j).click();
												CommonMethods.tableValue = true;
												break;
											}
				}
			}	
				else if (CommonMethods.tableValue == true) {
				break;
			}				
		}
		} catch (Exception e) {
			bValue = false;
			screenShots("tables");
			e.printStackTrace();
		}
	}
	
	public static String fetchingMultiplValues(String locVariable) throws Exception {
		try {
			List<WebElement> allServices = driver.findElements(LocatorSplit.splitLocator(locVariable));
			
			for (int i = 0; i < allServices.size(); i++) {
				all = allServices.get(i).getText();
				System.out.println(all);
			}
		} catch (Exception e) {
			bValue = false;
			screenShots("fetchmultiplevalules");
			e.printStackTrace();
		}
			return all;
	}
	
	public static void closeBrowser() throws Exception {
			try {
				driver.quit();
			} catch (Exception e) {
				screenShots("closebrs");
				bValue = false;
				e.printStackTrace();
			}
	}
	
	
}
