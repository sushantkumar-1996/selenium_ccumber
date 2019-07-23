package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class pomimplementation {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSERS AND DRIVERS\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 /*PageClass pobj=new PageClass(driver);
		 
		 driver.get("http://demowebshop.tricentis.com");
		 driver.manage().window().maximize();
		 pobj.clicklink();
		 String username="happiness641996@gmail.com";
		pobj.typename(username);
		 String password="skdemowebshop";
		pobj.typepassword(password);
		 pobj.clickonlogin();
		 System.out.println(driver.getTitle());
		 */
		 //can also be done using testng class
		 //pagefactory implementation
		 driver.get("http://demowebshop.tricentis.com");
		 
		 driver.manage().window().maximize();
		 PageClassUsingPf obj=PageFactory.initElements(driver, PageClassUsingPf.class);
		 obj.loginMethod("happiness641996@gmail.com","skdemowebshop");
		 
	}
}
