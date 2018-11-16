package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Base.MethodsCalling;
import Base.VariablesCalling;


public class TestScripts {
	public static WebDriver driver;
	protected static VariablesCalling var1=new VariablesCalling();
	protected static MethodsCalling method=new MethodsCalling();
	@Test(priority=0,enabled=true)
	public void Register() throws InterruptedException {
		
		try {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get(var1.websiteurl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(var1.signup)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys(var1.ProfileName);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[3]/input")).sendKeys(var1.MobileNumber);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[4]/input")).sendKeys(var1.password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[5]")).click();
		Thread.sleep(2000);
		String error1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div/span/div/div/div")).getText();
		System.out.println("error message shown if user is already registered:"+"/n"+error1);
		Thread.sleep(1000);
		}
		catch(Exception e) {
			Reporter.log("Unable to register", true);
		}
		driver.quit();
	}
	@Test(priority=1,enabled=true)
	public void LoginUsingPassword() throws InterruptedException {
		try {
		method.LoginUsingPassword();
		}
		catch(Exception e) {
			Reporter.log("Unable to login Using Password", true);
		}
		driver.quit();
	}
	@Test(priority=2,enabled=true)
	public void LoginUsingOTP() throws InterruptedException {
		String otp=null;
		try {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://dotball.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"nav-mobile\"]/li[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("8123555232");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[2]/div/p/span")).click();
		Thread.sleep(10000);
		
		WebElement dat=driver.findElement(By.className("UI"));
		WebElement tst_1=dat.findElement(By.tagName("table"));
		//WebElement tst_2=tst_1.findElement(By.tagName("tbody"));
		List<WebElement> tst_3= tst_1.findElements(By.tagName("tr"));
		for(int i=0;i<tst_3.size();i++){
			String details=tst_3.get(0).getText();
			if (details.contains("HP-DOTBAL")) {
			String otp1=details.split(":")[2];
			otp=otp1.substring(0, 4);
			System.out.println(otp);
			break;
			}
		}
		Thread.sleep(3000);
		driver.get("https://dotball.com/verifyOtp?login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/div/div[2]/div/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys(otp);
		System.out.println(otp);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div")).click();
		Thread.sleep(5000);
		}
		catch(Exception e) {
			Reporter.log("Unable to login Using OTP", true);
		}
		driver.quit();
	}
	@Test(priority=3,enabled=true)
  public void CreateTeam() throws InterruptedException {
		try {
	    method.LoginUsingPassword();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[4]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul/li[1]")).click();
		
		WebElement tabclas=driver.findElement(By.className("ant-table-body"));
		WebElement tab=tabclas.findElement(By.tagName("table"));
		
		List<WebElement> trow= tab.findElements(By.tagName("tr"));
		for(int i=0;i<trow.size();i++){
			trow.get(0).click();
			break;
		}
	
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul/li[2]")).click();
		
		WebElement tabclas1=driver.findElement(By.className("ant-table-body"));
		WebElement tab1=tabclas1.findElement(By.tagName("table"));
		List<WebElement> trow1= tab1.findElements(By.tagName("tr"));
		for(int j=0;j<trow1.size();j++) {
			//String Bowlers=trow.get(j).getText();
			trow1.get(7).click();
			trow1.get(8).click();
			trow1.get(9).click();
			trow1.get(10).click();
			trow1.get(11).click();
			break;
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul/li[3]")).click();
		WebElement tabclas2=driver.findElement(By.className("ant-table-body"));
		WebElement tab2=tabclas2.findElement(By.tagName("table"));
		List<WebElement> trow2= tab2.findElements(By.tagName("tr"));
		for(int k=0;k<trow2.size();k++) {
			//String Allrounder=trow.get(k).getText();
			trow2.get(0).click();
			trow2.get(1).click();
			trow2.get(2).click();
			trow2.get(3).click();
			break;
				}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul/li[4]")).click();
		WebElement tabclas3=driver.findElement(By.className("ant-table-body"));
		WebElement tab3=tabclas3.findElement(By.tagName("table"));
		List<WebElement> trow3= tab3.findElements(By.tagName("tr"));
		for(int l=0;l<trow3.size();l++) {
			//String Allrounder=trow.get(l).getText();
			trow3.get(0).click();
			break;
				}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div/div/div/div/div/div/table/tbody/tr[1]/td[3]/div/span[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div/div/div/div/div/div/table/tbody/tr[6]/td[3]/div/span[2]")).click();
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[4]/div")).click();
		}
		catch(Exception e) {
			Reporter.log("Unable to create team", true);
		}
	   driver.quit();
  }
	
	}


