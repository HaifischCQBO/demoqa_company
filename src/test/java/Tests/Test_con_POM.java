package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Page_index;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test_con_POM extends BaseClass {


    @Test
    @Ignore
    public void Take_elements() {




        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        Page_index page_index = new Page_index(driver);




        //public By card_body_button = By.xpath("//div[@class='card_body']");


    }
}
