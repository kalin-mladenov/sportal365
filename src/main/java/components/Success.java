package components;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Browser.driver;

public class Success {
    private final static By CREATED_ACCOUNT_MSG =  By.xpath("//h1[@class='page-title my-3']");

    /**
     * Verifies the error message for successful account creation
     * @param expectedMsg The expected message
     */
    public static void verifyCreatedAccount(String expectedMsg, String errorMsg) {

        String actualMsg = driver.findElement(CREATED_ACCOUNT_MSG).getText();
        assertEquals( expectedMsg, actualMsg, errorMsg);
    }
}
