package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_Classwork_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // bos bir browser actik
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expTitle = "facebook";
        if(actualTitle.equals(expTitle)){
            System.out.println("Actual Title testi PASSED" );
        }else{
            System.out.println("Actual Title testi FAILED, dogru BASLIK : " + actualTitle);
        }
        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String url = driver.getCurrentUrl();
        if(url.contains("facebook")){
            System.out.println("URL testi PASSED");
        }else System.out.println("URL testi FAILED");

        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String title = driver.getTitle();
        if(title.contains("Walmart.com")){
            System.out.println("TITLE testi PASSED");
        }else System.out.println("TITLE testi FAILED");
        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
        driver.manage().window().maximize();
        driver.close();
    }
}
