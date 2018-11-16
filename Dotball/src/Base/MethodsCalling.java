package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsCalling {
	public static WebDriver driver;
	public void LoginUsingPassword() throws InterruptedException {
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
	}
	
	public void LoginGmail() throws InterruptedException {
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("test5226792@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("jeevitha11");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
		Thread.sleep(3000);
	}
}
