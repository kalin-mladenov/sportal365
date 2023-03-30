package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static utils.Browser.driver;

public class Home {

    private final static String HOME_PAGE_URL = "https://ecommerce-playground.lambdatest.io/index.php?route=common/home";
    private final static By MY_ACCOUNT_DROPDOWN =  By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span");
    private final static By REGISTER =  By.xpath("//span[text()[normalize-space()='Register']]");
    private final static By SOFTWARE =  By.xpath("//h4[text()[normalize-space()='Software']]");

    /**
     * Opens the home page url https://ecommerce-playground.lambdatest.io/index.php?route=common/home
     */
    public static void openHomePage() {
        driver.get(HOME_PAGE_URL);
    }

    /**
     * Clicks on Register option in My account dropdown
     */
    public static void clickOnRegister() {
        WebElement myAccount = driver.findElement(MY_ACCOUNT_DROPDOWN);
        Actions action = new Actions(driver);
        action.moveToElement(myAccount).perform();
        driver.findElement(REGISTER).click();
    }

    /**
     * CLicks on Software category
     */
    public static void clickOnSoftware() {
        driver.findElement(SOFTWARE).click();
    }
}
