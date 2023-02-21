package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("firstname")).sendKeys("Mohamad");
		driver.findElement(By.name("lastname")).sendKeys("Razali");
		driver.findElement(By.name("reg_email__")).sendKeys("mohamadrazali098@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mohamadrazali098@gmail.com");
		//WebElement ele = driver.findElement(By.id("day"));
		//Select selectDay=new Select(ele);
		//selectDay.selectByIndex(08);
		driver.findElement(By.id("day")).sendKeys("08");
		driver.findElement(By.id("month")).sendKeys("11");
		driver.findElement(By.id("year")).sendKeys("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	}

}
