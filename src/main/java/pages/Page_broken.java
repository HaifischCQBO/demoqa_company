package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_broken {

        public WebDriver driver;
        public Helpers   helpers;

        public Page_broken(WebDriver driver){
            this.driver = driver;
            helpers = new Helpers(driver);
        }
}

// webElements // webElements // webElements // webElements // webElements // webElements // webElements //



        private By Valid_link = By.xpath("//img[@src='/images/Toolsqa.jpg']" );
        private By Brok_link = By.xpath("//a[@href=\'http://demoqa.com\'] " );
        private By Image_link = By.xpath("//a[@href=\'http://the-internet.herokuapp.com/status codes/500\']");


 // Funciones // // Funciones // // Funciones // // Funciones // // Funciones // // Funciones // // Funciones //


        public void click_valid_button(){
            helpers.clickElement(Valid_link);
        }

        public void click_Broken_button (){

            helpers.clickElement(Brok_link);
        }

        public void click_image (){

            helpers.clickElement(Image_link);
        }