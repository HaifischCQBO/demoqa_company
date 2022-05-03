package Tests.Elements;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Elements.PageTextBox;
import Pages.Page_index;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TextBox extends BaseClass {
    @Test
    public void TestElementsTextbox() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));

        // Test Elements - Text box
        Page_index pageIndex = new Page_index(driver);
        pageIndex.click_card_Elements();

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
}