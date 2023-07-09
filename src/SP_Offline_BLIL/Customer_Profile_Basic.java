package SP_Offline_BLIL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Customer_Profile_Basic {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://10.1.114.51/spoffline");
		
		driver.findElement(By.id("agentcode")).sendKeys("650006442");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/form/div[1]/div/div/div/button")).click();
		driver.findElement(By.id("password")).sendKeys("Akhil123@");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/form/button")).click();
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/app-root/app-basicinfosearch/div[2]/nav/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-basicinfosearch/div[3]/nav")).click(); //Add New Leads
		
		driver.findElement(By.id("A_FIRST_NAME")).sendKeys("bittu");
		driver.findElement(By.id("A_LAST_NAME")).sendKeys("gunji");
		driver.findElement(By.id("A_MOBILE")).sendKeys("9666108118");//MOBILE
		driver.findElement(By.id("A_PERSONAL_EMAIL")).sendKeys("adithya.gunji@gmail.com");//PERSONAL_EMAIL
		driver.findElement(By.id("A_OFFICIAL_EMAIL")).sendKeys("adithya.g@techbulls.co.in");//OFFICIAL_EMAIL
		driver.findElement(By.id("A_RES_NUMBER")).sendKeys("1-12-23G");//RES_NUMBER
		driver.findElement(By.id("A_OFFICE_NUMBER")).sendKeys("9666180119");//OFFICE_NUMBER
		driver.findElement(By.id("A_WEIGHT")).sendKeys("65");//WEIGHT
		driver.findElement(By.id("A_ANNUAL_INCOME")).sendKeys("800000");//ANNUAL_INCOME
		driver.findElement(By.id("A_COMMENTS")).sendKeys("customer_basicInf");//COMMENTS
		driver.findElement(By.id("A_COMPANY_NAME")).sendKeys("techbulls");//COMPANY_NAME
		driver.findElement(By.id("A_HEIGHT")).sendKeys("174");//HEIGHT
		
		Select se = new Select(driver.findElement(By.id("A_TITLE")));
		se.selectByIndex(4);
		
		driver.findElement(By.id("A_DOB")).sendKeys("10-10-1995");
		
		Select gen = new Select(driver.findElement(By.id("A_GENDER")));// Gender selection
		gen.selectByIndex(1);
		
		Select CR = new Select(driver.findElement(By.id("COUNTRY_OF_RESIDENCE"))); //country of Residence
		CR.selectByIndex(16);
		
		Select ID_TYPE = new Select(driver.findElement(By.id("A_ID_TYPE"))); //ID_TYPE
		ID_TYPE.selectByIndex(2);
		driver.findElement(By.id("A_ID_NUMBER")).sendKeys("1234555");//ID_NUMBER // NOTE:=>ID_NUMBER_MUST_BE_UNQUE
		
		Select Marital_Status = new Select(driver.findElement(By.id("A_MARITAL_STATUS"))); // Marital Status
		Marital_Status.selectByIndex(2);
		
		Select E_Q = new Select(driver.findElement(By.id("A_EDUCATIONAL_QUALIFICATIONS"))); // Educational Qualification
		E_Q.selectByIndex(4);
		
		Select E_S = new Select(driver.findElement(By.id("A_EMPLOYMENT_STATUS"))); // Employment Status 
		E_S.selectByIndex(3);
		
		Select SMOKER_STATUS = new Select(driver.findElement(By.id("A_SMOKER_STATUS"))); // SMOKER_STATUS
		SMOKER_STATUS.selectByIndex(1);
		
		Select NATIONALITY = new Select(driver.findElement(By.id("A_NATIONALITY"))); //NATIONALITY
		NATIONALITY.selectByIndex(1);
		
		//Select OCCUPATION = new Select(driver.findElement(By.id("OCCUPATION"))); // OCCUPATION
		//OCCUPATION.selectByIndex(2495);// its taking too long to browse due to length then ignore 
		//OCCUPATION.selectByIndex(2);
		driver.findElement(By.id("OCCUPATION")).sendKeys("SOFTWARE ENGINEER");
		
		Select COUNTRY_OF_BIRTH = new Select(driver.findElement(By.id("A_COUNTRY_OF_BIRTH"))); //COUNTRY_OF_BIRTH
		COUNTRY_OF_BIRTH.selectByIndex(16);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//app-basicinfo/form/div/div/div/div/div[2]/div/span/button[2]")).click(); //Save button

	}

}
