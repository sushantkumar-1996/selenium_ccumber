package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//selenium concept , not cucumber
//without page factory
public class PageClass {
	WebDriver driver=null;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By login=By.xpath("//input[@value='Log in']");
	
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	public void clicklink() {
		driver.findElement(lnc).click();
	}
	public void typename(String username) {
		driver.findElement(uname).sendKeys(username);
	}
	public void typepassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickonlogin() {
		driver.findElement(login).click();
	}

}
