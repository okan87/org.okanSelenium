package video04_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.facebook.com
        driver.get("https:www.facebook.com");
        // cookies cikarsa kabul et butonuna basin
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]")).click();
        // e-posta kutusuna rastgele bir mail girin
        WebElement emailBox= driver.findElement(By.xpath("//input[@id='email']"));
        emailBox.sendKeys("Hlkiujhgtrf");
        // sifre kismina rastgele bir sifre girin
        WebElement passBox= driver.findElement(By.xpath("//input[@id='pass']"));
        passBox.sendKeys("ydgfkshd");
        // giris yap butonuna basin
        driver.findElement(By.xpath("//button[@name='login']")).click();
        // uyari olarak "The email or mobile number you entered isn’t connected to an account. Find your account and log in."
        //  mesajinin ciktigini test edin
        WebElement resultTextElement= driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedresultText="The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
        String actualSonucYazisi=resultTextElement.getText();
        if (expectedresultText.equals(actualSonucYazisi)){
            System.out.println("girilemedi testi passed");
        } else {
            System.out.println("girilemedi testi failed");
        }
        // sayfayi kapatin
        driver.close();
    }
}