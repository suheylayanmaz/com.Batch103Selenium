package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_ManageMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // bos bir browser actik
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutlari : " + driver.manage().window().getSize());
        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Max Sayfanin Konumu : " + driver.manage().window().getPosition());
        System.out.println("Max Sayfanin Boyutlari : " + driver.manage().window().getSize());
        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("FullS Sayfanin Konumu : " + driver.manage().window().getPosition());
        System.out.println("FullS Sayfanin Boyutlari : " + driver.manage().window().getSize());
        // Sayfayi isediginiz konuma tasiyin ve istediginiz boyutlari verin.
        driver.manage().window().setPosition(new Point(80,0));
        driver.manage().window().setSize(new Dimension(800,600));

        //Sayfayi kapatin
        driver.close();



    }
}
