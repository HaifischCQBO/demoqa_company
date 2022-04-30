package Test;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Demoqa.Page_index;
import Pages.Demoqa.Page_menu;
import Pages.Demoqa.Page_select;
import org.testng.annotations.Test;

public class Test_Menu extends BaseClass {

    void InicioChrome(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        Page_index page_index = new Page_index(driver);
        page_index.ClickedCard();
    }
    @Test
    public void TestMenu() {
        InicioChrome();
        Page_menu page_menu = new Page_menu(driver);
        page_menu.ClickedNav();

    }

    @Test
    public void TestSelectMenu(){
        InicioChrome();
        Page_select page_select = new Page_select(driver);
        page_select.ClickSelect();
        page_select.StandardMultiSelect();
        page_select.OldStyleSelectMenu();
    }

}
