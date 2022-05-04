package Tests.Widgets;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Page_Index;
import Pages.Widgets.Page_menu;
import org.testng.annotations.Test;

public class TestMenu extends BaseClass {

    void InicioChrome(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        Page_Index page_index = new Page_Index();
        page_index.ClickedCard();
    }

    @Test
    public void TestMenu() {
        InicioChrome();
        Page_menu page_menu = new Page_menu(driver);
        page_menu.ClickedNav();
        page_menu.ClickOptionsItem2();
        page_menu.ClickSublista();
        page_menu.ClickedNav3();
    }

}