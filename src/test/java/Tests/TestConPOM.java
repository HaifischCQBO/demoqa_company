package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Page_elements;
import Pages.Page_index;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestConPOM extends BaseClass {

     @Test
         public void Scenario1(){
         Helpers helpers = new Helpers(driver);
         helpers.getURL("https://demoqa.com");
         helpers.getURL("https://demoqa.com/checkbox");

         Page_index page_index = new Page_index(driver);
         page_index.click_btnElement();

    }


    @Test
    public void Scenario2(){
         //variable nueva
        String messajeTxt = "home";
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_CheckHome();


        Assert.assertTrue(page_elements.messajeCheckBoxHome(messajeTxt), "El mensaje es correcto!");

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
        String messajeTxt = "desktop";
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();

        Assert.assertTrue(page_elements.messajeCheckBoxDesktop(messajeTxt), "El mensaje es correcto!");
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
        String messajeTxt = "You have selected : documents workspace react angular veu office public private classified general";
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();

        Assert.assertTrue(page_elements.messajeCheckBoxDocuments(messajeTxt), "El mensaje es correcto!");
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
        String messajeTxt = "desktop";
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

        Assert.assertTrue(page_elements.messajeCheckBoxWS(messajeTxt), "El mensaje es correcto!");
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
    public void ScenarioDiez_Uno(){
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
        String messajeTxt = "desktop";
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

        Assert.assertTrue(page_elements.messajeCheckDown(messajeTxt), "El mensaje es correcto!");

     }


}
