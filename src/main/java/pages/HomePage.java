package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private final By formAuthenticationLink = By.linkText("Form Authentication");
    private final By dropdownLink = By.linkText("Dropdown");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public LoginPage clickFormAuthentication(){
        clickLink(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink(dropdownLink);
        return new DropdownPage(driver);
    }

}
