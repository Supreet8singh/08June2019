package mainScript;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constantValuesPack.ConstantValues;
import testCases.TC001;
import testCases.TC002;
import testCases.TC003;
import testCases.TC004;
import utilites.CommonMethods;
import utilites.ExcelReadWrite;

public class DriverScript {
	
	@BeforeClass
	public void preCondition() throws Exception {
	ExcelReadWrite.openExcelWorkbook(ConstantValues.excelPath);	
	CommonMethods.browserType(ConstantValues.browserType);
	CommonMethods.openURL(ConstantValues.URL);
	}

	//--------------This is just for testing Jenkins----------------------
	//------------Second one -------------------------------
	//------------Third change for my Git Testing
	
	@Test(priority=1)
	public void tc01() throws Exception {
		//-----------------------TC001---------------------------------------------------------------------	
		if (ExcelReadWrite.readValues(ConstantValues.testScenarioSheet, ConstantValues.tc001row , ConstantValues.runModeColumn).equalsIgnoreCase("Y")) {
			TC001.tc001();	
			if (CommonMethods.bValue == false) {
				ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc001row , ConstantValues.statusColumn, "FAIL");
				Assert.assertTrue(false);
			} else if (CommonMethods.bValue == true) {
				ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc001row , ConstantValues.statusColumn, "PASS");
			}
		} else {
			ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc001row , ConstantValues.statusColumn, "SKIP");
		}
	}
	
	@Test(priority=2)
	public void tc02() throws Exception {
	
		//-----------------------TC002---------------------------------------------------------------------	
		if (ExcelReadWrite.readValues(ConstantValues.testScenarioSheet, ConstantValues.tc002row , ConstantValues.runModeColumn).equalsIgnoreCase("Y")) {
			TC002.tc002();	
			if (CommonMethods.bValue == false) {
				ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc002row , ConstantValues.statusColumn, "FAIL");
				Assert.assertTrue(false);
			} else if (CommonMethods.bValue == true) {
				ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc002row , ConstantValues.statusColumn, "PASS");
			}
		} else {
			ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc002row , ConstantValues.statusColumn, "SKIP");
		}
	}
	
	@Test(priority=3)
	public void tc03() throws Exception {
	
		//-----------------------TC003---------------------------------------------------------------------	
		if (ExcelReadWrite.readValues(ConstantValues.testScenarioSheet, ConstantValues.tc003row , ConstantValues.runModeColumn).equalsIgnoreCase("Y")) {
			TC003.tc003();
			if (CommonMethods.bValue == false) {
				ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc003row , ConstantValues.statusColumn, "FAIL");
				Assert.assertTrue(false);
			} else if (CommonMethods.bValue == true) {
				ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc003row , ConstantValues.statusColumn, "PASS");
			}
		} else {
			ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc003row , ConstantValues.statusColumn, "SKIP");
		}
	}
	
	@Test(priority=4)
	public void tc04() throws Exception {
		//-----------------------TC004---------------------------------------------------------------------	
		if (ExcelReadWrite.readValues(ConstantValues.testScenarioSheet, ConstantValues.tc004row , ConstantValues.runModeColumn).equalsIgnoreCase("Y")) {
			TC004.tc004();
			if (CommonMethods.bValue == false) {
				ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc004row , ConstantValues.statusColumn, "FAIL");
				Assert.assertTrue(false);
			} else if (CommonMethods.bValue == true) {
				ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc004row , ConstantValues.statusColumn, "PASS");
			}
		} else {
			ExcelReadWrite.writeValues(ConstantValues.testScenarioSheet, ConstantValues.tc004row , ConstantValues.statusColumn, "SKIP");
		}
	}	
	
	@Test(priority=5)
	public void tc05() throws Exception {

	}	
	
	@AfterClass
	public void close() {
		CommonMethods.closeBrowser();
	}
  }

