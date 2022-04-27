package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Blazedemo.Page_Elements_Buttons;
import Pages.Blazedemo.Page_Index;
import org.testng.annotations.Test;

public class Test_Buttons extends BaseClass {

    @Test
    public void Test_case() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));

        Page_Index page_index = new Page_Index(driver);
        page_index.click_elements_div();
    }
}