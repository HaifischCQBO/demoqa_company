package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageConfirmationForm {

    public WebDriver driver;
    public Helpers helpers;

    public PageConfirmationForm(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By studentName= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr/td[2]");
    public By studentEmail= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr[2]/td[2]");
    public By studentGender= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr[3]/td[2]");
    public By studentMobile= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr[4]/td[2]");
    public By studentDateBirth= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr[5]/td[2]");
    public By studentSubjects= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr[6]/td[2]");
    public By studentHobbies= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr[7]/td[2]");
    public By studentPicture= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr[8]/td[2]");
    public By studentAddress= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr[9]/td[2]");
    public By studentState_City= By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr[10]/td[2]");



    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public String getTextStudentName(){
        return helpers.getText(studentName);
    }
    public String getTextStudentEmail(){
        return helpers.getText(studentEmail);
    }
    public String getTextStudentGender(){
        return helpers.getText(studentGender);
    }
    public String getTextStudentMobile(){
        return helpers.getText(studentMobile);
    }
    public String getTextStudentDateBirth(){
        return helpers.getText(studentDateBirth);
    }
    public String getTextStudentSubjects(){
        return helpers.getText(studentSubjects);
    }
    public String getTextStudentHobbies(){
        return helpers.getText(studentHobbies);
    }
    public String getTextStudentPicture(){
        return helpers.getText(studentPicture);
    }
    public String getTextStudentAddress(){
        return helpers.getText(studentAddress);
    }
    public String getTextStudentState_City(){
        return helpers.getText(studentState_City);
    }


}
