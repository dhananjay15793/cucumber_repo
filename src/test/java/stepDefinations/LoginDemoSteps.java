package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
	WebDriver driver =null;
	@Given("Browser is open")
	public void browser_is_open() {
		String projectPath=System.getProperty("user.dir");
		System.out.println("project path is :" +projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("inside step - Browser is open");
		
	    
	}

	@And("user is in login page")
	public void user_is_in_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
		
	    
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username,String Passwoed) throws InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(Passwoed);
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    driver.findElement(By.id("logout")).isDisplayed();
	    System.out.println("logout is present TC :- Pass");
	    driver.close();
	    driver.quit();
		
	}


}
