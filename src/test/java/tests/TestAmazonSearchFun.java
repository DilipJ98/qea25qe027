package tests;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import keywords.ActionsClass;
import utils.ReadXLDataAmazon;
import utils.ReadXlData;

public class TestAmazonSearchFun {
	
	@DataProvider(name = "data")
	public Object[][] dataProducer() throws IOException {
		return ReadXLDataAmazon.dataReader();
	}
	
	
	@Test(dataProvider = "data")
	public void testSearchBar(String testDataXl, String expectedData) throws IOException {
		ActionsClass actions = new ActionsClass();
		for (int i = 1; i < ReadXlData.rowCount(); i++) {
			String action = ReadXlData.readData(i, 1);
			String locatorName = ReadXlData.readData(i, 2);
			String locatorValue = ReadXlData.readData(i, 3);
			String testData = ReadXlData.readData(i, 4);
				
			switch(action) {
				case "openBrowser" : actions.openBrowser();
					break;
				case "navigate" : actions.navigate(testData);
					Assert.assertEquals(actions.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
					break;
				case "enterText" : actions.enterText(locatorName, locatorValue,  testDataXl);
					break;
				case "clickBtn" : actions.clickBtn(locatorName, locatorValue);
					break;
				case "verify" : String textToVerify = actions.verify(locatorName, locatorValue.replace("aptops", expectedData.substring(1)));
				Assert.assertTrue(textToVerify.toLowerCase().contains(expectedData));
				break;
				case "closeBrowser" : actions.closeBrowser();
					break;
				default : System.out.println("None of these actions are matching");
			}
		}
	}
}
