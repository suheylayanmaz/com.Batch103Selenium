package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
         driver.manage().window().getPosition();
        System.out.println(driver.manage().window().getPosition());
        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin

        if (x == 0 && y == 0 && width == 500 && height == 500){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        //Sayfayi kapatin

        driver.close();
    }

}
