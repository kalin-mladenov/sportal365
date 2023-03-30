package positive;

import components.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Browser;
import components.IpodShuffle;

public class PurchaseAsGuestTest {
    @BeforeEach
    public void setup(){
        Browser.openBrowser();
    }
    @AfterEach
    public void tearDown(){
        Browser.quit();
    }

    @Test
    public void buyNowIpodShuffleAsGuest(){
        Home.openHomePage();
        Home.clickOnSoftware();
        Software.clickIpodShuffle();
        IpodShuffle.clickBuyNow();
        Checkout.selectGuest();
        Checkout.fillFirstname("Kalin");
        Checkout.fillLastname("Mladenov");
        Checkout.fillEmail("email1@email.com");
        Checkout.fillTelephone("8888555444");
        Checkout.fillAddress1("Street1");
        Checkout.fillCity("City1");
        Checkout.fillPostCode("1418");
        Checkout.checkTermsAndConditions();
        Checkout.clickContinueBtn();
        Confirm.clickConfirmOrder();
        CheckoutSuccess.verifyPlacedOrder("Your order has been placed!","Error with order purchasing:  " );



    }

}
