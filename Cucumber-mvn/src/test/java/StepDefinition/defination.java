package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class defination {
	WebDriver driver;
	@Given("Login page")
	public void login_page(){
		//Write code here that turns the phrase above into concrete actions
		//what is my first step
				System.setProperty("webdriver.chrome.drive","C:\\chrome\\chromedriver_win32\\chromedriver.exe");
				//i am trying to create a new instance of chrome driver
				driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When ("Enter valid name{string}")
	public void enter_valid_name(String string){
		//Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
			
	}
	
	@When ("Enter valid password{string}")
	public void enter_valid_password (String string){
		//Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			
		
	}
	@When ("click on submit button")
	public void click_on_submit_button(){
		//Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then ("IShould see the userName as {string}")
	public void i_should_see_the_userName_as(String string) {
		//Write code here that turns the phrase above into concrete actions
		String Actual = driver.findElement(By.id("welcome")).getText();
	       String Expected = "Welcome RiyazdeenDharshan";
	       Assert.assertEquals(Expected, Actual);
	       //i will logout
	       driver.findElement(By.id("welcome")).click();
	       Thread.sleep(3000); 
	       driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
	       System.out.println("I am Succesfull logout");
	       Thread.sleep(3000);
	       driver.quit();
		
	}
}
