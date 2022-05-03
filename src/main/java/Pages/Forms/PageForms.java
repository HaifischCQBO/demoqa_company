package Pages.Forms;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//==========================================Constructor========================================================
public class PageForms {

    public WebDriver driver;
    public Helpers helpers;
    public String filePath = "D:\\QA\\github\\demoqa_company\\Documentation\\iron-man-full-hd-wallpaper-for-desktop-mobiles-3840x2160.jpg";

    public PageForms(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By forms_button = By.xpath("//div[text()='Forms']/parent::div");
    public By practice_Form_button = By.xpath("//div[@class=\"element-list collapse show\"]");
    public By firstName_input = By.id("firstName");
    public By lastName_input = By.id("lastName");
    public By userEmail_input = By.id("userEmail");
    public By radio_button_gender_male = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]");
    public By radio_button_gender_female = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]");
    public By radio_button_gender_other = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]");
    public By userNumber_input = By.id("userNumber");
    public By dateOfBirth_input = By.id("dateOfBirthInput");
    public By day_button = By.xpath("//div[text()=\"25\"]");
    public By select_month = By.xpath("//select[@class=\"react-datepicker__month-select\"]");
    public By select_year = By.xpath("//select[@class=\"react-datepicker__year-select\"]");
    public By subjects_Input= By.id("subjectsInput");
    public By sports_checkbox= By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]");
    public By reading_checkbox= By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]");
    public By music_checkbox= By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]");
    public By seleccionar_archivo_button= By.id("uploadPicture");
    public By current_address_input= By.id("currentAddress");
    public By select_state= By.xpath("//*[@id=\"react-select-3-input\"]");
    public By select_city= By.xpath("//*[@id=\"react-select-4-input\"]");
    public By submit_button= By.id("submit");
    public By close_button= By.xpath("//*[@id=\"closeLargeModal\"]");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

   /* public void click_Forms_button(){

        helpers.clickBy(forms_button);

    }*/
    public void click_practice_Form_button(){

        helpers.clickBy(practice_Form_button);

    }

    public void fill_form_practice_Form(){
        WebElement subjects = driver.findElement(subjects_Input);
        WebElement stateList = driver.findElement(select_state);
        WebElement cityList = driver.findElement(select_city);

        helpers.SendText(firstName_input, "Jhon");
        helpers.SendText(lastName_input, "Ramos");
        helpers.SendText(userEmail_input,"2320601@tcs.com");
        helpers.clickBy(radio_button_gender_male);
        helpers.SendText(userNumber_input,"3005551234");
        helpers.scrollDown(500);
        helpers.clickBy(dateOfBirth_input);
        helpers.SelectByIndex(select_month);
        helpers.SelectByIndex(select_year);
        helpers.scrollDown(500);
        helpers.clickBy(day_button);
        helpers.SendText(subjects_Input,"Maths");
        subjects.sendKeys(Keys.ENTER);
        helpers.SendText(subjects_Input,"Economics");
        subjects.sendKeys(Keys.ENTER);
        helpers.clickBy(sports_checkbox);
        helpers.clickBy(reading_checkbox);
        helpers.clickBy(music_checkbox);
        helpers.findFile(seleccionar_archivo_button,filePath);
        helpers.scrollDown(500);
        helpers.SendText(current_address_input,"Calle 5 # 34B sur");
        helpers.zoomPage(0.5);
        helpers.SendText(select_state,"NCR");
        stateList.sendKeys(Keys.ENTER);
        helpers.SendText(select_city,"Noida");
        cityList.sendKeys(Keys.ENTER);
        cityList.sendKeys(Keys.TAB);


    }
    public void press_submit_button(){

        WebElement submit = driver.findElement(submit_button);
        submit.sendKeys(Keys.ENTER);
        System.out.println("Se hace ENTER en: "+ submit_button);
    }

    public String getTextFirstName(){

        return helpers.getValue(firstName_input);
    }
    public String getTextLastName(){

        return helpers.getValue(lastName_input);
    }
    public String getTextuserEmail(){

        return helpers.getValue(userEmail_input);
    }
    public String getText_radio_button_gender_male(){

        return helpers.getText(radio_button_gender_male);
    }
    public String getTextUserNumber(){

        return helpers.getValue(userNumber_input);
    }
    public String getTextDateOfBirthInput(){

        return helpers.getValue(dateOfBirth_input);
    }

    public String getTextSports_checkbox(){

        return helpers.getText(sports_checkbox);
    }
    public String getTextReading_checkbox(){

        return helpers.getText(reading_checkbox);
    }
    public String getTextMusic_checkbox(){

        return helpers.getText(music_checkbox);
    }
    public String getTextCurrent_address_input(){

        return helpers.getValue(current_address_input);
    }


}
