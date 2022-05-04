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



        private By Valid_link = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]" );
        private By Brok_link = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[2]" );
        private By Image_link = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[1]");


 // Funciones // // Funciones // // Funciones // // Funciones // // Funciones // // Funciones // // Funciones //


        public void click_valid_button(){
            helpers.double_clickBy(Valid_link);
        }

        public void click_Broken_button (){
            helpers.double_clickBy(Brok_link);
        }

        public void click_image (){
            helpers.double_clickBy(Image_link);
        }