/**
 * @Autor: Jhon Sebastián Ramos Muñoz
 */

package Tests.Elements;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Elements.PageElementsDynamicsProperties;
import Pages.Page_index;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_DynamicsProperties extends BaseClass {
    @Test
    public void test_DynamicsProperties(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        helpers.scrollDown(500);

        Page_index pageIndex = new Page_index(driver);
        pageIndex.click_card_Elements();
        helpers.scrollDown(1000);
        PageElementsDynamicsProperties pageElementsDynamicsProperties = new PageElementsDynamicsProperties(driver);
        pageElementsDynamicsProperties.click_DynamicsProperties_button();
        pageElementsDynamicsProperties.wait_seconds(6);
        helpers.scrollDown(100);
        pageElementsDynamicsProperties.getTextVisibleButton();
        Assert.assertTrue(pageElementsDynamicsProperties.DynamicsP_confirmation(), "Elemento no encontrado");

    }
}
