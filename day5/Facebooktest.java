package week5.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktest {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("firstname")).sendKeys("mohamad");
		driver.findElement(By.name("lastname")).sendKeys("razali");
		driver.findElement(By.name("reg_email__")).sendKeys("878656856");
		driver.findElement(By.id("password_step_input")).sendKeys("razali786@*");
		driver.findElement(By.id("day")).sendKeys("08");
		driver.findElement(By.id("month")).sendKeys("Nov");
		driver.findElement(By.id("year")).sendKeys("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.close();
	}

}
		
		