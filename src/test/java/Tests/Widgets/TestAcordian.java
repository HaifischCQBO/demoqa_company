package Tests.Widgets;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Widgets.Page_Accordian;
import Pages.Page_Index;
import Pages.Page_Widgets;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestAcordian extends BaseClass {
    @Test
    public void Test_ID_W_A01()
    {
        Helpers helpers = new Helpers();
        Page_Accordian accordian = new Page_Accordian();
        helpers.getURL(accordian.getUrl());
        Assert.assertTrue(accordian.isAllCardsNotShowExceptIndex(0),"No se está mostrando la primera carta u otra carta tambien está visble.");
        Assert.assertEquals(accordian.sizeCardsAccordian(),3, "El acordion no tiene 3 cartas");
    }

    @DataProvider(name = "indexCard")
    public Object[] createData1() {
        return new Object[] {
                new Integer(1) ,
                new Integer(2),
                new Integer(0),
        };
    }
    @Test(dataProvider = "indexCard")
    public void Test_ID_W_A02_to_A04(Integer indexCard)
    {
        Helpers helpers = new Helpers();
        Page_Accordian accordian = new Page_Accordian();
        if(indexCard != 0) {
            helpers.getURL(accordian.getUrl());
            Assert.assertTrue(accordian.isCardIndexShow(0),"No se está mostrando inicialmente el contenido de la carta 2");
        }
        else{
            //Para testear la apertura del primero, tiene que estar abierto otro. en este caso aprovecho la apertura de la tercer carta (indice 2)
            Assert.assertTrue(accordian.isCardIndexShow(2),"No se está mostrando inicialmente el contenido de la carta 3");
        }
        Assert.assertEquals(accordian.sizeCardsAccordian(),3, "El acordion no tiene 3 cartas");
        accordian.clickCardIndex(indexCard); //Click en la carta 2
        helpers.Pause(1);
        Assert.assertTrue(accordian.isAllCardsNotShowExceptIndex(indexCard),"No se está mostrando el contenido de la carta" + (indexCard  + 1));
    }

    @Test
    public void Test_ID_W_A05()
    {
        Page_Widgets widgets = new Page_Widgets();
        Page_Accordian accordian = new Page_Accordian();
        Helpers helpers = new Helpers();

        helpers.getURL(widgets.getUrl());
        helpers.clickBy(widgets.accordian);
        Assert.assertEquals(driver.getCurrentUrl(),accordian.getUrl(), "El usuario no fue redireccionado a: " + accordian.getUrl());
    }

    @Test
    public void Test_ID_W_A06()
    {
        Page_Index index = new Page_Index();
        Page_Widgets widgets = new Page_Widgets();
        Helpers helpers = new Helpers();

        helpers.getURL(index.getUrl());
        WebElement btn_widgets = index.findCategoryCard(3);
        Assert.assertNotNull(btn_widgets, "El objeto es nulo");

        helpers.clickWebelement(btn_widgets);
        Assert.assertEquals(driver.getCurrentUrl(),widgets.getUrl());
    }
}
