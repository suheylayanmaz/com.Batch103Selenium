package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_LocatorsGetMEthods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1. Amazon sayfasina gidelim
        // 2. Search bolumunu locate edip Iphone aratalim.
        // 3. Arama sonuc yazisini konsola yazdiralim.
        // 4. sayfayi kapatalim.

        driver.get("https://www.amazon.com");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Iphone", Keys.ENTER);
        WebElement sonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucYazisi.getText());
        driver.close();
    }
}
