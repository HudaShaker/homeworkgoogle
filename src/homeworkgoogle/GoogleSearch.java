package homeworkgoogle;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearch extends parameterss {
	@Test()
	  public void verifiy_the_search_results() {
//		  driver.findElement(By.name("q")).sendKeys("Huda Shaker"+Keys.ENTER);
//		  String search_results= driver.findElement(By.id("result-stats")).getText();
//		  String splitedText [] = search_results.split(" ");
//		  System.out.println(splitedText[1]);
//		  
//		  String theNumberOfTheSearchResults = splitedText[1];
//		  String theNumberOfTheSearchResultsUpdated = theNumberOfTheSearchResults.replace(",","");
//		  
//		  int actualNumber=Integer.parseInt(theNumberOfTheSearchResultsUpdated);
//		  int expectedNumber = 10;
//		  
//		  myAssertion.assertEquals(actualNumber,expectedNumber,"test");
//        myAssertion.assertAll();
//          }}  

		 driver.findElement(By.name("q")).sendKeys("Huda Shaker"+Keys.ENTER);
		 String search = driver.findElement(By.id("result-stats")).getText();
		 String splited[] = search.split(" ");
		 System.out.println(splited[1]);
		 
		 String number =splited[1];
		 String numberUpdate = number.replace(",", "");
		 
		 int actual = Integer.parseInt(numberUpdate);
		 int expected = 10;
		 myAssertion.assertEquals(actual, expected);
		 myAssertion.assertAll();
		 
	}}         