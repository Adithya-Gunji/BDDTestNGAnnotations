package SP_Offline_BLIL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Customer_FamilyInfo {

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
		driver.findElement(By.xpath("//app-profile/div/nav/button[3]")).click();
		
		driver.findElement(By.id("I_FIRST_NAME")).sendKeys("Dav@#id123");
		driver.findElement(By.id("I_LAST_NAME")).sendKeys("gu#$123nji");
		driver.findElement(By.id("A_DOB")).sendKeys("10-10-2000");
		
		Select RELATION = new Select(driver.findElement(By.id("I_PH_RELATION"))); //RELATION
		RELATION.selectByIndex(1);
		
		Select GENDER = new Select(driver.findElement(By.id("I_GENDER"))); //GENDER
		GENDER.selectByIndex(1);
		
		//Select OCCUPATION = new Select(driver.findElement(By.id("OCCUPATION"))); // OCCUPATION
		//OCCUPATION.selectByIndex(2495); 
		//OCCUPATION.selectByIndex(2);
		driver.findElement(By.id("OCCUPATION")).sendKeys("SOFTWARE ENGINEER");
		
		Select SMOKER_STATUS = new Select(driver.findElement(By.id("I_SMOKER_STATUS"))); // SMOKER_STATUS
		SMOKER_STATUS.selectByIndex(1);
		
		Select Marital_Status = new Select(driver.findElement(By.id("I_MARITAL_STATUS"))); // Marital Status
		Marital_Status.selectByIndex(2);
		
		Select E_Q = new Select(driver.findElement(By.id("I_EDUCATIONAL_QUALIFICATIONS"))); // Educational Qualification
		E_Q.selectByIndex(4);
		
		driver.findElement(By.id("I_MOBILE")).sendKeys("9666108118");//MOBILE
		driver.findElement(By.id("I_PERSONAL_EMAIL")).sendKeys("adithya.gunji@gmail.com");//PERSONAL_EMAIL
		driver.findElement(By.id("I_ANNUAL_INCOME")).sendKeys("20000");//ANNUAL_INCOME
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/app-root/app-navbar/app-profile/app-family/div/div/form/div/div/div/div[2]/div/span/button[1]")).click();//Save button

	}

}
