package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.Page_Elements;
import pages.demoqa.Page_Elements_Links;
import pages.demoqa.Page_Index;

import java.util.ArrayList;

public class Test_con_POM extends BaseClass {


    @Test
    public void Take_a_card_test() {

        //Pagina Page_Index
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        Page_Index page_index = new Page_Index(driver);
        page_index.click_card();

        //Pagina Page_Elements
        Page_Elements page_elements = new Page_Elements(driver);
        page_elements.click_element_link();

        //Pagina Page_Elements_Links
        Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);
        page_elements_links.click_link_home();


    }
}
