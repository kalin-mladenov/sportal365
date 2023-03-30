package negative;
import components.Home;
import components.Register;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Browser;

public class RegisterNegativeTest {
    @BeforeEach
    public void setup(){
        Browser.openBrowser();
    }
    @AfterEach
    public void tearDown(){
        Browser.quit();
    }

    @Test
    public void registerBlankFirstName(){
        Home.openHomePage();
        Home.clickOnRegister();
        Register.fillLastname("Mladenov");
        Register.fillEmail("kalin5@mail.com");
        Register.fillTelephone("088877744");
        Register.enterPassword("password");
        Register.confirmPassword("password");
        Register.newsSubNo();
        Register.checkPrivacyPolicy();
        Register.clickContinueBtn();
        Register.verifyFirstnameErrorMsg("First Name must be between 1 and 32 characters!", "Firstname error message not shown:  ");

    }
    @Test
    public void registerBlankLastName(){
        Home.openHomePage();
        Home.clickOnRegister();
        Register.fillFirstname("Kalin");
        Register.fillEmail("kalin5@mail.com");
        Register.fillTelephone("088877744");
        Register.enterPassword("password");
        Register.confirmPassword("password");
        Register.newsSubNo();
        Register.checkPrivacyPolicy();
        Register.clickContinueBtn();
        Register.verifyLastnameErrorMsg("Last Name must be between 1 and 32 characters!", "Lastname error message not shown:  ");

    }
    @Test
    public void registerBlankEmail(){
        Home.openHomePage();
        Home.clickOnRegister();
        Register.fillFirstname("Kalin");
        Register.fillLastname("Mladenov");
        Register.fillTelephone("088877744");
        Register.enterPassword("password");
        Register.confirmPassword("password");
        Register.newsSubNo();
        Register.checkPrivacyPolicy();
        Register.clickContinueBtn();
        Register.verifyEmailErrorMsg("E-Mail Address does not appear to be valid!", "Email error message not shown:  ");

    }
    @Test
    public void registerBlankTelephone(){
        Home.openHomePage();
        Home.clickOnRegister();
        Register.fillFirstname("Kalin");
        Register.fillLastname("Mladenov");
        Register.fillEmail("kalin5@mail.com");
        Register.enterPassword("password");
        Register.confirmPassword("password");
        Register.newsSubNo();
        Register.checkPrivacyPolicy();
        Register.clickContinueBtn();
        Register.verifyTelephoneErrorMsg("Telephone must be between 3 and 32 characters!", "Telephone error message not shown:  ");

    }
    @Test
    public void registerBlankPassword(){
        Home.openHomePage();
        Home.clickOnRegister();
        Register.fillFirstname("Kalin");
        Register.fillLastname("Mladenov");
        Register.fillEmail("kalin5@mail.com");
        Register.fillTelephone("088877744");
        Register.confirmPassword("password");
        Register.newsSubNo();
        Register.checkPrivacyPolicy();
        Register.clickContinueBtn();
        Register.verifyPasswordErrorMsg("Password must be between 4 and 20 characters!", "Password error message not shown:  ");

    }
    @Test
    public void registerBlankConfirmPassword(){
        Home.openHomePage();
        Home.clickOnRegister();
        Register.fillFirstname("Kalin");
        Register.fillLastname("Mladenov");
        Register.fillEmail("kalin5@mail.com");
        Register.fillTelephone("088877744");
        Register.enterPassword("password");
        Register.newsSubNo();
        Register.checkPrivacyPolicy();
        Register.clickContinueBtn();
        Register.verifyPasswordConfirmErrorMsg("Password confirmation does not match password!", "Password confirm error message not shown:  ");

    }
    @Test
    public void registerPrivacyNotChecked(){
        Home.openHomePage();
        Home.clickOnRegister();
        Register.fillFirstname("Kalin");
        Register.fillLastname("Mladenov");
        Register.fillEmail("kalin5@mail.com");
        Register.fillTelephone("088877744");
        Register.enterPassword("password");
        Register.confirmPassword("password");
        Register.newsSubNo();
        Register.clickContinueBtn();
        Register.verifyPrivacyErrorMsg("Warning: You must agree to the Privacy Policy!", "Privacy error message not shown:  ");

    }
}
