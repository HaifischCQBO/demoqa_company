package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.*;
import org.testng.annotations.Test;

public class TestPOM extends BaseClass {
    @Test
    public void TestElementsRadioButtons() {
    Helpers helpers = new Helpers(driver);
    helpers.getURL(helpers.getXMLParameter("url"));

    // Test Elements - Radio Buttons
        PageIndex pageindex = new PageIndex(driver);
        helpers.scroll(0, 300);
        pageindex.clickElements();

        PageRadioButtons pageRadiobuttons = new PageRadioButtons(driver);
        helpers.scroll(0, 200);
        pageRadiobuttons.clickRadioButtons();
        helpers.Pause(3);
        pageRadiobuttons.clickRadioYes();
        helpers.Pause(3);
        pageRadiobuttons.clickRadioImpressive();
    }
    @Test
    public void TestElementsTextbox() {
    Helpers helpers = new Helpers(driver);
    helpers.getURL(helpers.getXMLParameter("url"));

    // Test Elements - Text box
        PageIndex pageindex = new PageIndex(driver);
        helpers.scroll(0, 300);
        pageindex.clickElements();

        PageTextBox pageTextBox = new PageTextBox(driver);
        pageTextBox.clickElementsTextbox();
        helpers.scroll(0, 200);
        helpers.Pause(3);
        pageTextBox.fillTextBox();
        helpers.scroll(0, 400);
        pageTextBox.clickSubmit();
        helpers.Pause(3);
    }
    @Test
    public void TestElementsButtons() {
    Helpers helpers = new Helpers(driver);
    helpers.getURL(helpers.getXMLParameter("url"));

    // Test Elements - Buttons
        PageIndex pageindex = new PageIndex(driver);
        helpers.scroll(0,300);
        pageindex.clickElements();

        PageButtons pageButtons = new PageButtons(driver);
        helpers.scroll(0,200);
        pageButtons.clickElementsButtons();
        pageButtons.rightClick();
        helpers.Pause(3);
        pageButtons.clickMeButton();
        helpers.Pause(3);
        pageButtons.doubleClick();
        helpers.Pause(3);

    }
}