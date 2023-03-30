package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Browser {
    public static WebDriver driver;
    /**
     * Set the path to the webdriver
     * Opens Firefox browser instance, maximize the window, set 10 seconds implicit wait
     */
    public static void openBrowser() {
        System.setProperty("webdriver.firefox.driver","C:\\drivers\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    /**
     * Quits browser, closing every associated window.
     */
    public static void quit() {
        driver.quit();
    }
}
