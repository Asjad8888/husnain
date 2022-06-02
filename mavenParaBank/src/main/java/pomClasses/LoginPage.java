package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath = "//input[@name='username']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement pass ;
	
	@FindBy (xpath = "//input[@value='Log In']")
	private WebElement logIn ;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName() {
		userName.sendKeys("Asjad88");
	}
	
	public void sendPass() {
		pass.sendKeys("gbU@37NNJS4sK9P");
	}
	
	public void clickLoginButton() {
		logIn.click();
	}
	
	//OR we can write
	
	public void loginToApplication() {
		userName.sendKeys("Asjad88");
		pass.sendKeys("gbU@37NNJS4sK9P");
		logIn.click();
	}
	
}
