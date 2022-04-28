package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import PagesDemoQa.Page_Index;
import PagesDemoQa.Page_elements;
import org.testng.annotations.Test;

public class TestConPOM extends BaseClass {

     @Test
         public void Scenario1(){
         Helpers helpers = new Helpers(driver);
         helpers.getURL("https://demoqa.com/checkbox");
         Page_Index page_index = new Page_Index(driver);
         page_index.click_btnElements();
    }



    @Test
    public void Scenario2(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_CheckHome();
    }

    @Test
    public void Scenario3(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
    }

    @Test
    public void Scenario4(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
    }

    @Test
    public void Scenario5(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
    }

    @Test
    public void Scenario6(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
    }

    @Test
    public void Scenario7(){
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
    public void Scenario8(){
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
    public void Scenario9(){
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
    public void ScenarioDiez(){
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
    public void ScenarioOnce(){
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
    public void ScenarioDoce(){
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
