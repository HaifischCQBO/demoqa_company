package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Demoqa.Page_Index;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test_con_POM extends BaseClass {


    @Test
    @Ignore
    public void Take_elements() {




        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        Page_Index page_index = new Page_Index(driver);




        //public By card_body_button = By.xpath("//div[@class='card_body']");


    }
}
