package section2_driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//       1-  driver.navigate().to("https://www.facebook.com")
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

//        2- driver.navigate().back()
        driver.navigate().back();
//        3- driver.navigate().forward()
        driver.navigate().forward();
//       4- driver.navigate().refresh();
        driver.navigate().refresh();

        //for page
//        driver.close();

        //for all tabs
        driver.quit();







    }
}
