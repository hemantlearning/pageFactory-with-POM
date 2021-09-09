package project_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class ExcelDataReader 
{
	/**
	 * 1. Add excel file path in properties
	 * 2. Add excel file sheetname in properties
	 * 3. Create a method of return type as Object with 2D array
	 * 4. Add DataProvider annotation and give the method name 
	 * 4. Read properties file
	 * 5. Load the excel sheet
	 * 6. count rows and columns inside excel sheet
	 * 7. read excel sheet and save it in 2D array
	 * 8. return it to test file 
	 */
	
	static Properties prop;
	@DataProvider(name = "TestDataDrivenHomePage")
	public static Object[][] TestDataDrivenHomePage() throws Exception{
		
		try {
			prop = new Properties();
			FileInputStream fis = new 
					FileInputStream(All_Constants.PropertiesFilePath);
			System.out.println("Properties file path is : "
			+All_Constants.PropertiesFilePath);
			
			prop.load(fis);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		String filePath = All_Constants.dirPath + prop.getProperty("ExcelFilePath");
		String SheetName = prop.getProperty("ExcelSheet");
		
		ExcelUtilities.setExcelFile(filePath, SheetName);
		
		int totalRows = ExcelUtilities.getRowCount(SheetName);
		int totalCols = ExcelUtilities.getColCount(SheetName);
		
		Object SavedDataFromExcel[][] = new Object[totalRows-1][totalCols];
		
		for(int i=1; i<totalRows;i++)
		{
			for(int j=0; j<totalCols;j++) 
			{
				SavedDataFromExcel[i-1][j]=ExcelUtilities.getCellData(i, j);
				System.out.println(SavedDataFromExcel[i-1][j]);
			}
		}
		
		return SavedDataFromExcel;
		
	}
}
