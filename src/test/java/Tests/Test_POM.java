package Tests;

import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Helpers.Helpers;
import pages.Page_Elements;
import pages.Page_Index;
import pages.Page_broken;
import pages.Page_text_box;
import pages.text;

public class Test_POM  extends BaseClass{

    @Test
 public void Test_broken_links () {
     Helpers helpers = new Helpers(driver);
     helpers.getURL(helpers.getXMLParameter("url"));

     Page_Index page_Index = new Page_Index(driver);
     page_Index.click_elements();

     Page_Elements page_Elements = new Page_Elements();
     Page_Elements.click_Broken_Links();


    Page_broken page_of_broken = new Page_broken(driver);
    page_of_broken.click_valid_button(); 

    Page_Index page_Index = new Page_Index(driver);
    page_Index.click_elements();

    Page_Elements page_Elements = new Page_Elements();
    Page_Elements.click_Broken_Links();

     Page_broken page_broken = new Page_broken(driver);
     page_broken.click_Broken_button();

 }   


 @Test
 public void Test2_text_box () {
     Helpers helpers = new Helpers(driver);
     helpers.getURL(helpers.getXMLParameter("url"));
     
     Page_Index page_Index = new Page_Index(driver);
     page_Index.click_elements();

     Page_Elements page_Elements = new Page_Elements(driver);
     page_Elements.click_text_box();

     Page_text_box page_text_box = new Page_text_box(driver);
     Page_text_box.Text_Box_form();


 }   
}
