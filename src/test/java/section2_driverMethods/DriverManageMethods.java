package section2_driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethods {
    public static void main(String[] args) {
        //*-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*-
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //*-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*-

        //as pixel size
        System.out.println(driver.manage().window().getSize());

        //koordinat
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setPosition((new Point(15,15)));
        driver.manage().window().setSize((new Dimension(900,600)));

        System.out.println("new window size: " + driver.manage().window().getSize());
        System.out.println("new window local: " + driver.manage().window().getPosition());

//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().minimize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
}
