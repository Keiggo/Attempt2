package base;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import pages.DropdownPage;

public class DropdownTests extends BaseTests {

    @Test
    public void pointlessDropdownTest(){
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.setDropdownPageDropdownOption(1);
        assertTrue(dropdownPage.getDropdownPageDropdownOptions().contains("Option 1"),"Uh oh, wrong option");

        dropdownPage.setDropdownPageDropdownOption(2);
        assertTrue(dropdownPage.getDropdownPageDropdownOptions().contains("Option 2"),"Uh oh, wrong option");

    }
}
