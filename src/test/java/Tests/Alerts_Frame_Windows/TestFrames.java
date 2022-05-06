package Tests.Alerts_Frame_Windows;

import Baseclass.BaseClass;
import Helpers.Helpers;
import interfaces.Page;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestFrames extends BaseClass {
    @Test
    public void TestCaseOne(){

        Helpers myDriver = new Helpers(driver);

        myDriver.loadSite(Page.URL_INDEX);

        myDriver.validateSiteTitle(Page.SiteTitle);

        myDriver.clickUsingJs("document.getElementsByClassName('card mt-4 top-card')[2].click()");

        myDriver.clickUsingJs("document.getElementsByClassName(\"element-group\")[2].querySelector(\".menu-list\").getElementsByClassName(\"btn btn-light\")[2].click()");

        Assert.assertEquals(myDriver.validateIframeTitle(),"This is a sample page"); ;

    }


}