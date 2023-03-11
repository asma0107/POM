package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class ParallelTest {
  public WebDriver driver;
  @Test
  public void ChromeTest() {
	  ChromeOptions coption = new ChromeOptions();
	  coption.addArguments("--headless");
	  driver = new ChromeDriver(coption);
	  driver.get("https://www.facebook.com");
	  System.out.println(driver.getTitle());
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
//	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
//	  WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
//	  UserName.sendKeys("ravinangre@gmail.com");
//	  PassWord.sendKeys("123432134");
//	  LoginBtn.click();
  }
  @Test
  public void FireFoxTest() {
	  FirefoxOptions foption = new FirefoxOptions();
	  foption.addArguments("--headless");
	  driver = new FirefoxDriver(foption);
	  driver.get("https://www.facebook.com");
	  System.out.println(driver.getTitle());

//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
//	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
//	  WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
//	  UserName.sendKeys("ravinangre@gmail.com");
//	  PassWord.sendKeys("123432134");
//	  LoginBtn.click();
  }
  @Test
  public void EdgeTest() {
	  EdgeOptions eoption=new EdgeOptions();
	  eoption.addArguments("--headless");
	  driver = new EdgeDriver(eoption);
	  driver.get("https://www.facebook.com");
	  System.out.println(driver.getTitle());

//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
//	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
//	  WebElement LoginBtn = driver.findElement(By.tagName("button"));
//	  UserName.sendKeys("ravinangre@gmail.com");
//	  PassWord.sendKeys("123432134");
//	  LoginBtn.click();
  }
}
