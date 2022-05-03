package Pages.Widgets;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Date_Picker {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Date_Picker(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**Web elements
     *
     * */

    /*select date*/
    public By date_picker_select = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]");
    public By select_date = By.xpath("//input[@id='datePickerMonthYearInput']");
    public By select_year = By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
    public By select_month = By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
    public By select_day = By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[6]/div[5]");
    /*date and time*/
    public By select_date_and_time = By.xpath("//*[@id=\"dateAndTimePickerInput\"]");
    public By pick_year = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]");
    public By pick_month = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]");
    public By pick_day = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]");
    public By pick_time = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[79]");


    /**Functions
     *
     * */

    public void click_date_picker(){
        helpers.scrollDown(500);
        helpers.clickElement(date_picker_select);
    }

    public void click_select_date(){
        helpers.clickElement(select_date);
        helpers.SelectByIndex(select_year);
        helpers.SelectByIndex(select_month);
        helpers.clickElement(select_day);
    }

    public void clkSelect_date_and_time(){
        helpers.scrollDown(200);
        helpers.clickElement(select_date_and_time);
        helpers.SendText(select_date_and_time,"June 24, 1994 06:30 AM");

    }
}

