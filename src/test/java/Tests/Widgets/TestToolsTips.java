package Tests.Widgets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestToolsTips extends Baseclass{

    public webdriver driver;

    @aTest
    public void pruebaTools_Tips(){


        Helpers helpers = new Helpers();
        Page_Accordian accordian = new Page_Accordian();
        helpers.getURL(ToolsTips.getUrl());
        page_index.hover_me_to_see();

    }



}


