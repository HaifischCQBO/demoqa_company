package Test;

import Baseclass.BaseClass;
import Helpers.Helpers;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_con_POM extends BaseClass {


    @Test
    public void Take_elements() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
    }
}
