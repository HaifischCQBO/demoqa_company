package Tests.Elements;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Elements.PageRadioButtons;
import Pages.Page_index;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_RadioButtons extends BaseClass {
    @Test
    public void TestElementsRadioButtons() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));

        // Test Elements - Radio Buttons
        Page_index pageIndex = new Page_index(driver);
        pageIndex.click_card_Elements();

        PageRadioButtons pageRadiobuttons = new PageRadioButtons(driver);
        helpers.scrolls(0, 200);
        pageRadiobuttons.clickRadioButtons();
        pageRadiobuttons.clickRadioYes();
        helpers.Pause(3);
        pageRadiobuttons.clickRadioImpressive();

        pageRadiobuttons.getTextSelectionMessage();
        Assert.assertTrue(pageRadiobuttons.RadioButtonsMessage(), "Valor impreso");
    }
}