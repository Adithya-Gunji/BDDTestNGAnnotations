package SP_Offline_BLIL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NEW_FNA {

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
		driver.findElement(By.xpath("//app-basicinfosearch/form/div/div/div[1]/div/div/nav/div/button[1]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		
		driver.findElement(By.xpath("//form/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/a")).click();
		
		driver.findElement(By.xpath("//app-navbar/div[1]/header/nav/button[2]")).click(); //FNA
		driver.findElement(By.xpath("//app-main-fna/app-fna-search-info/div[2]/div/button")).click();//NEW_FNA
		driver.findElement(By.id("APPLICANT_NoOfDependents")).sendKeys("1"); //NO_OF_CHILD
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-fna/form/div[1]/div/div[3]/div/div/div/div/div/nav/button[1]")).click();

		driver.findElement(By.xpath("//app-fna/form/div[1]/div/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/button")).click();//Funeral Cover
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		driver.findElement(By.id("RP_FUN_Q1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("RP_FUN_Q1_MYSELF")).sendKeys("90000");
		driver.findElement(By.id("RP_FUN_Q1_CHILDREN")).sendKeys("80000");
		driver.findElement(By.id("RP_FUN_Q2_MYSELF")).sendKeys("50000");
		driver.findElement(By.id("RP_FUN_Q2_CHILDREN")).sendKeys("10000");
		Thread.sleep(1000);
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0, 1200)");
		
		driver.findElement(By.id("REC_ADV_RECOMMEND")).sendKeys("BMFW-1");
		driver.findElement(By.id("REC_ADV_AGREED")).sendKeys("Agree");
		
		driver.findElement(By.xpath("//app-main-fna/app-fna/form/div[2]/div/div[2]/div/span/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-fna/form/div[2]/div/div[2]/div/span/button[3]")).click(); 
		
		//driver.findElement(By.xpath("//app-fna/form/div[2]/div/div[2]/div/span/button[1]")).click(); // Click on Back button
		
		driver.findElement(By.id("flexRadioDefault1")).click();// selecting radio button
		
	/*	//Deleting FNA
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-fna-search-info/div[3]/div/div/div[1]/div/table/tbody[2]/tr/td[6]/span/button")).click();//Deleting FNA
		
		//View FNA Details 
		Thread.sleep(2000);
		driver.findElement(By.id("flexRadioDefault1")).click();// selecting radio button
		driver.findElement(By.xpath("//app-fna-search-info/div[3]/div/div/div[2]/div/span/nav/ul/li/button[2]")).click();
		
		Thread.sleep(2000);
		JavascriptExecutor js4 = (JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0, 2500)");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-main-fna/app-fna/form/div[2]/div/div[2]/div/span/button[1]")).click(); */
		
	}

}
