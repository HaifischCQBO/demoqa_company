package Tests.Interactions;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Page_index;
import Pages.bookstore.Page_Profile;
import Pages.interactions.Page_Resizable_box2;
import org.testng.annotations.Test;

public class TestResizableBoxTwo extends BaseClass{

    @Test
    public void test_resizable_boxtwo() {

        //Pagina Page_Index
        driver.manage().window().maximize();
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        Page_index page_index = new Page_index(driver);
        page_index.click_card_interactions();

        //Pagina Page_resizable_box2
        Page_Resizable_box2 page_resizable_box2 = new Page_Resizable_box2(driver);
        page_resizable_box2.click_resizable();

        //click en resizable dos
        page_resizable_box2.redimensionar();
        page_resizable_box2.confirmation_redimension();


    }
}
