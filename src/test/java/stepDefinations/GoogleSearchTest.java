package stepDefinations;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchTest {
	WebDriver driver =null;
	@SuppressWarnings("deprecation")
	@Given("Browser is open")
	public void browser_is_open() {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("project path is :" +projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40L,TimeUnit.SECONDS);
		System.out.println("inside step - Browser is open");
	    
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com/");
		
		System.out.println("inside step - user is on google search page");

	}

	@When("User enters a text in google search box")
	public void user_enters_a_text_in_google_search_box() {
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		
		System.out.println("inside step - User enters a text in google search box");

	}

	@And("Hit Enters")
	public void hit_Enters() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		System.out.println("Hit Enters");
	}

	@Then("User is Navigate to search results")
	public void user_is_Navigate_to_search_results() {
		driver.getPageSource().contains("Online Courses");
		
	    System.out.println("User is Navigate to search results");
	    driver.close();
	    driver.quit();
	}


}
