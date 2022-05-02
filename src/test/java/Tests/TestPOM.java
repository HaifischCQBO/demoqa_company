package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPOM extends BaseClass {
    @Test
    public void TestElementsRadioButtons() {
    Helpers helpers = new Helpers(driver);
    helpers.getURL(helpers.getXMLParameter("url"));

    // Test Elements - Radio Buttons
        PageIndex pageindex = new PageIndex(driver);
        helpers.scrolls(0, 300);
        pageindex.clickElements();

        PageRadioButtons pageRadiobuttons = new PageRadioButtons(driver);
        helpers.scrolls(0, 200);
        pageRadiobuttons.clickRadioButtons();
        pageRadiobuttons.clickRadioYes();
        helpers.Pause(3);
        pageRadiobuttons.clickRadioImpressive();

        pageRadiobuttons.getTextSelectionMessage();
        Assert.assertTrue(pageRadiobuttons.RadioButtonsMessage(),"Valor impreso");
    }
    @Test
    public void TestElementsTextbox() {
    Helpers helpers = new Helpers(driver);
    helpers.getURL(helpers.getXMLParameter("url"));

    // Test Elements - Text box
        PageIndex pageindex = new PageIndex(driver);
        helpers.scrolls(0, 300);
        pageindex.clickElements();

        PageTextBox pageTextBox = new PageTextBox(driver);
        pageTextBox.clickElementsTextbox();
        helpers.scrolls(0, 200);
        pageTextBox.fillTextBox();
        helpers.scrolls(0, 400);
        pageTextBox.clickSubmit();
        helpers.Pause(3);

        String textFullName = pageTextBox.getTextFullName();
        String textEmail = pageTextBox.getTextEmail();
        String textCurrentAddress = pageTextBox.getTextCurrentAddress();
        String textPermanentAddress = pageTextBox.getTextPermanentAddress();

        String resultTextName = pageTextBox.getResultTextName();
        String resultTextEmail = pageTextBox.getResultTextEmail();
        String resultTextCurrentAddress = pageTextBox.getResultTextCurrentAddress();
        String resultTextPermanentAddress = pageTextBox.getResultTextPermanentAddress();

        Assert.assertEquals(resultTextName, textFullName);
        Assert.assertEquals(resultTextEmail, textEmail);
        Assert.assertEquals(resultTextCurrentAddress, textCurrentAddress);
        Assert.assertEquals(resultTextPermanentAddress, textPermanentAddress);
    }
    @Test
    public void TestElementsButtons() {
    Helpers helpers = new Helpers(driver);
    helpers.getURL(helpers.getXMLParameter("url"));

    // Test Elements - Buttons
        PageIndex pageindex = new PageIndex(driver);
        helpers.scrolls(0,300);
        pageindex.clickElements();

        PageButtons pageButtons = new PageButtons(driver);
        helpers.scrolls(0,200);
        pageButtons.clickElementsButtons();
        pageButtons.rightClick();
        helpers.Pause(3);
        pageButtons.clickMeButton();
        helpers.Pause(3);
        pageButtons.doubleClick();
        helpers.Pause(3);

        pageButtons.getTextClikMessage();
        Assert.assertTrue(pageButtons.ClickMessage(),"Elemento encontrado");
        //pageButtons.getTextRightClikMessage();
        //Assert.assertTrue(pageButtons.rightClickMessage(),"Elemento encontrado");
        //pageButtons.getTextDoubleClikMessage();
        //Assert.assertTrue(pageButtons.doubleClickMessage(),"Elemento encontrado");
    }
}