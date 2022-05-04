package Tests.Widgets;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Page_Index;
import Pages.Widgets.Page_select;
import org.testng.annotations.Test;

public class TestSelect extends BaseClass {
    void InicioChrome(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        Page_Index page_index = new Page_Index(driver);
        page_index.ClickedCard();
    }

    @Test
    public void TestSelectMenu(){
        InicioChrome();
        Page_select page_select = new Page_select(driver);
        page_select.ClickSelect();
        page_select.StandardMultiSelect();
        page_select.MultipleDelectDropDown();
        page_select.OldStyleSelectMenu();
        page_select.SelectOne();
        page_select.SelectValue();
    }

}