package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // bos bir browser actik
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        Thread.sleep(3000);
        //Hepsiburada sayfasına gidelim
        driver.get("https://techproeducation.com");
        //Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        //Tekrar hepsiburada sayfasına gidelim
        driver.navigate().forward();
        Thread.sleep(3000);
        //Son sayfada sayfayı yenileyelim(refresh)
        driver.navigate().refresh();
        //Ve sayfayı kapatalım
        driver.close();

}
}
