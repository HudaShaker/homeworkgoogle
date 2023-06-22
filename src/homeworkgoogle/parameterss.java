package homeworkgoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

    public class parameterss {
     WebDriver driver = new ChromeDriver();
	 SoftAssert myAssertion = new  SoftAssert();
	
    @BeforeTest
	public void mysetup() {
    driver.get("https://www.google.com");
    } 
   
}
  