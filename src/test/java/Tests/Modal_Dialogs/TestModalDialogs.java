package Tests.Widgets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestModalDialogs extends Baseclass{

public void  test1(){
        Page_Widgets Alerts_Frame_Windows = new Page_Alerts_Frame_Windows();
        Page_ModalDialogs ModalDialogs = new Page_ModalDialogs();
        Helpers helpers = new Helpers();

        helpers.getURL(Alerts_Frame_Windows.getUrl());
        helpers.clickBy(Alerts_Frame_Windows.ModalDialogs);
        page_Alerts_Frame_Windows.click_showSmallModal();
        }

        public void  test2(){
                Page_Widgets Alerts_Frame_Windows = new Page_Alerts_Frame_Windows();
                Page_ModalDialogs ModalDialogs = new Page_ModalDialogs();
                Helpers helpers = new Helpers();

                helpers.getURL(Alerts_Frame_Windows.getUrl());
                helpers.clickBy(Alerts_Frame_Windows.ModalDialogs);
                page_Alerts_Frame&Windows.click_showLargeModal();
        }




}


