package SP_Offline_BLIL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Customer_Address {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost:3001/login");
		
		driver.findElement(By.id("agentcode")).sendKeys("650000909");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/form/div[1]/div/div/div/button")).click();
		driver.findElement(By.id("password")).sendKeys("Akhil123@");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/form/button")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form/div/div/div[1]/div/div/nav/div/button[1]")).click();
		driver.findElement(By.xpath("//form/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/app-profile/div/nav/button[2]")).click();
		
		Select ADDRESS_TYPE = new Select(driver.findElement(By.id("AD_ADDRESS_TYPE"))); //ADDRESS_TYPE(Postal Address)
		ADDRESS_TYPE.selectByIndex(1);
		
		driver.findElement(By.id("AD_ADDRESS")).sendKeys("Ongo@#le123");// Address
		driver.findElement(By.id("AD_CITY_STATE")).sendKeys("Ongo@#le123");// City/State
		driver.findElement(By.id("AD_POSTAL_CODE")).sendKeys("1-9-123BW");// Postal Code
		
		Select COUNTRY = new Select(driver.findElement(By.id("AD_COUNTRY"))); //COUNTRY(Postal Address)
		COUNTRY.selectByIndex(16);
		
		driver.findElement(By.xpath("//app-address/div[2]/form/div/div/div/div[2]/div/span/button[1]")).click(); // Save button
		
		Thread.sleep(3000);
		
		Select ADDRESS_TYPE2 = new Select(driver.findElement(By.id("AD_ADDRESS_TYPE"))); //ADDRESS_TYPE2(Residential Address)
		ADDRESS_TYPE2.selectByIndex(2);
		
		driver.findElement(By.id("AD_ADDRESS")).sendKeys("Ongo@#le123");// Address
		driver.findElement(By.id("AD_CITY_STATE")).sendKeys("Ongo@#le123");// City/State
		driver.findElement(By.id("AD_POSTAL_CODE")).sendKeys("1-9-123BW");// Postal Code
		
		Select COUNTRY_RD = new Select(driver.findElement(By.id("AD_COUNTRY"))); //COUNTRY(Residential Address)
		COUNTRY_RD.selectByIndex(16);
		
		driver.findElement(By.xpath("//app-address/div[2]/form/div/div/div/div[2]/div/span/button[1]")).click(); //Save button
		

	}

}
