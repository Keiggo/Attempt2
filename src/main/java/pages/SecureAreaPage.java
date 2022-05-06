package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {
    private final By loginBanner = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        super(driver);
    }

    public String getBannerText(){
        return driver.findElement(loginBanner).getText();
    }

}
