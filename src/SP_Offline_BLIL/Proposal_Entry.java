package SP_Offline_BLIL;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Proposal_Entry {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//!!! NOTE::DELETE THE Quotation_generation and generate new one every time before you Run the Propasal_Enrty
		
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[1]/header/nav/button[3]")).click();
         
		Thread.sleep(3000);
		driver.findElement(By.id("flexRadioDefault1")).click();
		driver.findElement(By.xpath("//app-quoteproposal/app-quote/div[3]/div/div/div[2]/div/button")).click();
		
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		
		driver.findElement(By.id("B_FIRST_NAME")).sendKeys("Sam");  //FIRST_NAME
		driver.findElement(By.id("B_LAST_NAME")).sendKeys("gunji");  //LAST_NAME
		driver.findElement(By.id("B_DOB")).sendKeys("10-10-2020");  //DOB
		driver.findElement(By.id("B_SHARE_RATE")).sendKeys("100");
		
		Select GENDER = new Select(driver.findElement(By.id("B_GENDER"))); //GENDER
		GENDER.selectByIndex(1);
		
		Select TITLE = new Select(driver.findElement(By.id("B_TITLE"))); // TITLE
		TITLE.selectByIndex(4);
		
		Select RELATION = new Select(driver.findElement(By.xpath("//app-review-proposal/div/form[2]/div/div/div/div[1]/div[4]/div[2]/select"))); // RELATION
		RELATION.selectByIndex(3);
		
		Select ID_TYPE = new Select(driver.findElement(By.id("B_ID_TYPE"))); // ID_TYPE
		ID_TYPE.selectByIndex(2); 
		driver.findElement(By.xpath("//app-proposal-information/app-review-proposal/div/form[2]/div/div/div/div[1]/div[6]/div[2]/input")).sendKeys("123");  //ID_NUMBER
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-proposal-information/app-review-proposal/div/form[2]/div/div/div/div[2]/div/span/button[1]")).click();//Add Button(save)
		
		js.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//app-proposal-information/app-review-proposal/div/div[3]/div/label[2]")).click();//Save button
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-proposal-information/app-review-proposal/div/div[3]/div/label[3]")).click(); // Next button
		Thread.sleep(2000);
		driver.findElement(By.id("O_INSUREDS_OCCUPATION")).sendKeys("SOFTWARE ENGINEER"); // INSUREDS_OCCUPATION
		
		Select EMPLOYMENT_STATUS = new Select(driver.findElement(By.id("O_EMPLOYMENT_STATUS"))); //EMPLOYMENT_STATUS
		EMPLOYMENT_STATUS.selectByIndex(3);
		
		
		driver.findElement(By.id("O_NAME_OF_COMPANY_OR_SCHOOL")).sendKeys("techbulls");//NAME_OF_COMPANY
		driver.findElement(By.id("O_NATURE_OF_BUSINESS")).sendKeys("ITSolutions");//NATURE_OF_BUSINESS
		js.executeScript("window.scrollBy(0, 1000)");
		driver.findElement(By.id("O_ADDRESS_OF_COMPANY_OR_SCHOOL")).sendKeys("Ongole");
		driver.findElement(By.id("O_EXACT_NATURE_OF_DUTIES")).sendKeys("ITSolutions and services Ltd"); //NATURE_OF_DUTIES
		driver.findElement(By.id("O_COUNTRY_OF_APPOINTMENT")).sendKeys("India");//Country Of Appointment
		
		
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-proposal-information/app-occpation-details/div/div/div/label[2]")).click();//Save button
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-proposal-information/app-occpation-details/div/div/div/label[3]")).click();  
		
		Select PREMIUM_METHOD = new Select(driver.findElement(By.id("PREMIUM_METHOD"))); //PREMIUM_METHOD
		PREMIUM_METHOD.selectByIndex(2);
		
		driver.findElement(By.xpath("//app-proposal/app-payment-information/div[2]/div/label[2]")).click(); //Save button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-proposal/app-payment-information/div[2]/div/label[3]")).click(); //Next button
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-declaration/app-existing-policy/div/div/div[1]/div/div/div/div/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//app-existing-policy/div/div/div[1]/div/div/div/div/div[3]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//app-existing-policy/div/div/div[1]/div/div/div/div/div[3]/div[4]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//app-declaration/app-existing-policy/div/div/div[2]/div/label[2]")).click(); //save button
		driver.findElement(By.xpath("//app-declaration/app-existing-policy/div/div/div[2]/div/label[3]")).click(); //Next button
		Thread.sleep(2000);
		
		driver.findElement(By.id("guideOption1")).click();
		js.executeScript("window.scrollBy(0, 1000)");
		driver.findElement(By.id("DECLARATION_AND_CONSENT_A2")).sendKeys("adithya.gunji@gmail.com"); //Email
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 100)");
		driver.findElement(By.xpath("//app-declaration/app-declaration-and-consent/form/div/div[2]/div/label[2]")).click();// Save button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//app-declaration/app-declaration-and-consent/form/div/div[2]/div/label[3]")).click(); // next button
		
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(1000);
		driver.findElement(By.name("DISCLOSURE_1E")).click();
		driver.findElement(By.name("DISCLOSURE_1D")).click();
		driver.findElement(By.name("DISCLOSURE_1C")).click();
		driver.findElement(By.name("DISCLOSURE_1B")).click();
		driver.findElement(By.name("DISCLOSURE_1A")).click();
		
		driver.findElement(By.xpath("//app-proposal/app-declaration/app-disclosure/form/div/div[2]/div/label[2]")).click();//Save button
		driver.findElement(By.xpath("//app-proposal/app-declaration/app-disclosure/form/div/div[2]/div/label[3]")).click(); // Next button 
		
		Thread.sleep(3000);
		Select POLICY_DELIVERY_OPTION = new Select(driver.findElement(By.id("POLICY_DELIVERY_OPTION"))); //POLICY_DELIVERY_OPTION
		POLICY_DELIVERY_OPTION.selectByIndex(1);
		//E_SIGN_OPTION 
		//Thread.sleep(2000);
		Select E_SIGN_OPTION = new Select(driver.findElement(By.xpath("//app-documents/div/form[1]/div/div[2]/div[2]/div[2]/div[2]/select"))); //E_SIGN_OPTION
		E_SIGN_OPTION.selectByIndex(1);
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-quoteproposal/app-proposal/app-documents/div/form[2]/div/div/div/div/div/nav/button[2]")).click();
		driver.findElement(By.xpath("//app-proposal/app-documents/div/form[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/button[1]")).click();
		
		//path of the pdf file : "C:\Users\adith\Downloads\Payslip_Mar_2023 (1).pdf"
		Robot rb = new Robot();
		rb.delay(1000);
		
		//put path to file in a clipboard
		StringSelection ss = new StringSelection("C:\\Users\\adith\\Downloads\\Payslip_Mar_2023 (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Thread.sleep(3000);
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);// press on CTRL key
		rb.keyPress(KeyEvent.VK_V);// press on CTRL key
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-proposal/app-documents/div/form[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/button[2]")).click();
		js.executeScript("window.scrollBy(0, 700)");
		Thread.sleep(1000);
		//path of the pdf file : "C:\Users\adith\Downloads\Payslip_Mar_2023 (1).pdf"
		driver.findElement(By.xpath("//app-proposal/app-documents/div/form[3]/div/div/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/button[1]")).click();
		Robot rb2 = new Robot();
		rb.delay(1000);
				
		//put path to file in a clipboard
		StringSelection ss2 = new StringSelection("C:\\Users\\adith\\Downloads\\Payslip_Mar_2023 (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2,null);
		Thread.sleep(1000);
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);// press on CTRL key
		rb.keyPress(KeyEvent.VK_V);// press on CTRL key
				
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		//Enter
  rb.keyPress(KeyEvent.VK_ENTER);
  rb.keyRelease(KeyEvent.VK_ENTER);
				
  Thread.sleep(2000);
  //driver.findElement(By.xpath("/html/body/app-root/app-navbar/app-quoteproposal/app-proposal/app-documents/div/form[3]/div/div/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/button[2]")).click();
  driver.findElement(By.xpath("//app-proposal/app-documents/div/form[3]/div/div/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/button[2]")).click();
  js.executeScript("window.scrollBy(0, 700)");
  Thread.sleep(1000);
  Select DOC_TYPE = new Select(driver.findElement(By.id("DOC_TYPE"))); //DOC_TYPE
  DOC_TYPE.selectByIndex(2);
  
  driver.findElement(By.xpath("//app-proposal/app-documents/div/form[4]/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/button[1]")).click();
  Thread.sleep(1000);
  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  Thread.sleep(1000);
	Robot rb3 = new Robot();
	rb.delay(1000);
//put path to file in a clipboard
		StringSelection ss3 = new StringSelection("C:\\Users\\adith\\Downloads\\Payslip_Mar_2023 (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3,null);
		Thread.sleep(3000);
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);// press on CTRL key
		rb.keyPress(KeyEvent.VK_V);// press on CTRL key
				
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		//Enter
  rb.keyPress(KeyEvent.VK_ENTER);
  rb.keyRelease(KeyEvent.VK_ENTER);
  Thread.sleep(1000);	
  
  driver.findElement(By.xpath("//app-proposal/app-documents/div/form[4]/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/button[2]")).click();

  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/app-root/app-navbar/app-quoteproposal/app-proposal/app-documents/div/div[3]/div/label[2]")).click();
  

  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  Thread.sleep(1000);
 
  
  driver.findElement(By.xpath("/html/body/app-root/app-navbar/app-quoteproposal/app-proposal/app-documents/div/div[3]/div/label[3]")).click();
  Thread.sleep(5000);
  driver.navigate().refresh();
  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  //driver.navigate().refresh();
  Thread.sleep(4000);
  driver.findElement(By.xpath("/html/body/app-root/app-navbar/app-quoteproposal/app-proposal/app-documents/div/div[3]/div/label[3]")).click();
	}

}
