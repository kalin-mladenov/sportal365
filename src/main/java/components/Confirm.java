package components;

import org.openqa.selenium.By;

import static utils.Browser.driver;

public class Confirm {
    private final static By CONFIRM_BTN =  By.id("button-confirm");

    /**
     * Clicks on Confirm Order button
     */
    public static void clickConfirmOrder() {
        driver.findElement(CONFIRM_BTN).click();
    }
}
