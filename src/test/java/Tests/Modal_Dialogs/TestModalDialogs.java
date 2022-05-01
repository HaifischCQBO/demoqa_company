package Tests.Widgets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestModalDialogs extends Baseclass{

public void  test1{
        Page_Widgets Alerts_Frame&Windows = new Page_Alerts_Frame&Windows();
        Page_ModalDialogs ModalDialogs = new Page_ModalDialogs();
        Helpers helpers = new Helpers();

        helpers.getURL(Alerts_Frame&Windows.getUrl());
        helpers.clickBy(Alerts_Frame&Windows.ModalDialogs);
        page_Alerts_Frame&Windows.click_showSmallModal();
        }

        public void  test1{
                Page_Widgets Alerts_Frame&Windows = new Page_Alerts_Frame&Windows();
                Page_ModalDialogs ModalDialogs = new Page_ModalDialogs();
                Helpers helpers = new Helpers();

                helpers.getURL(Alerts_Frame&Windows.getUrl());
                helpers.clickBy(Alerts_Frame&Windows.ModalDialogs);
                page_Alerts_Frame&Windows.click_showLargeModal();
        }




}


