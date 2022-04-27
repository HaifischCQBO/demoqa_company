package Tests;

import Helpers.Helpers;
import Pages.PageIndex;
import org.testng.annotations.Test;

public class Test_demoqa {

    @Test
    public void Test_forms(){

        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));

        PageIndex pageIndex = new PageIndex(driver);
        pageIndex.click_card_Forms();


    }
}
