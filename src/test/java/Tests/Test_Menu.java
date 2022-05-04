package Test;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Page_menu;
import Pages.Page_select;
import Pages.bookstore.Page_index;
import org.testng.annotations.Test;

public class Test_Menu extends BaseClass {

    void InicioChrome(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        Page_index page_index = new Page_index(driver);
        page_index.click_card_Forms();
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

    @Test
    public void TestSelectMenu(){
        InicioChrome();
        Page_select page_select = new Page_select(driver);
        page_select.ClickSelect();
        page_select.StandardMultiSelect();
        page_select.OldStyleSelectMenu();
    }

}
