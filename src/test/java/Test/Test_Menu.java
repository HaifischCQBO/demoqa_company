package Test;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Demoqa.Page_index;
import org.testng.annotations.Test;

public class Test_Menu extends BaseClass {

    @Test
    public void Menu() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        Page_index page_index = new Page_index(driver);
        page_index.ClickedCard();
        page_index.ClickedNav();

    }
}
