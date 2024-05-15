package practice_1;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_DataDriven_testTest {

  @Test(dataProvider= "getData")
  public void loginTestTest(String uname, String pass) {
	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disbale-notifications");
	  
	  Map<String , Object> prefs = new HashMap<>();
	  prefs.put("profile.default_content_settings.geolocation", 1);
	  options.setExperimentalOption("prefs", prefs);
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver(options);
	  WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	  driver.findElement(By.id("username")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.id("submit")).click();
	  
	  try {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(), 'Congratulation')]")));
		  String actual =driver.findElement(By.xpath("//strong[contains(text(), 'Congratulation')]")).getText();
		
		  String expected = "Congratulations student. You successfully logged in!";
		 
		  if(expected.equalsIgnoreCase(actual)) {
			 System.out.println("user logged in");
			 driver.findElement(By.xpath("//a[normalize-space() = 'Log out']"));
		  }
		  
	  }
	  catch(Exception e){
		  System.out.println("invalid user");
		  
	  }
	  driver.close();
  }
	  
	  
	  /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(), 'Congratulation')]")));
	  String actual =driver.findElement(By.xpath("//strong[contains(text(), 'Congratulation')]")).getText();
	
	  String expected = "Congratulations student. You successfully logged in!";
	 
	  if(expected.equalsIgnoreCase(actual)) {
		 System.out.println("user logged in");
		 driver.findElement(By.xpath("//a[normalize-space() = 'Log out']"));
		 
	 }
	 else {
		 System.out.println("invalid credentials");
	 }
	  driver.close(); */
  
  @DataProvider
  public Object[][] getData() {
	  
	  Object[][] data = new Object[3][2]; 
	  data[0][0] = "hdbsdiuofhoe";
	  data[0][1] = "hdbsdiuofhoe";
	  data[1][0] = "hdbsdiuofhoe";	
	  data[1][1] = "hdbsdiuofhoe";
	  data[2][0] = "student";
	  data[2][1] = "Password123";
	  return data;
	  
	
  }
}
