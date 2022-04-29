package Test;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.demoqa.Page_Index;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_con_POM extends BaseClass {


    @Test
    public void Take_elements() {




        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        //Page_Index page_index = new Page_Index(driver);




        //public By card_body_button = By.xpath("//div[@class='card_body']");


    }
}
