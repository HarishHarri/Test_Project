package myseleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceLikeButto {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver fi = new FirefoxDriver();
	fi.get("https://www.facebook.com");
	fi.findElement(By.id("email")).sendKeys("kavin6667@gmail.com");
	fi.findElement(By.id("pass")).sendKeys("8867410311");
	fi.findElement(By.name("login")).click();
	fi.findElement(By.xpath("input[@placeholder='Search Facebook']")).sendKeys("puneeth rajkumar");;
	//
}
}
