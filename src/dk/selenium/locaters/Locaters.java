package dk.selenium.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Locaters {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91805\\JAVA\\ECLIPSEMAVEN WORKSPACE\\Selenium1Project\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
String link =("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.get(link);
String url=driver.getCurrentUrl();
System.out.println(url);
String title=driver.getTitle();
System.out.println(title);
Thread.sleep(3000);


Actions a=new Actions(driver);


WebElement alert=driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2do')]"));
alert.click();

WebElement fash=driver.findElement(By.xpath("(//img[contains(@alt,'Fashion')])[1]"));
a.moveToElement(fash).perform();

String f=fash.getAttribute("alt");
System.out.println(f);
Thread.sleep(2000);

WebElement elec=driver.findElement(By.xpath("//img[@alt='Electronics']"));
a.moveToElement(elec).perform();


String e=elec.getAttribute("alt");
System.out.println(e);
Thread.sleep(2000);

WebElement home=driver.findElement(By.xpath("//img[@alt='Home']"));
a.moveToElement(home).perform();

String h=home.getAttribute("alt");
System.out.println(h);
Thread.sleep(2000);

WebElement appln=driver.findElement(By.xpath("//img[@alt='Appliances']"));
a.moveToElement(appln).perform();

String ap=appln.getAttribute("alt");
System.out.println(ap);
Thread.sleep(2000);

a.moveToElement(fash).perform();

WebElement wmEtn=driver.findElement(By.xpath("//a[(text()='Women Ethnic')]"));
a.moveToElement(wmEtn).perform();

WebElement wmSare=driver.findElement(By.xpath("//a[(text()='Women Sarees')]"));
a.moveToElement(wmSare).perform();

wmSare.click();

String saree=wmSare.getAttribute("alt");
System.out.println(saree);











}
}