package positive;

import components.Home;
import components.Register;
import components.Success;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Browser;


public class RegisterPositiveTest {
    @BeforeEach
    public void setup(){
        Browser.openBrowser();
    }
    @AfterEach
    public void tearDown(){
        Browser.quit();
    }

    @Test
    public void register (){
        Home.openHomePage();
        Home.clickOnRegister();
        Register.fillFirstname("Kalin");
        Register.fillLastname("Mladenov");
        Register.fillEmail("kalin11@mail.com");
        Register.fillTelephone("088877744");
        Register.enterPassword("password");
        Register.confirmPassword("password");
        Register.newsSubNo();
        Register.checkPrivacyPolicy();
        Register.clickContinueBtn();
        Success.verifyCreatedAccount("Your Account Has Been Created!", "Error with account creation:  ");

    }
}
