package Tests.Widgets;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Widgets.Page_Date_Picker;
import Pages.Widgets.Page_Slider;
import Pages.Widgets.Page_Widgets;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Random;

public class Test_Date_Slider extends BaseClass {

    @Test
    public void Date_picker_test() {
        Helpers helpers = new Helpers(driver);
        Page_Date_Picker page_date_picker = new Page_Date_Picker(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        Page_Widgets page_widgets = new Page_Widgets(driver);
        page_widgets.click_widgets();
        Random r = new Random();
        int randonMonth;
        ArrayList<String> mes;
        int randomYear;
        ArrayList<String> year;
        int randomDay;
        ArrayList<String> day_selected;


        page_date_picker.click_date_picker(); //click input

        mes = new ArrayList<>(page_date_picker.getMonthNames());
        randonMonth = r.nextInt(mes.size() -1);

        year = new ArrayList<>(page_date_picker.getYears());
        randomYear = r.nextInt(year.size() -1);

        day_selected = new ArrayList<>(page_date_picker.getDays());
        randomDay = r.nextInt(day_selected.size() -1);


        Assert.assertEquals(page_date_picker.click_select_month(randonMonth),mes.get(randonMonth));
        Assert.assertEquals(page_date_picker.click_select_year(randomYear),year.get(randomYear));
        Assert.assertEquals(page_date_picker.click_select_day(randomDay), day_selected.get(randomDay));



        //page_date_picker.clkSelect_date_and_time();

        Page_Slider page_slider = new Page_Slider(driver);
        page_slider.click_slider();
        page_slider.slider();
        Assert.assertEquals(page_slider.valor(), "68");
    }
}
