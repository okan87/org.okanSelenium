package section2_driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        1-driver.get("url")
        driver.get("https://www.amazon.com");
//        2-driver.getTitle("")
        System.out.println("Page title: " + driver.getTitle());
//        3-driver.getCurrentUrl()
        System.out.println(driver.getCurrentUrl());
//        4-driver.getPageSource()
        System.out.println("=========================================");
        System.out.println(driver.getPageSource());
        System.out.println("=========================================");
//        5-driver.getWindowHandle() --> unique hashCode in the page
        System.out.println(driver.getWindowHandle());
//        6-driver.getWindowHandles() --> All openingPage Unique hash code
        System.out.println(driver.getWindowHandles());

    }


}
