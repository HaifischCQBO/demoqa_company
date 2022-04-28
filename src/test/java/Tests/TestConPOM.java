package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import PagesDemoQa.Page_Index;
import PagesDemoQa.Page_elements;
import org.testng.annotations.Test;

public class TestConPOM extends BaseClass {

     @Test
         public void Test1(){
         Helpers helpers = new Helpers(driver);
         helpers.getURL("https://demoqa.com/checkbox");
         Page_Index page_index = new Page_Index(driver);
         page_index.click_btnElements();
    }



    @Test
    public void Test2(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_CheckHome();
    }

    @Test
    public void Test3(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
    }

    @Test
    public void Test4(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
    }

    @Test
    public void Test5(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
    }

    @Test
    public void Test6(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
    }

    @Test
    public void Test7(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
    }

    @Test
    public void Test8(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
    }

    @Test
    public void Test9(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
        page_elements.click_checkWorkSpace();
    }

    @Test
    public void TestDiez(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
        page_elements.click_checkWorkSpace();
        page_elements.click_buttonOffice();
    }

    @Test
    public void TestOnce(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
        page_elements.click_checkWorkSpace();
        page_elements.click_buttonOffice();
        page_elements.click_buttonDownloads();
    }

    @Test
    public void TestDoce(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
        page_elements.click_checkWorkSpace();
        page_elements.click_buttonOffice();
        page_elements.click_buttonDownloads();
        page_elements.click_checkDownloads();
    }


}
