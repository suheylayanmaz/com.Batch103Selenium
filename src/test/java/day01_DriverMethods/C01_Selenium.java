package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // bos bir browser actik

        driver.get("https://www.amazon.com");// ilk gitmek istedigimiz sayfaya gittik
        System.out.println("Sayfa Basligi : " + driver.getTitle());
        System.out.println("Saayfa url'i : "+ driver.getCurrentUrl());
        // System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle()); // bize o window'a ait hash degerini verir.
                                                    // biz bu hash degeri bir stringe atayip gecis yapabiliriz.

    }
}
