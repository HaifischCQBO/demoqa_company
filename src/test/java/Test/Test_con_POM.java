package Test;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.demoqa.Page_Profile;
import org.testng.annotations.Test;

public class Test_con_POM extends BaseClass {

    @Test(priority = 1)
    public void link_newtab_test_home() {

        //Pagina Page_Index
        driver.manage().window().maximize();
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        Page_Index page_index = new Page_Index(driver);
        page_index.click_card();

        //Pagina Page_Profile
        Page_Profile page_profile = new Page_Profile(driver);
        page_profile.click_profile();

        //Pagina click_login
        page_profile.click_login();

        //Ingresar datos al formulario login
        page_profile.dates_login();

        //Clic en boton login
        page_profile.click_botton();

        //clic delete libro
        page_profile.click_delete();

        //Clic en boton ok
        page_profile.click_ok();


    }
}
