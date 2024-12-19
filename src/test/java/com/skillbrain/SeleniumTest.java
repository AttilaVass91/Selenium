package com.skillbrain;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Unit test for simple App.
 */
public class SeleniumTest {
    public static void main(String[] args) {
        // Configurarea WebDriver-ului
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver-win64/chromedriver.exe"); // calea către chromedriver

        //Optiuni pentru Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Deschida browserul pe tot ecranul

        // Inițializarea WebDriver-ului
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String pageTitle = driver.getTitle();
        System.out.println("Titlul paginii este: " + pageTitle);
        // Inchiderea browserului
        driver.quit();
    }
}
