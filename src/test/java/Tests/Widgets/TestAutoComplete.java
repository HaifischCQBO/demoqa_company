package Tests.Widgets;

import Helpers.Helpers;
import Pages.demoqa.Page_AutoComplete;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestAutoComplete {

    @Test
    public void Test_ID_w_AC01(){
        Page_AutoComplete autoComplete = new Page_AutoComplete();
        Helpers helpers = new Helpers();
        WebDriver driver = autoComplete.driver;
        helpers.getURL(autoComplete.getUrl()); //Voy a l url
        //Miro que los dos input existan.
        Assert.assertNotNull(driver.findElement(autoComplete.multipleColor));
        Assert.assertNotNull(driver.findElement(autoComplete.singleColor));
    }
//id elementos react-select-2-option-0 el 0 incrementa...
   @Test
    public void Test_ID_w_AC02(){
        Page_AutoComplete autoComplete = new Page_AutoComplete();
        Helpers helpers = new Helpers();
        WebDriver driver = autoComplete.driver;
        helpers.getURL(autoComplete.getUrl()); //Voy a l url
        //Miro que los dos input existan.
        helpers.clickBy(autoComplete.multipleColor);
        helpers.SendText(autoComplete.multipleColor,"w");
        Assert.assertTrue(autoComplete.existElement_MultipleColorList("white"));
        Assert.assertTrue(autoComplete.existElement_MultipleColorList("Yellow"));
    }

    @DataProvider(name = "id_Tc")
    public Object[] createData1() {
        return new Object[] {
                new Integer(3) ,
                new Integer(4),
                new Integer(5),
        };
    }
    @Test(dataProvider = "id_Tc")
    public void Test_ID_w_AC03(Integer id_tc) throws InterruptedException {

        Page_AutoComplete autoComplete = new Page_AutoComplete();
        Helpers helpers = new Helpers();
        WebDriver driver = autoComplete.driver;
        String[][] steps = {{"w", "yellow"}, {"w", "white"}, {"b", "blue"}, {"b", "black"}};

        if(id_tc == 3) {
            helpers.Print("Test case ID_w_AC03");
            int indexElement = -1;
            helpers.getURL(autoComplete.getUrl());//Voy a l url en la primera ejecucion

            //Procedimiento para agregar los elementos al input multiple color
            for (int i = 0; i < steps.length; i++) {
                helpers.clickBy(autoComplete.multipleColor);
                helpers.SendText(autoComplete.multipleColor, steps[i][0]);
                Thread.sleep(100);
                indexElement = autoComplete.getIndexElementList_MultipleColorList(steps[i][1]);
                Assert.assertNotEquals(indexElement, -1);
                autoComplete.clickElementList_MultipleColor(indexElement);
                indexElement = -1;
            }

            //Verificamos que hayan sido agregados
            Assert.assertTrue(autoComplete.areElementsAdded_MultipleColorInput(steps)); //Verifica que se hayan agregado todos los elementos que se seleccionaron
            Assert.assertTrue(autoComplete.inputHaveCloseBUtton_MultipleColor()); //Verifica que esté el botton que borra todos los inputs
            Assert.assertTrue(autoComplete.elementsHaveCloseButton_MultipleColor_Input(steps)); //Verifica que todos los botones tengan su boton de X
        }
        else if(id_tc == 4){
            helpers.Print("Test case ID_w_AC04");
            Assert.assertTrue(autoComplete.areElementsAdded_MultipleColorInput(steps));
            helpers.clickBy(autoComplete.buttonDeleteMultipleColorInput);
            Assert.assertEquals(autoComplete.getSizeElements_MultipleColor_Input(),0);//Comprueba que no queden elementos
        }



    }



}
