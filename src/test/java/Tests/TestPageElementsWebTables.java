package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.demoqa.elements.PageElementsWebTables;
import Pages.demoqa.elements.PageIndex;
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

        //____________________________________________________________-
        //test case 2
        String dataToSearch = "Elián";
        pageElementsWebTables.fill_web_tables_search_box(dataToSearch);
        //pageElementsWebTables.fill_web_tables_search_box(".");
        pageElementsWebTables.delete_search();

        //____________________________________________________________-
        //test case 3
        pageElementsWebTables.click_web_tables_edit_span();
        pageElementsWebTables.click_web_tables_edit_form_button();

        //____________________________________________________________-
        //test case 4
        pageElementsWebTables.click_web_tables_delete_span();

    }

}
