package SP_Offline_BLIL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Quotation_generation {

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
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//app-basicinfosearch/form/div/div/div[1]/div/div/nav/div/button[1]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[1]/header/nav/button[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-quoteproposal/app-quote/div[1]/div/button")).click();
		
		//String alertmsg =  driver.switchTo().alert().getText();
		//System.out.println(alertmsg);
		
		Thread.sleep(1000);
		
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//app-quoteproposal/app-quote/div[2]/div/div/div[3]/button[1]")).click();
		
		js.executeScript("window.scrollBy(0, 800)");
		
		driver.findElement(By.id("I_FIRST_NAME")).sendKeys("David");
		driver.findElement(By.id("I_LAST_NAME")).sendKeys("gunji");
		
		Select GENDER = new Select(driver.findElement(By.id("I_GENDER"))); //GENDER
		GENDER.selectByIndex(1);
		
		//Select OCCUPATION = new Select(driver.findElement(By.id("occupation"))); // OCCUPATION
		//OCCUPATION.selectByIndex(2495); 
		//OCCUPATION.selectByIndex(2);
		driver.findElement(By.id("occupation")).sendKeys("SOFTWARE ENGINEER");
		
		Select Marital_Status = new Select(driver.findElement(By.id("I_MARITAL_STATUS"))); // Marital Status
		Marital_Status.selectByIndex(2);
		
		driver.findElement(By.id("I_ANNUAL_INCOME")).sendKeys("00000");
		
		Select TITLE = new Select(driver.findElement(By.id("I_TITLE"))); // TITLE
		TITLE.selectByIndex(4);
		
		driver.findElement(By.id("I_DOB")).sendKeys("10-10-2020");
		
		Select country = new Select(driver.findElement(By.xpath("//app-policy-holder-plus-la/div[2]/form[2]/div/div/div/div[1]/div[1]/div/div[4]/div[5]/select"))); // NATIONALITY
		country.selectByIndex(6);
		
		Select EDUCATIONAL_QUALIFICATIONS = new Select(driver.findElement(By.id("I_EDUCATIONAL_QUALIFICATIONS"))); // EDUCATIONAL_QUALIFICATIONS
		EDUCATIONAL_QUALIFICATIONS.selectByIndex(1);
		
		Select RELATION = new Select(driver.findElement(By.xpath("//app-policy-holder-plus-la/div[2]/form[2]/div/div/div/div[1]/div[1]/div/div[7]/div[2]/select"))); // RELATION
		RELATION.selectByIndex(1);
		
		Select COUNTRY_OF_RESIDENCE = new Select(driver.findElement(By.xpath("//app-policy-holder-plus-la/div[2]/form[2]/div/div/div/div[1]/div[1]/div/div[5]/div[2]/select"))); // Country Of Residence 
		COUNTRY_OF_RESIDENCE.selectByIndex(16);
		
		driver.findElement(By.xpath("//div[2]/form[2]/div/div/div/div[2]/div/span/button[1]")).click(); // Save button
		
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-policy-holder-plus-la/div[2]/form[2]/div/header/nav/button[1]")).click();
		
		Thread.sleep(2000);
		Select base_plane = new Select(driver.findElement(By.id("Q_base_plane"))); // base_plane
		base_plane.selectByIndex(1);
		
		js.executeScript("window.scrollBy(0, 500)");
		
		Select Payment_Frequency = new Select(driver.findElement(By.name("Q_Payment_Frequency"))); // Payment_Frequency
		Payment_Frequency.selectByIndex(4);
		driver.findElement(By.id("Q_UNIT")).sendKeys("5");
		Select Premium_Type = new Select(driver.findElement(By.id("Q_Premium_Type"))); // Premium_Type
		Premium_Type.selectByIndex(1);
		Select Premium_Update = new Select(driver.findElement(By.id("Q_Premium_Update"))); // Premium_Update
		Premium_Update.selectByIndex(3);
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 500)");
		
		Select waiver_of_premium_rider = new Select(driver.findElement(By.id("waiver_of_premium_rider"))); // waiver_of_premium_rider
		waiver_of_premium_rider.selectByIndex(1);
		
		driver.findElement(By.xpath("//app-plan-a/div[3]/form/div[1]/div/div/div[1]/div/div[4]/button")).click(); //Add button(Save)
		
		js.executeScript("window.scrollBy(0, 700)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-plan-a/div[3]/form/div[2]/div/span/button[1]")).click();// Save 
		js.executeScript("window.scrollBy(0, 200)");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body > app-root > app-navbar > app-quoteproposal > app-plan-a > div:nth-child(4) > form > div.border.px-3.py-2.mb-5.ng-tns-c60-10 > div > span > button:nth-child(2)")).click();//submit 

	}

}
