package Pages.Widgets;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Page_Date_Picker {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Date_Picker(WebDriver driver) {
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * Web elements
     */

    /*select date*/
    public By date_picker_select = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]");
    public By select_date = By.xpath("//input[@id='datePickerMonthYearInput']");
    public By select_year = By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
    public By years = By.xpath("//select[@class='react-datepicker__year-select']/option");
    public By select_month = By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
    public By monthNames = By.xpath("//select[@class='react-datepicker__month-select']/option");

    public By days = By.xpath("//div[@role='listbox']");
    public By select_day = By.xpath("//div[@role='option']");
    // //div[@role='listbox']
    /*date and time*/
    public By select_date_and_time = By.xpath("//*[@id=\"dateAndTimePickerInput\"]");
    public By pick_year = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]");
    public By pick_month = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]");
    public By pick_day = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]");
    public By pick_time = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[79]");


    /**
     * Functions
     */

    //Importante: dar click antes al input
    public ArrayList<String> getMonthNames(){
        helpers.scrollDown(100);
        helpers.clickElement(select_date);
        ArrayList<String> names = new ArrayList<String>();
        List<WebElement> options = driver.findElements(monthNames);
        for(WebElement option : options){
            names.add(option.getText());
        }
        return names;
    }

    public ArrayList<String> getYears(){
        ArrayList<String> year = new ArrayList<String>();
        List<WebElement> options = driver.findElements(years);
        for(WebElement option : options){
            year.add(option.getText());
        }
        return year;
    }
    public ArrayList<String> getDays(){
        ArrayList<String> day = new ArrayList<String>();
        List<WebElement> options = driver.findElements(days);
        System.out.println(options);
        for(int option = 1; option<=31; option++){
            day.add(String.valueOf(options.get(option)));
        }
        return day;
    }

    public void click_date_picker() {
        helpers.scrollDown(500);
        helpers.clickElement(date_picker_select);
    }

    /**
     * public void click_select_date() {
     *         helpers.clickBy(select_date);
     *         helpers.SelectByIndex(select_year);
     *         helpers.SelectByIndex(select_month);
     *         helpers.clickBy(select_day);
     *     }
     */

    public String click_select_year(int yearIndex){

        Select select = new Select(driver.findElement(select_year));
        select.selectByIndex(yearIndex);
        return  select.getFirstSelectedOption().getText();
    }

    public String click_select_month(int mesIndex){

        Select select = new Select(driver.findElement(select_month));
        select.selectByIndex(mesIndex);
        return  select.getFirstSelectedOption().getText();
    }

    public String click_select_day(int dayIndex){

        Select select = new Select(driver.findElement(select_day));
        select.selectByIndex(dayIndex);
        return  select.getFirstSelectedOption().getText();
    }

    public void clkSelect_date_and_time() {
        helpers.scrollDown(200);
        helpers.clickElement(select_date_and_time);
        helpers.SendText(select_date_and_time, "June 24, 1994 06:30 AM");

    }
}

