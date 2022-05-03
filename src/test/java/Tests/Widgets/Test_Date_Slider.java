package Tests.Widgets;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Widgets.Page_Date_Picker;
import Pages.Widgets.Page_Slider;
import Pages.Widgets.Page_Widgets;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Date_Slider extends BaseClass {

    @Test
    public void Date_picker_test() {


        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        Page_Widgets page_widgets = new Page_Widgets(driver);
        page_widgets.click_widgets();


        Page_Date_Picker page_date_picker = new Page_Date_Picker(driver);
        page_date_picker.click_date_picker();
        page_date_picker.click_select_date();
        //Assert.assertEquals(page_date_picker.getYear(),"2010");
        //Assert.assertEquals(page_date_picker.getMonth(),"3");
        //Assert.assertEquals(page_date_picker.getDay(),"9");

        page_date_picker.clkSelect_date_and_time();


        Page_Slider page_slider = new Page_Slider(driver);
        page_slider.click_slider();
        page_slider.slider();
        Assert.assertEquals(page_slider.valor(), "69");
    }
}
