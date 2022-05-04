/*********************************************************************************************************
    Realizado por:
        Elián Andrés Díaz Vargas
 *******************************************************************************************************/
package Pages.Elements;

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

    public By web_tables_first_name_input = By.xpath("//input[@id='firstName']");
    public By web_tables_last_name_input = By.cssSelector("#lastName");
    public By web_tables_email_input = By.cssSelector("#userEmail");
    public By web_tables_age_input = By.cssSelector("#age");
    public By web_tables_salary_input = By.cssSelector("#salary");
    public By web_tables_department_input = By.cssSelector("#department");
    public By web_tables_submit_button = By.cssSelector("#submit");

    public By div_text_elements_elian = By.xpath("//div[contains(text(),'Elián')]");


    //-------------------------------------------------------------------------------------------------------

    // web elements test case 2

    public By web_tables_search_box = By.cssSelector("#searchBox");
    public By div_text_elements_cierra = By.xpath("//div[contains(text(),'Cierra')]");

    //-------------------------------------------------------------------------------------------------------

    // web elements test case 3

    //public By web_tables_edit_span = By.id("#edit-record-1");
    //public By web_tables_edit_span = By.xpath("//span[@id=\"edit-record-1\"]");
    //public By web_tables_edit_span = By.xpath("//span[@title=\"Edit\"][1]");
    public By web_tables_edit_span = By.xpath("//span[@id='edit-record-1']");
    public By div_text_elements_andres = By.xpath("//div[contains(text(),'Andrés')]");
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
        helpers.clickGoToElement(web_tables_li);
        //driver.findElement(find_flights_button).click();
    }
    public void click_web_tables_add_button(){
        helpers.clickGoToElement(web_tables_add_button);
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
        helpers.clickGoToElement(web_tables_submit_button);
        //driver.findElement(find_flights_button).click();
    }

    public String confirm_div_text_elements() {
        return helpers.getText(div_text_elements_elian);
    }

    //-------------------------------------------------------------------------------------------------------

    //  test case 2
    public void fill_web_tables_search_box(String dataSearch){
        helpers.SendText(web_tables_search_box, dataSearch);
    }
    public String confirm_div_text_elements_search() {
        return helpers.getText(div_text_elements_cierra);
    }

    //-------------------------------------------------------------------------------------------------------

    //  test case 3

    public void click_web_tables_edit_span(){
        helpers.clickGoToElement(web_tables_edit_span);
        //driver.findElement(find_flights_button).click();
    }

    public void fill_registration_form_edit() {

        helpers.SendText(web_tables_first_name_input, "Andrés");
        helpers.SendText(web_tables_last_name_input, "Díaz");
        helpers.SendText(web_tables_email_input, "eadv@dominio.com" );
        helpers.SendText(web_tables_age_input, "21");
        helpers.SendText(web_tables_salary_input, "99999");
        helpers.SendText(web_tables_department_input, "Santander");


    }

    public void click_web_tables_edit_form_button(){
        helpers.clickGoToElement(web_tables_submit_button);
        //driver.findElement(find_flights_button).click();
    }

    public String confirm_div_text_elements_modify() {
        return helpers.getText(div_text_elements_andres);
    }

    //-------------------------------------------------------------------------------------------------------

    //  test case 4

    public void click_web_tables_delete_span(){
        helpers.clickGoToElement(web_tables_delete_span);
        //driver.findElement(find_flights_button).click();
    }

    public String confirm_web_tables_row_deleted(){
        return helpers.findElement(web_tables_delete_span);
    }


}