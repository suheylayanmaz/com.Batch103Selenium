package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_WebElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Amazon sayfasindaki <input> ve <a> tag'larinin sayisini yazdiriniz.
        driver.get("https://www.amazon.com/");
        List<WebElement> input = driver.findElements(By.tagName("input"));
        List<WebElement> aTag = driver.findElements(By.tagName("a"));
        System.out.println(input.size());
        System.out.println(aTag.size());

        for (WebElement w : input) {
            System.out.println(w.getText());
        }
        //driver.close();
    }
}
