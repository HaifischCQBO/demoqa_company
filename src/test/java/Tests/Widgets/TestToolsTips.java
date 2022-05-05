package Tests.Widgets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestToolsTips extends BaseClass{


    @aTest
    public void Tools_Tips(){
        Page_Tools_tips tools_tips = new Page_Tools_tips();
        Helpers helpers = new Helpers(tools_tips.driver);
        helpers.getURL(helpers.getXMLParameter("url"));

        Page_Tools_tips tools_tips = new Page_Tools_tips(driver);
        page_Tools_tips = Webdriver.findElement(By.xpath ("//*[@id=\"toolTipButton\"]/font/font");

       
    }



}


