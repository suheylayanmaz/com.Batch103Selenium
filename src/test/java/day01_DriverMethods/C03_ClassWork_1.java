package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ClassWork_1 {
    public static void main(String[] args) {
        /*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 1. adim : Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // 2. adim : Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 3. adim : Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title tasti PASSED");
        }else{
            System.out.println("Title tasti FAILED");
        }

        // 4. adim : Sayfa adresini(url) yazdirin
        System.out.println("Sayfa url : " + driver.getCurrentUrl());

        // 5. adim : Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("amazon")){
            System.out.println("Url tasti PASSED");
        }else{
            System.out.println("Url tasti FAILED");
        }

        // 6. adim : Sayfa handle degerini yazdirin
        System.out.println("Sayfa handle degeri : " + driver.getWindowHandle());

        // 7. adim : Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        // 7. adim : Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String kelimeGateway = driver.getPageSource();
        if (kelimeGateway.contains("Gateway")){
            System.out.println("Kelime Gateway tasti PASSED");
        }else{
            System.out.println("KelimeGateway tasti FAILED");
        }

        // 8. adim : Sayfayi kapatin.
        driver.close();

    }
}
