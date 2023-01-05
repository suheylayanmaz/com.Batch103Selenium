package day03_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidelim
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        //3 Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("Delete Butonu Testi PASSED");
        } else {
            System.out.println("Delete Butonu Testi FAILED");
        }
        Thread.sleep(2000);
        //4 Delete tusuna basin
        deleteButonu.click();
        //5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        //WebElement addButonu = driver.findElement(By.xpath("//h3"));
        WebElement addButonu = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        //               <button onclick="addElement()">Add Element</button>
        // Xpath kullanımında locate edeceğimiz webelement text'e sahipse yukardaki şekilde kullanabiliriz
        if (addButonu.isDisplayed()) {
            System.out.println("Add Butonu Testi PASSED");
        }else {
            System.out.println("Add Butonu Testi FAILED");
        }
        driver.close();
    }
}
