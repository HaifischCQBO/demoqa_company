package Tests.Alerts_Frame_Windows;

import Baseclass.BaseClass;
import Helpers.Helpers;
import org.testng.annotations.Test;

public class TestNestedFrames extends BaseClass {

    @Test
    public void TestCaseTwo(){
        Helpers myDriver = new Helpers();

        myDriver.loadSite("https://demoqa.com/nestedframes");

        myDriver.clickUsingJs("document.getElementsByClassName(\"element-group\")[2].querySelector(\".menu-list\").getElementsByClassName(\"btn btn-light\")[3].click()");

    }
}
