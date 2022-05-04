package Tests.Elements;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Elements.PageButtons;
import Pages.Page_index;
import org.testng.Assert;
import org.testng.annotations.Test;

// Andres Felipe Ramirez Morales
public class Test_Buttons extends BaseClass {
    @Test
    public void TestElementsButtons() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));

        // Test Elements - Buttons
        Page_index pageIndex = new Page_index(driver);
        pageIndex.click_card_Elements();

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
