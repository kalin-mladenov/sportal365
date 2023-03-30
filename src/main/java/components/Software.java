package components;

import org.openqa.selenium.By;

import static utils.Browser.driver;

public class Software {
    private final static By IPOD_SHUFFLE =  By.xpath("//img[@alt='iPod Shuffle']");

    /**
     * Clicks on Ipod Shuffle item
     */
    public static void clickIpodShuffle() {
        driver.findElement(IPOD_SHUFFLE).click();
    }
}
