package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import java.util.stream.Collectors;

public class BasePage{
    protected WebDriver driver;

    protected BasePage(WebDriver driver){
        this.driver = driver;
    }

    protected void clickLink(By linkTextBy){
        driver.findElement(linkTextBy).click();
    }

    protected void populateTextField(By textFieldBy, String inputText){
        driver.findElement(textFieldBy).sendKeys(inputText);

    }

    protected void clickButton(By buttonBy){
        driver.findElement(buttonBy).click();
    }

    protected Select findDropdown(By dropdownBy){
        return new Select(driver.findElement(dropdownBy));
    }

    public void setDropDownOption(By dropdownBy, int optionIndex){
        findDropdown(dropdownBy).selectByIndex(optionIndex);
    }

    public List<String> getDropdownOptions(By dropdownBy){
        List<WebElement> dropdownOptions = findDropdown(dropdownBy).getAllSelectedOptions();
        return dropdownOptions.stream().map(e->e.getText()).collect(Collectors.toList());
    }
}
