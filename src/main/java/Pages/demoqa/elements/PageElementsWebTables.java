package Pages.demoqa.elements;

import Helpers.Helpers;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageElementsWebTables {
    public WebDriver driver;
    public Helpers helpers;

    public PageElementsWebTables(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
        JavascriptExecutor js = (JavascriptExecutor) this.driver; // scroll down
        js.executeScript("window.scrollBy(0,10)"); // scroll down

        //hacer zoom
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //driver.get("chrome://settings/");
        //js.executeScript("chrome.settingsPrivate.setDefaultZoom(0.5);");




    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    //-------------------------------------------------------------------------------------------------------
    // web elements test case 1
    //public By web_tables_li = By.cssSelector("#item-3");
    public By web_tables_li = By.xpath("//li[@class=\"btn btn-light \"][4]");
    public By web_tables_add_button = By.cssSelector("#addNewRecordButton");
    public By web_tables_first_name_input = By.cssSelector("#firstName");
    public By web_tables_last_name_input = By.cssSelector("#lastName");
    public By web_tables_email_input = By.cssSelector("#userEmail");
    public By web_tables_age_input = By.cssSelector("#age");
    public By web_tables_salary_input = By.cssSelector("#salary");
    public By web_tables_department_input = By.cssSelector("#department");
    public By web_tables_submit_button = By.cssSelector("#submit");

    //-------------------------------------------------------------------------------------------------------

    // web elements test case 2

    public By web_tables_search_box = By.cssSelector("#searchBox");

    //-------------------------------------------------------------------------------------------------------

    // web elements test case 3

    //public By web_tables_edit_span = By.id("#edit-record-1");
    //public By web_tables_edit_span = By.xpath("//span[@id=\"edit-record-1\"]");
    //public By web_tables_edit_span = By.xpath("//span[@title=\"Edit\"][1]");
    public By web_tables_edit_span = By.xpath("//span[@id='edit-record-1']");
    //-------------------------------------------------------------------------------------------------------
    // web elements test case 4

    public By web_tables_delete_span = By.xpath("//span[@id='delete-record-2']");

    //-------------------------------------------------------------------------------------------------------




    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */
    //-------------------------------------------------------------------------------------------------------

    //  test case 1

    public void click_web_tables_li(){
        helpers.clickBy(web_tables_li);
        //driver.findElement(find_flights_button).click();
    }
    public void click_web_tables_add_button(){
        helpers.clickBy(web_tables_add_button);
        //driver.findElement(find_flights_button).click();
    }

    public void fill_registration_form() {
        //Faker faker = new Faker();
        //helpers.SendText(web_tables_first_name_input, faker.name().firstName());
        //helpers.SendText(web_tables_last_name_input, faker.name().lastName());
        //helpers.SendText(web_tables_email_input, "fake.email@domain.com" );
        //helpers.SendText(web_tables_age_input, String.valueOf(helpers.GetRandomNumber(50)));
        //helpers.SendText(web_tables_salary_input, String.valueOf(helpers.GetRandomNumber(1000000)));
        //helpers.SendText(web_tables_department_input, faker.address().state());

        helpers.SendText(web_tables_first_name_input, "Elián");
        helpers.SendText(web_tables_last_name_input, "Díaz");
        helpers.SendText(web_tables_email_input, "eadv@dominio.com" );
        helpers.SendText(web_tables_age_input, "21");
        helpers.SendText(web_tables_salary_input, "99999");
        helpers.SendText(web_tables_department_input, "Santander");


    }
    public void click_web_tables_registration_form_button(){
        helpers.clickBy(web_tables_submit_button);
        //driver.findElement(find_flights_button).click();
    }

    //-------------------------------------------------------------------------------------------------------

    //  test case 2
    public void fill_web_tables_search_box(String dataSearch){
        helpers.SendText(web_tables_search_box, dataSearch);
    }

    //-------------------------------------------------------------------------------------------------------

    //  test case 3

    public void click_web_tables_edit_span(){
        helpers.clickBy(web_tables_edit_span);
        //driver.findElement(find_flights_button).click();
    }

    public void fill_registration_form_edit() {

        helpers.SendText(web_tables_first_name_input, "Elián");
        helpers.SendText(web_tables_last_name_input, "Díaz");
        helpers.SendText(web_tables_email_input, "eadv@dominio.com" );
        helpers.SendText(web_tables_age_input, "21");
        helpers.SendText(web_tables_salary_input, "99999");
        helpers.SendText(web_tables_department_input, "Santander");


    }

    public void click_web_tables_edit_form_button(){
        helpers.clickBy(web_tables_submit_button);
        //driver.findElement(find_flights_button).click();
    }

    //-------------------------------------------------------------------------------------------------------

    //  test case 4

    public void click_web_tables_delete_span(){
        helpers.clickBy(web_tables_delete_span);
        //driver.findElement(find_flights_button).click();
    }

    public void delete_search() {
        helpers.deleteInput(web_tables_search_box);
    }
}

