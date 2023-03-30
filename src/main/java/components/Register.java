package components;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Browser.driver;

public class Register {
    private final static By FIRSTNAME_FIELD =  By.id("input-firstname");
    private final static By LASTNAME_FIELD =  By.id("input-lastname");
    private final static By EMAIL_FIELD =  By.id("input-email");
    private final static By TELEPHONE_FIELD =  By.id("input-telephone");
    private final static By PASSWORD_FIELD =  By.id("input-password");
    private final static By PASSWORD_CONFIRM_FIELD =  By.id("input-confirm");
    private final static By NEWS_SUBSCRIBE_NO =  By.xpath("//label[@for='input-newsletter-no']");
    private final static By AGREE_PRIVACY_POLICY =  By.xpath("//label[@for='input-agree']");
    private final static By CONTINUE_BTN =  By.xpath("//input[@type='submit']");
    private final static By FIRSTNAME_ERROR_MSG =  By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
    private final static By LASTNAME_ERROR_MSG =  By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
    private final static By EMAIL_ERROR_MSG =  By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
    private final static By TELEPHONE_ERROR_MSG =  By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
    private final static By PASSWORD_ERROR_MSG =  By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
    private final static By PASSWORD_CONFIRM_ERROR_MSG =  By.xpath("//div[text()='Password confirmation does not match password!']");
    private final static By PRIVACY_ERROR_MSG =  By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!']");

    /**
     *
     * @param firstName the First name you like to enter
     */
    public static void fillFirstname(String firstName) {
        driver.findElement(FIRSTNAME_FIELD).sendKeys(firstName);
    }

    /**
     *
     * @param lastName the Last name you like to enter
     */
    public static void fillLastname(String lastName) {
        driver.findElement(LASTNAME_FIELD).sendKeys(lastName);
    }

    /**
     *
     * @param email the Email you like to enter
     */
    public static void fillEmail(String email) {
        driver.findElement(EMAIL_FIELD).sendKeys(email);
    }

    /**
     *
     * @param telephone the Telephone you like to enter
     */
    public static void fillTelephone(String telephone) {
        driver.findElement(TELEPHONE_FIELD).sendKeys(telephone);
    }

    /**
     *
     * @param password the Password you like to enter
     */
    public static void enterPassword(String password) {
        driver.findElement(PASSWORD_FIELD).sendKeys(password);

    }

    /**
     *
     * @param passwordConfirm Confirm the entered password
     */
    public static void confirmPassword(String passwordConfirm) {
        driver.findElement(PASSWORD_CONFIRM_FIELD).sendKeys(passwordConfirm);
    }

    /**
     * Checks that "No" radio button in Newsletter Subscribe is selected
     */
    public static void newsSubNo() {
        WebElement newsRadioNo  = driver.findElement(NEWS_SUBSCRIBE_NO);
        if (!newsRadioNo.isSelected())
            newsRadioNo.click();
    }

    /**
     * Selects "I have read and agree to the Privacy Policy" checkbox

     */
    public static void checkPrivacyPolicy() {
        WebElement privacyCheckbox  = driver.findElement(AGREE_PRIVACY_POLICY);
        if (!privacyCheckbox.isSelected())
            privacyCheckbox.click();
    }

    /**
     * Clicks on Continue button
     */
    public static void clickContinueBtn() {
    driver.findElement(CONTINUE_BTN).click();
    }

    /**
     * Verifies the error message for missing First name
     * @param expectedMsg The expected message
     * @param errorMsg The message that will appear in case of failure
     */
    public static void verifyFirstnameErrorMsg(String expectedMsg, String errorMsg) {
        String actualMsg = driver.findElement(FIRSTNAME_ERROR_MSG).getText();
       assertEquals( expectedMsg, actualMsg, errorMsg);
    }

    /**
     * Verifies the error message for missing Last name
     * @param expectedMsg The expected message
     * @param errorMsg The message that will appear in case of failure
     */
    public static void verifyLastnameErrorMsg(String expectedMsg, String errorMsg) {
        String actualMsg = driver.findElement(LASTNAME_ERROR_MSG).getText();
       assertEquals( expectedMsg, actualMsg, errorMsg);
    }

    /**
     * Verifies the error message for missing email
     * @param expectedMsg The expected message
     * @param errorMsg The message that will appear in case of failure
     */
    public static void verifyEmailErrorMsg(String expectedMsg, String errorMsg) {
        String actualMsg = driver.findElement(EMAIL_ERROR_MSG).getText();
        assertEquals( expectedMsg, actualMsg, errorMsg);
    }

    /**
     * Verifies the error message for missing Telephone
     * @param expectedMsg The expected message
     * @param errorMsg The message that will appear in case of failure
     */
    public static void verifyTelephoneErrorMsg(String expectedMsg, String errorMsg) {
        String actualMsg = driver.findElement(TELEPHONE_ERROR_MSG).getText();
        assertEquals( expectedMsg, actualMsg, errorMsg);
    }

    /**
     * Verifies the error message for missing Password
     * @param expectedMsg The expected messageThe expected message
     * @param errorMsg The message that will appear in case of failure
     */
    public static void verifyPasswordErrorMsg(String expectedMsg, String errorMsg) {
        String actualMsg = driver.findElement(PASSWORD_ERROR_MSG).getText();
       assertEquals( expectedMsg, actualMsg, errorMsg);
    }

    /**
     * Verifies the error message for missing Password confirmation
     * @param expectedMsg The expected messageThe expected message
     * @param errorMsg The message that will appear in case of failure
     */
    public static void verifyPasswordConfirmErrorMsg(String expectedMsg, String errorMsg) {
        String actualMsg = driver.findElement(PASSWORD_CONFIRM_ERROR_MSG).getText();
        assertEquals( expectedMsg, actualMsg, errorMsg);
    }

    /**
     * Verifies the error message for not checked Privacy Policy checkbox
     * @param expectedMsg The expected message
     * @param errorMsg The message that will appear in case of failure
     */
    public static void verifyPrivacyErrorMsg(String expectedMsg, String errorMsg) {
        String actualMsg = driver.findElement(PRIVACY_ERROR_MSG).getText();
       assertEquals( expectedMsg, actualMsg, errorMsg);

    }
}
