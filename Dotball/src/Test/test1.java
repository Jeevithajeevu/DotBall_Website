package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void setup() throws InterruptedException {
		String a[]=new String[2];
		int i;
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
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[3]/input")).sendKeys("jeevitha");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[1]/div[5]")).click();
		Thread.sleep(3000);
		WebElement web =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div[2]"));
		List<WebElement> images=web.findElements(By.tagName("img"));
		for(i=0;i<images.size();i++) {
			 a[i]=images.get(i).getAttribute("src");
			System.out.println(a[i]);	
		}
		
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[4]")).click();
		Thread.sleep(3000);
		WebElement tabclas=driver.findElement(By.className("ant-table-body"));
		WebElement tbod=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/table/tbody"));
		
		List<WebElement> trow= tabclas.findElements(By.tagName("img"));
		for(int q=0;q<1;q++){
			System.out.println(a[0]);
			if(trow.get(q).getAttribute("src").contains(a[0])) 
				trow.get(q).click();
				Thread.sleep(3000);
				break;
			
		}
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul/li[2]")).click();
		List<WebElement> trow1= tabclas.findElements(By.tagName("img"));
		for(int j=0;j<3;j++) {
			if(trow1.get(j).getAttribute("src").contains(a[0])) {
				trow1.get(j).click();
				Thread.sleep(3000);
			}
		}
			
		
		
		
		WebElement tabclas1=driver.findElement(By.className("ant-table-body"));
		WebElement tab1=tabclas1.findElement(By.tagName("table"));
		List<WebElement> trow2= tab1.findElements(By.tagName("tr"));
		
		for(int k=0;k<2;k++) {
			System.out.println(123);
			System.out.println(trow2.get(k).getAttribute("src"));
			System.out.println(a[1]);
			System.out.println(trow2.get(k).getText());{
			if(trow2.get(k).getText().equalsIgnoreCase("TWS")) 
				trow2.get(k).click();
			    Thread.sleep(3000);	
			}
			}
		driver.quit();	
		}
			
		
		}
		
		
		/*driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div[7]")).click();
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
			trow.get(1).click();
			break;
		}
	
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul/li[2]")).click();
		
		WebElement tabclas1=driver.findElement(By.className("ant-table-body"));
		WebElement tab1=tabclas1.findElement(By.tagName("table"));
		List<WebElement> trow1= tab1.findElements(By.tagName("tr"));
		for(int j=0;j<trow1.size();j++) {
			//String Bowlers=trow.get(j).getText();
			trow1.get(0).click();
			trow1.get(1).click();
			trow1.get(5).click();
			trow1.get(6).click();
			trow1.get(7).click();
			break;
		}
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul/li[3]")).click();
		WebElement tabclas2=driver.findElement(By.className("ant-table-body"));
		WebElement tab2=tabclas2.findElement(By.tagName("table"));
		List<WebElement> trow2= tab2.findElements(By.tagName("tr"));
		for(int k=0;k<trow2.size();k++) {
			//String Allrounder=trow.get(k).getText();
			trow2.get(0).click();
			trow2.get(1).click();
			trow2.get(6).click();
			trow2.get(7).click();
			break;
				}
			
	
		
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
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[4]/div")).click();*/
	
		
		
	
	

