package dk.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	
public class LaunchBrowsers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91805\\JAVA\\ECLIPSEMAVEN WORKSPACE\\Selenium1Project\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    String link=("https://www.redbus.in/");
	    driver.manage().window().maximize();
		driver.get(link);
		String url = driver.getCurrentUrl();
	  	System.out.println(url);
	  	String title= driver.getTitle();
	  	System.out.println(title);
	 
	    boolean t;
	    t=link.equals(url);
	   if(t==true) {
		 
		   System.out.println("Link Verified");
		   }
	   else {
	    System.out.println("Link Mismatch");
	}
	   Thread.sleep(3000);
	   WebElement cli=driver.findElement(By.id("sign-in-icon-down"));
	   cli.click();
	   WebElement signn=driver.findElement(By.id("signInLink"));
	   signn.click();
	   WebElement Phin=driver.findElement(By.id("mobileNoInp"));
	   Phin.sendKeys("8056708827");
	   WebElement usrTxt =driver.findElement(By.id("email"));
	   usrTxt.sendKeys("Dineshkumar");
	   WebElement passTxt =driver.findElement(By.name("pass"));
	   passTxt.sendKeys("Swathydins7");
	   WebElement btnClk=driver.findElement(By.name("login"));
	   btnClk.click();
	   
	   
	  }
}
