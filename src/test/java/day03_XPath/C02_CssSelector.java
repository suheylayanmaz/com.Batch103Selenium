package day03_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_CssSelector {
    public static void main(String[] args) {

        /*
            1. css = tagName[attribute name = 'value']
         diriver.findElement(By.cssSelector("input[name='session[password]']")

        */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actTitle = driver.getTitle();
        if(actTitle.contains("Spend less")){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
        }
        //6Gift Cards sekmesine basin
        // 1. css = tagName[attribute name = 'value']
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        //7Birthday butonuna basin
        driver.findElement(By.cssSelector("img[src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();

        //8 Best Seller bolumunden ilk urunu tiklayin
        //driver.findElement(By.cssSelector("a[href='/Amazon-eGift-Card-Birthday-Presents/dp/B0B5QKJTR6/ref=lp_2973106011_1_1']")).click();
        List<WebElement> bestSeller = driver.findElements(By.cssSelector("a[href='/Amazon-eGift-Card-Birthday-Presents/dp/B0B5QKJTR6/ref=lp_2973106011_1_1']"));
        bestSeller.get(0).click();
        // 9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("button[id='gc-mini-picker-amount-1']")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        String ilkUrunFiyat = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']")).getText();
        if (ilkUrunFiyat.equals("$25.00")){
            System.out.println("Ilk urun fiyat testi PASSED");
        }else {
            System.out.println("Ilk urun fiyat testi FAILED");
        }
        //10-Sayfayi kapatin
        driver.close();
    }
}
