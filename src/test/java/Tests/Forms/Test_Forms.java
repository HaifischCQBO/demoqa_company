/**
 * @Autor: Jhon Sebastián Ramos Muñoz
 */

package Tests.Forms;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Forms.PageConfirmationForm;
import Pages.Forms.PageForms;
import Pages.Page_index;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Forms extends BaseClass {

    @Test
    public void Test_forms(){

        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        helpers.scrollDown(500);

        Page_index pageIndex = new Page_index(driver);
        pageIndex.click_card_Forms();

        PageForms pageForms = new PageForms(driver);
        pageForms.click_practice_Form_button();
        pageForms.fill_form_practice_Form();
        String textName = pageForms.getTextFirstName() + " " + pageForms.getTextLastName();
        String textEmail = pageForms.getTextuserEmail();
        String textGender = pageForms.getText_radio_button_gender_male();
        String textMobile = pageForms.getTextUserNumber();
        String textDateBirth = pageForms.getTextDateOfBirthInput();
        String textSubjects = "Maths, Economics";
        String textHobbies = pageForms.getTextSports_checkbox()+", "+ pageForms.getTextReading_checkbox()+", "+ pageForms.getTextMusic_checkbox();
        String textPicture = pageForms.filePath;
        String textAddress = pageForms.getTextCurrent_address_input();
        String textState_City= "NCR Noida";

        pageForms.press_submit_button();

        PageConfirmationForm pageConfirmationForm = new PageConfirmationForm(driver);
        String textStudentName= pageConfirmationForm.getTextStudentName();
        String textStudentEmail= pageConfirmationForm.getTextStudentEmail();
        String textStudentGender= pageConfirmationForm.getTextStudentGender();
        String textStudentMobile= pageConfirmationForm.getTextStudentMobile();
        String textStudentDateBirth=pageConfirmationForm.getTextStudentDateBirth();
        String textStudentSubjects= pageConfirmationForm.getTextStudentSubjects();
        String textStudentHobbies= pageConfirmationForm.getTextStudentHobbies();
        String textStudentPicture= pageConfirmationForm.getTextStudentPicture();
        String textStudentAddress= pageConfirmationForm.getTextStudentAddress();
        String textStudentState_City= pageConfirmationForm.getTextStudentState_City();

        Assert.assertEquals(textStudentName, textName);
        Assert.assertEquals(textStudentEmail, textEmail);
        Assert.assertEquals(textStudentGender, textGender);
        Assert.assertEquals(textStudentMobile, textMobile);
        Assert.assertTrue(pageConfirmationForm.StudentDateBirth_confirmation(), "CAMPO VACÍO");
        Assert.assertEquals(textStudentSubjects, textSubjects);
        Assert.assertEquals(textStudentHobbies, textHobbies);
        Assert.assertTrue(pageConfirmationForm.StudentPicture_confirmation(), "CAMPO VACÍO");
        Assert.assertEquals(textStudentAddress, textAddress);
        Assert.assertEquals(textStudentState_City, textState_City);

    }

}
