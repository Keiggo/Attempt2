package pages;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import java.util.stream.Collectors;

public class DropdownPage extends BasePage{
    public WebDriver driver;
    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        super(driver);
    }

    public void setDropdownPageDropdownOption(int optionIndex){
        setDropDownOption(dropdown, optionIndex);
    }

    public List<String> getDropdownPageDropdownOptions(){
        List<WebElement> dropdownOptions = findDropdown(dropdown).getAllSelectedOptions();
        return dropdownOptions.stream().map(e->e.getText()).collect(Collectors.toList());
    }

}
