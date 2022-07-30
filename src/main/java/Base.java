import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static void initialization() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:/Automation/Demo/src/main/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
    }
}
