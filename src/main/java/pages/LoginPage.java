package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private final By usernameTextField= By.id("username");
    private final By passwordTextField = By.id("password");
    private final By loginButton = By.className("radius");


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void enterUsername(String username){
        populateTextField(usernameTextField, username);
    }

    public void enterPassword(String password){
        populateTextField(passwordTextField, password);
    }

    public SecureAreaPage clickLogin(){
        clickButton(loginButton);
        return new SecureAreaPage(driver);
    }
}
