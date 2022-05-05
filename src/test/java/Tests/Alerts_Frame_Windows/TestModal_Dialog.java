package Tests.Alerts_Frame_Windows;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Demoqa.Alerts_Frame_Windows.Page_Alert_Frame_Windows;
import Pages.demoqa.Alerts_Frame_Windows.Page_Modal_Dialog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModal_Dialog extends BaseClass {

    @Test
    public void Test1() throws InterruptedException {
        Page_Modal_Dialog modalDialog = new Page_Modal_Dialog();
        Helpers helpers = new Helpers(modalDialog.driver);
        helpers.getURL(helpers.getXMLParameter("url"));

        Page_Alert_Frame_Windows page_alert_frame_windows = new Page_Alert_Frame_Windows(driver);
        page_alert_frame_windows.clickAlert_Frame_Windows();



        modalDialog.clickBtnSmallModal();
        Assert.assertTrue(modalDialog.findSmallModalAlert());
        modalDialog.clickBtnCloseSmallModal();


        modalDialog.clickBtnlargeModal();
        Assert.assertTrue(modalDialog.findlargeModalAlert());
        modalDialog.clickBtnCloselargeModal();
    }
}
