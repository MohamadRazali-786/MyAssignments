package week5.day5;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimonyTest {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("REGISTERED_BY")).sendKeys("Myself");
		driver.findElement(By.id("NAME")).sendKeys("Razali");
		driver.findElement(By.className("hp-gender")).click();
		WebElement findElement = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select selectDate=new Select(findElement);
		selectDate.selectByVisibleText("08");
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select selectMonth=new Select(findElement2);
		selectMonth.selectByVisibleText("Nov");
		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select selectYear=new Select(findElement3);
		selectYear.selectByVisibleText("2000");
		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select selectReligion=new Select(findElement4);
		selectReligion.selectByVisibleText("Muslim");
		WebElement findElement5 = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select selectMotherTongue=new Select(findElement5);
		selectMotherTongue.selectByVisibleText("Tamil");
		WebElement findElement6 = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select selectCountry=new Select(findElement6);
		selectCountry.selectByVisibleText("India");
	    driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("654743587");
	    driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("mohamadrazali098@gmail.com");
	    driver.close();



	}

}
