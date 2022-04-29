package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.Page_Elements;
import pages.demoqa.Page_Elements_Links;
import pages.demoqa.Page_Index;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Test_con_POM extends BaseClass {


    @Test
    public void Take_a_card_test() {

        //Pagina Page_Index
        driver.manage().window().maximize();
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        Page_Index page_index = new Page_Index(driver);
        page_index.click_card();

        //Pagina Page_Elements
        Page_Elements page_elements = new Page_Elements(driver);
        page_elements.click_element();

        //Pagina Page_Elements_Links
        // Link Home
        /*Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);
        page_elements_links.click_link_home();*/

        // Link HomeFWDZo
        /*Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);
        page_elements_links.click_link_homefwdzo();*/

        // Link Created
        /*Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);
        page_elements_links.click_link_created();
        helpers.Pause(5);
        Assert.assertEquals(page_elements_links.message_confirmation_created(),"Link has responded with staus 201 and status text Created");*/

        //Link No Content
        /*Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);
        page_elements_links.click_link_nocontent();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_nocontent(),"Link has responded with staus 204 and status text No Content");*/

        // Link Moved
        /*Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);
        page_elements_links.click_link_moved();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_moved(),"Link has responded with staus 301 and status text Moved Permanently");*/

        // Link Bad Request
        /*Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);
        page_elements_links.click_link_badrequest();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_badrequest(),"Link has responded with staus 400 and status text Bad Request");*/

        // Link Bad Request
        /*Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);
        page_elements_links.click_link_forbidden();
        helpers.Pause(5);
        Assert.assertEquals(page_elements_links.message_confirmation_forbidden(),"Link has responded with staus 403 and status text Forbidden");*/

        // Link Bad Request
        Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);
        page_elements_links.click_link_notfound();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_notfound(),"Link has responded with staus 404 and status text Not Found");






    }
}
