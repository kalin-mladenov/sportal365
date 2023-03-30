package components;

import org.openqa.selenium.By;

import static utils.Browser.driver;

public class IpodShuffle {
    private final static By BUY_NOW_BTN =  By.xpath("(//button[contains(@class,'text btn')])[3]");

    /**
     * Clicks on BUY NOW button
     */
    public static void clickBuyNow() {
        driver.findElement(BUY_NOW_BTN).click();
    }
}
