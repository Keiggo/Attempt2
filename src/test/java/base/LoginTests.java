package base;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test
    public void loginAsTomSmith(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLogin();
        secureAreaPage.getBannerText();

        assertTrue(secureAreaPage.getBannerText()
                        .contains("You logged into a secure area!"),"Incorrect message displayed");
    }
}
