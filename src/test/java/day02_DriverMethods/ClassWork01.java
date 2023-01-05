package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ClassWork01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("City bike", Keys.ENTER);
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println( "Arama sonuc yazisi : "+ aramaSonucYazisi.get(0).getText());
        // Arama sonuc sayisini konsola yazdiriniz.
        String [] SonucSayisi = aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println( "aramaSonucYazisi" + aramaSonucYazisi.get(2));
        // Arama sonuc yazisini Lambda ile yapiniz.
        Arrays.stream(aramaSonucYazisi.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWEResim = driver.findElements(By.className("s-image"));
        ilkWEResim.get(0).click();
        // Sayfayi kapatin.

    }
}
