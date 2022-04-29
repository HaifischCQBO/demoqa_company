package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Demoqa.elements.PageElementsWebTables;
import Pages.Demoqa.elements.PageIndex;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPageElementsWebTables extends BaseClass {

    @Test
    public void Test_case_1() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        PageIndex pageIndex = new PageIndex(driver);
        pageIndex.click_elements_div();

        PageElementsWebTables pageElementsWebTables = new PageElementsWebTables(driver);
        pageElementsWebTables.click_web_tables_li();
        pageElementsWebTables.click_web_tables_add_button();
        pageElementsWebTables.fill_registration_form();
        pageElementsWebTables.click_web_tables_registration_form_button();

        String pageElements = pageElementsWebTables.confirm_div_text_elements();
        Assert.assertEquals(pageElements, "Elián");


    }

    @Test
    public void Test_case_2() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        PageIndex pageIndex = new PageIndex(driver);
        pageIndex.click_elements_div();

        PageElementsWebTables pageElementsWebTables = new PageElementsWebTables(driver);
        pageElementsWebTables.click_web_tables_li();

        //____________________________________________________________-
        //test case 2
        String dataToSearch = "Cierra";
        pageElementsWebTables.fill_web_tables_search_box(dataToSearch);

        String pageElementsSearch = pageElementsWebTables.confirm_div_text_elements_search();
        Assert.assertEquals(pageElementsSearch, "Cierra");

        //pageElementsWebTables.fill_web_tables_search_box(".");
        //pageElementsWebTables.delete_search();

    }

    @Test
    public void Test_case_3() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        PageIndex pageIndex = new PageIndex(driver);
        pageIndex.click_elements_div();

        PageElementsWebTables pageElementsWebTables = new PageElementsWebTables(driver);
        pageElementsWebTables.click_web_tables_li();

        //____________________________________________________________-
        //test case 3
        pageElementsWebTables.click_web_tables_edit_span();
        pageElementsWebTables.fill_registration_form_edit();
        pageElementsWebTables.click_web_tables_edit_form_button();
        String pageElementsModify = pageElementsWebTables.confirm_div_text_elements_modify();
        Assert.assertEquals(pageElementsModify, "Andrés");


    }

    @Test
    public void Test_case_4() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        PageIndex pageIndex = new PageIndex(driver);
        pageIndex.click_elements_div();

        PageElementsWebTables pageElementsWebTables = new PageElementsWebTables(driver);
        pageElementsWebTables.click_web_tables_li();

        //____________________________________________________________-
        //test case 4
        pageElementsWebTables.click_web_tables_delete_span();

    }

}
