package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//==========================================Constructor========================================================
public class PageForms {

    public WebDriver driver;
    public Helpers helpers;

    public PageForms(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By forms_button = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div");
    public By practice_Form_button = By.id("item-0");
    public By firstName_input = By.id("firstName");
    public By lastName_input = By.id("lastName");
    public By userEmail_input = By.id("userEmail");
    public By radio_button_gender_male = By.id("gender-radio-1");
    public By radio_button_gender_female = By.id("gender-radio-2");
    public By radio_button_gender_other = By.id("gender-radio-3");
    public By userNumber_input = By.id("userNumber");
    public By dateOfBirth_input = By.id("dateOfBirthInput");
    public By day_button = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[2]");
    public By select_month = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
    public By select_year = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
    public By subjects_Input= By.id("subjectsInput");
    public By sports_checkbox= By.id("hobbies-checkbox-1");
    public By reading_checkbox= By.id("hobbies-checkbox-2");
    public By music_checkbox= By.id("hobbies-checkbox-3");
    public By seleccionar_archivo_button= By.id("uploadPicture");
    public By current_address_input= By.id("currentAddress");
    public By select_state= By.id("state");
    public By select_city= By.id("city");
    public By submit_button= By.id("submit");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public String select_departure_city(){
        return helpers.SelectByIndex(departure_city_select);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public String select_destination_city(){
        return helpers.SelectByIndex(destination_city_select);
        //driver.findElement(destination_city_select).sendKeys("Berlin");
    }

    public void click_find_flights(){
        helpers.clickBy(find_flights_button);
        //driver.findElement(find_flights_button).click();
    }
}
