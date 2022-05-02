package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.demoqa.Page_Elements;
import pages.demoqa.Page_Elements_Links;
import pages.demoqa.Page_Index;

public class Test_con_POM extends BaseClass {

    @Test(priority = 1)
    public void link_newtab_test_home() {

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
        Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);


        // Link Home
        page_elements_links.click_link_home();


    }
    @Test(priority = 2)
    public void link_newtab_test_homer3K5x(){

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
        Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);

        // Link HomeFWDZo
        page_elements_links.click_link_homefwdzo();



    }
    @Test(priority = 3)
    public void link_apicall_test(){

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
        Page_Elements_Links page_elements_links = new Page_Elements_Links(driver);

        // Lin*k Created
        page_elements_links.click_link_created();
        helpers.Pause(5);
        Assert.assertEquals(page_elements_links.message_confirmation_created(),"Link has responded with staus 201 and status text Created");

        //Link No Content
        page_elements_links.click_link_nocontent();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_nocontent(),"Link has responded with staus 204 and status text No Content");

        // Link Moved
        page_elements_links.click_link_moved();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_moved(),"Link has responded with staus 301 and status text Moved Permanently");

        // Link Bad Request
        page_elements_links.click_link_badrequest();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_badrequest(),"Link has responded with staus 400 and status text Bad Request");

        // Link Unauthorized
        page_elements_links.click_link_unauthorized();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_unauthorized(),"Link has responded with staus 401 and status text Unauthorized");

        // Link Forbidden
        page_elements_links.click_link_forbidden();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_forbidden(),"Link has responded with staus 403 and status text Forbidden");

        // Link Not Found
        page_elements_links.click_link_notfound();
        helpers.Pause(4);
        Assert.assertEquals(page_elements_links.message_confirmation_notfound(),"Link has responded with staus 404 and status text Not Found");






    }
}
