package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples_KonumBelirleme {
    public static void main(String[] args) throws InterruptedException {


        //1. Ilk once browser'i max yapalim sonra tum sayfa icin max bekleme suresi 15 sn belirtelim.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Sirasiyla Amazon, facebook ve youtube sayfasina gidelim.
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.get("https://www.youtube.com/");
        Thread.sleep(3000);

        //3. Amazon sayfasina tekrar donelim.
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
        //4. Amazon sayfasinin url'nin "htpps://www.amazon.com/" adresine esit oldugunu test edelim
        String urlAmazon = driver.getCurrentUrl();
        if (urlAmazon.equals("htpps://www.amazon.com/")){
            System.out.println("URL Amazon testi PASSED");
        }else{
            System.out.println("URL Amazon testi FAILED");
        }
        //5. Sayfanin konumunu ve pozisyonunu yazdiralim.
        System.out.println("SAYFANIN BOYUTU" + driver.manage().window().getSize());
        System.out.println("SAYFANIN KONUMU" + driver.manage().window().getPosition());

        //6. Sayfanin konumunu ve boyutunu istedigimiz sekilde ayarlayalim
        driver.manage().window().setSize(new Dimension(600, 600));
        driver.manage().window().setPosition(new Point(50, 50));
        // ve istedigimiz sekilde oldu mu test edelim.
        Dimension newSize = driver.manage().window().getSize();
        if (newSize.getWidth() == 600 && newSize.getHeight() == 600) {
            System.out.println("SAYFANIN Size Testi PASSED");
        }else{
            System.out.println("SAYFANIN Size Testi FAILED");
        }

        Point newKonum = driver.manage().window().getPosition();
        if (newKonum.getX() == 50 && newKonum.getY() == 50){
            System.out.println("SAYFANIN Konum Testi PASSED");
        }else{
            System.out.println("SAYFANIN Konum Testi FAILED");
        }
        //7. sayfayi kapatalim.
        driver.close();
    }
}
