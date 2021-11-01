package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	 WebDriver driver = null ;

	@Given("User is at gmail login page")
	public  void user_is_at_gmail_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prince\\Desktop\\SELENIUM\\chromedriver.exe");	   
		this.driver = new ChromeDriver();
		driver.get("https://accounts.google.com/servicelogin");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
	}
	
	@And("User Enters the {string}")
	public void user_enters_the(String username) {
	
	    
//		
		
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	 
	    
	}
	
	@And("User Enters the {string} and User clicks on Login button")
	public void user_enters_the_and_user_clicks_on_login_button(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user clicks on compose button and User enters the data in subject and body.")
	public void user_clicks_on_compose_button_and_user_enters_the_data_in_subject_and_body() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\":m5\"]/div/div")).click();
	    driver.findElement(By.xpath("//*[@id=\":rl\"]")).sendKeys("Incubyte");
	    driver.findElement(By.xpath("//*[@id=\":sq\"]")).sendKeys("\"Automation QA test for Incubyte");
	}

	@Then("The text are entered in respective fields")
	public void the_text_are_entered_in_respective_fields() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.close();
		driver.quit();
	}

}
