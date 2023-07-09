package SP_Offline_BLIL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://10.1.114.51/spoffline");
		
		driver.findElement(By.id("agentcode")).sendKeys("650006442");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/form/div[1]/div/div/div/button")).click();
		driver.findElement(By.id("password")).sendKeys("Akhil123@");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/form/button")).click();

	}

}
