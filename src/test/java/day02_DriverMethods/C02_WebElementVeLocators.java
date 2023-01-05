package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_WebElementVeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. Amazon sayfasina gidelim
        driver.get("https://www.amazon.com/");

        // 2. search bolumunu locate edelim
        //WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement search = driver.findElement(By.name("field-keywords"));
        // 3. search bolumunde iphone aratalim
        search.sendKeys("Iphone", Keys.ENTER);
        // VEYA
        /* search.sendKeys("Iphone");
        WebElement searchTusu = driver.findElement(By.id("nav-search-submit-button"));
        searchTusu.click();
        */
        /*
        Eger bir webElementi ( Web sayfasindaki herbir buton veya text/yazi)
        locate etmel istersek once manuel olarak web sayfasini acip sayfa uzerinde
        sag klik yapip inceleye tiklariz.
        Karsimiza cikan html kodlarindan locater' lardan (konumbelirleyiciler)
        uniq olani seceriz, genellikle id Attribute'i kullanilir.
        Ve sectigimiz attribute degerini findElement() method'u icine
        findElement(By.id("")) seklinde yazariz.
         */

        driver.close();
    }
}
