package components;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Browser.driver;

public class CheckoutSuccess {
    private final static By ORDER_PLACED_MSG =  By.xpath("//h1[text()=' Your order has been placed!']");

    /**
     * Asserts that the expected message is equals to the actual message.
     * @param expectedMsg The expected message
     * @param errorMsg The message that will appear in case of failure
     */
    public static void verifyPlacedOrder(String expectedMsg, String errorMsg) {
        String actualMsg = driver.findElement(ORDER_PLACED_MSG).getText();
        assertEquals( expectedMsg, actualMsg, errorMsg);
    }
}
