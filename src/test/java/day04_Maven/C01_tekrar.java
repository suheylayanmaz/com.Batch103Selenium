package day04_Maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class C01_tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        //arama kutusunu locate ediniz
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        //arama kutusunun tagName'inin input oldugunu test ediniz
        String actualTagName = searchBox.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED!!! actualTagName = " + actualTagName);
        //arama kutusunun name atribute'unun degerinin field-keywords oldugunu test ediniz
        String actualAttributeName = searchBox.getAttribute("name");
        String expectedAttributeName = "field-keywords";
        if (actualAttributeName.equals(expectedAttributeName)) {
            System.out.println("Attribute test PASSED");
        } else System.out.println("Attribute test FAILED!!!  " + actualAttributeName);
        //sayfayi kapatiniz
        driver.close();
    }
}
