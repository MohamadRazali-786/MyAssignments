package week5.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://uibank.uipath.com/register-account");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Mohamad");
		
		driver.findElement(By.xpath("//select[@id='title']")).click();
		WebElement tit = driver.findElement(By.xpath("//select[@id='title']"));
		Select selectTitle=new Select(tit);
		selectTitle.selectByValue("mr");
		
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Razali");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("S");
		
		
		driver.findElement(By.xpath("//select[@id='sex']")).click();
		WebElement gender = driver.findElement(By.xpath("//select[@id='sex']"));
		Select sex=new Select(gender);
		sex.selectByValue("male");
		
		
		driver.findElement(By.xpath("//select[@id='employmentStatus']")).click();
		WebElement status = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		Select employe=new Select(status);
		employe.selectByVisibleText("Full-time");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Mohamadrazali");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mohamadrazali098@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testleaf012");
		
		driver.close();
	}

}
