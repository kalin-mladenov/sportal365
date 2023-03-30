package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Browser.driver;

public class Checkout {
    private final static By GUEST_RADIO_BTN =  By.xpath("(//label[@class='custom-control-label'])[3]");
    private final static By FIRST_NAME =  By.id("input-payment-firstname");
    private final static By LAST_NAME =  By.id("input-payment-lastname");
    private final static By EMAIL =  By.id("input-payment-email");
    private final static By TELEPHONE =  By.id("input-payment-telephone");
    private final static By ADDRESS_1 =  By.id("input-payment-address-1");
    private final static By CITY =  By.id("input-payment-city");
    private final static By POST_CODE =  By.id("input-payment-postcode");
    private final static By COUNTRY =  By.id("input-payment-country");
    private final static By REGION =  By.id("input-payment-zone");
    private final static By DELIVERY_BILLING_CHECKBOX =  By.xpath("//label[text()='My delivery and billing addresses are the same.']");
    private final static By TERMS_CHECKBOX =  By.xpath("//label[@for='input-agree']");
    private final static By CONTINUE_BTN =  By.id("button-save");

    /**
     * Selects the "Guest Checkout" radio button
     */
    public static void selectGuest() {

        WebElement guestRadio  = driver.findElement(GUEST_RADIO_BTN);
        if (!guestRadio.isSelected())
            guestRadio.click();
    }

    /**
     *
     * @param firstName the First name you like to enter
     */
    public static void fillFirstname(String firstName) {
        driver.findElement(FIRST_NAME).sendKeys(firstName);
    }
    /**
     *
     * @param lastName the Last name you like to enter
     */
    public static void fillLastname(String lastName) {
        driver.findElement(LAST_NAME).sendKeys(lastName);
    }

    /**
     *
     * @param email the Email you like to enter
     */
    public static void fillEmail(String email) {
        driver.findElement(EMAIL).sendKeys(email);
    }

    /**
     *
     * @param telephone the Telephone you like to enter
     */
    public static void fillTelephone(String telephone) {
        driver.findElement(TELEPHONE).sendKeys(telephone);
    }

    /**
     *
     * @param address1 the Address you like to enter
     */
    public static void fillAddress1(String address1) {
        driver.findElement(ADDRESS_1).sendKeys(address1);
    }

    /**
     *
     * @param city the City you like to enter
     */
    public static void fillCity(String city) {
        driver.findElement(CITY).sendKeys(city);
    }

    /**
     *
     * @param postCode the Post code you like to enter
     */

    public static void fillPostCode(String postCode) {
        driver.findElement(POST_CODE).sendKeys(postCode);

    }

    /**
     * Clicks "I have read and agree to the Terms & Conditions" checkbox
     */
    public static void checkTermsAndConditions() {
        WebElement termsCheckbox  = driver.findElement(TERMS_CHECKBOX);
        if (!termsCheckbox.isSelected())
            termsCheckbox.click();
    }

    /**
     * Clicks on Continue button
     */
    public static void clickContinueBtn() {
        driver.findElement(CONTINUE_BTN).click();
    }



}
