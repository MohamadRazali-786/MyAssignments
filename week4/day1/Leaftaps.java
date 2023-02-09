package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MOHAMEDRAZALI");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RAZALI");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("The salesforce");
        driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("600000");
        driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("57860");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("iam a optimuttaly person");
        driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Hi guys");
        driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("66677788866");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("syedali");
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("alli");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");  
        driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("76");
        driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("r#@786");
        driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91"); 
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("S25/473"); 
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("08"); 
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mohamadrazali098@gmail.com");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7448574089");
        driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("RAZALI");
        driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com/MohamadRazali-786/MyAssignments/upload/main");
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("RAZALI");
        driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3/42,2nd floor,Testleaf Softwares,Palavanthangal");
        driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600048");
        driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("786088");
        driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("MOHAHADD");
        driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("vandalur zoo");
        driver.findElement(By.className("smallSubmit")).click();
        }

}
