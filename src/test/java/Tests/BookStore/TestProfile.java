package test;

import baseclass.BaseClase;
import helpers.Helpers;
import org.testng.annotations.Test;
import page.PageProfile;

public class TestProfile extends BaseClase {

    @Test

    public void testProfile() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        helpers.max();

        PageProfile pageProfile = new PageProfile(driver);

         pageProfile.clic_book();
         pageProfile.espera();
         pageProfile.bajar();
         pageProfile.espera();
         pageProfile.clickprofile();
         pageProfile.registro();
         pageProfile.espera();
         pageProfile.user();
         pageProfile.contrasena();
         pageProfile.acceso();
         pageProfile.espera();
         pageProfile.bajar();
         pageProfile.espera();
        pageProfile.eliminarcta();


    }

}
