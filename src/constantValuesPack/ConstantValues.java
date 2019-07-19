package constantValuesPack;

import utilites.ExcelReadWrite;

public class ConstantValues {

	public static final String excelPath = "E:\\Eclipse wrokspace\\08June2019\\GitHubProject2\\HybridFramework\\Indigo Test Cases.xlsx";
	public static final String browserType = ExcelReadWrite.readValues("TestCases", 1, 4);
	public static final String URL = ExcelReadWrite.readValues("TestCases", 2, 4);
	public static final String fromLocation = ExcelReadWrite.readValues("TestCases", 3, 4);
	public static final String toLocation = ExcelReadWrite.readValues("TestCases", 4, 4);
	public static final String monthValue = ExcelReadWrite.readValues("TestCases", 5, 4);
	public static final String yearValue = ExcelReadWrite.readValues("TestCases", 6, 4);
	public static final String dateValue = ExcelReadWrite.readValues("TestCases", 7, 4);
	
	public static String testScenarioSheet = "Test Scenarios";
	public static int runModeColumn = 2;
	public static int statusColumn = 3;

	public static int tc001row = 1;
	public static int tc002row = 2;
	public static int tc003row = 3;
	public static int tc004row = 4;
	
}
