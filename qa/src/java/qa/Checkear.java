package qa;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkear {

    public void testGoogleSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/home/educacion/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(3000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(3000);  // Let the user actually see something!
        driver.quit();
    }

    public void testLinkedinSearch(String nombre) throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/home/educacion/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        Thread.sleep(3000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.cssSelector(".same-name-search input[name='first']"));
        searchBox.sendKeys("Maximiliano");
        searchBox = driver.findElement(By.cssSelector(".same-name-search input[name='last']"));
        searchBox.sendKeys("Usich");
        searchBox.submit();
        Thread.sleep(3000);  // Let the user actually see something!

        driver.quit();
    }
    
    public static void main(String[] args) {
//        try {
//            Checkear ch = new Checkear();
//            ch.testGoogleSearch();
//        } catch (InterruptedException ex) {
//            ex.printStackTrace();
//        }
        try {
            Checkear ch = new Checkear();
            ch.testLinkedinSearch(null);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
