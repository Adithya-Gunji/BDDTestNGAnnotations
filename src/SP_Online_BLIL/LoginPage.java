package SP_Online_BLIL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://83.143.27.72:8080/sp/ls/newsp/login.html?syskey_request_token=9af4c4c0bac73cfd22f29ce9e5dca0dc#/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("userId")).sendKeys("650000909");
		driver.findElement(By.id("password")).sendKeys("eBao123#");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div/form/div[3]/div[2]/button")).click();
		
		Thread.sleep(15000);
		driver.findElement(By.linkText("Policy Enquiry")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Application enquiry")).click();
		
		//Application numbers 2054895,2054603
		driver.findElement(By.id("applicationNumber")).sendKeys("2054895");
		Thread.sleep(2000);
		driver.findElement(By.id("ApplicationEnquiry_51")).click();
        String Appl_numb= driver.findElement(By.id("ApplicationEnquiry_79")).getText();
        System.out.println("Application number is : "+Appl_numb);
		

	}

}
