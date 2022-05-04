package Tests.Widgets;

import Helpers.Helpers;
import Pages.Widgets.Page_AutoComplete;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

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
        Assert.assertTrue(autoComplete.existElement_ListAutoComplete("white",autoComplete.listAutoCompleteMultipleC));
        Assert.assertTrue(autoComplete.existElement_ListAutoComplete("Yellow",autoComplete.listAutoCompleteMultipleC));
    }

    public void addElements_Input(String[][] steps,Helpers helpers, Page_AutoComplete autoComplete, By input, By list){
        int indexElement = -1;
        for (int i = 0; i < steps.length; i++) {
            //helpers.clickBy(input); //Por alguna razon falla el case W-AC07 con el click...
            helpers.SendText(input, steps[i][0]);
            helpers.PauseMilisegundos(200);
            indexElement = autoComplete.getIndexElement_ListAutoComplete(steps[i][1],list);
            Assert.assertNotEquals(indexElement, -1);
            autoComplete.clickElement_ListAutoComplete(indexElement,list);
            indexElement = -1;
        }
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

        helpers.getURL(autoComplete.getUrl());//Voy a l url en la primera ejecucion
        addElements_Input(steps,helpers,autoComplete,autoComplete.multipleColor,autoComplete.listAutoCompleteMultipleC); //Procedimiento para agregar los elementos al input multiple color. tiene asserts dentro. NO SE DONDE DEBERPIA IR ALGO ASÍ


        if(id_tc == 3) {
            helpers.Print("Test case ID_w_AC03");

            //Verificamos que hayan sido agregados
            Assert.assertTrue(autoComplete.areElementsAdded_Input(steps,autoComplete.label_elements_MultipleColorInput)); //Verifica que se hayan agregado todos los elementos que se seleccionaron
            Assert.assertTrue(autoComplete.inputHaveCloseButton_MultipleColor()); //Verifica que esté el botton que borra todos los inputs
            Assert.assertTrue(autoComplete.elementsHaveCloseButton_Input(steps,autoComplete.elements_MultipleColorInput)); //Verifica que todos los botones tengan su boton de X
        }
        else if(id_tc == 4){
            //aprovecho los elementos agregados y validados anteriormente.
            helpers.Print("Test case ID_w_AC04");
            Assert.assertTrue(autoComplete.areElementsAdded_Input(steps,autoComplete.label_elements_MultipleColorInput));
            helpers.clickBy(autoComplete.buttonDeleteMultipleColorInput);
            Assert.assertEquals(autoComplete.getSizeElements_Input(autoComplete.elements_MultipleColorInput),0);//Comprueba que no queden elementos
        }
        else if(id_tc == 5)
        {
            helpers.Print("Test case ID_w_AC05");
            ArrayList<String> elements = new ArrayList<>();
            String elementToSave = steps[1][1]; //white
            //getCloseButtonElement_MultipleColor_Input
            //Agrego los elementos a un array list.
            for (int i = 0; i < steps.length; i++) {
                if(!steps[i][1].equals(elementToSave)) //Borro todos menos el white.
                    elements.add(steps[i][1]);
            }
            //Borro los elementos
            for (String element: elements) {
                helpers.clickWebelement(autoComplete.getCloseButtonElement_MultipleColor_Input(element,autoComplete.elements_MultipleColorInput));
            }
            Assert.assertEquals(autoComplete.getSizeElements_Input(autoComplete.elements_MultipleColorInput),1); //Verifica que haya quedado un solo elemento
            Assert.assertTrue(autoComplete.isElementAdded_Label(elementToSave,autoComplete.elements_MultipleColorInput)); // Verifica que el elmento sea white.
        }
    }

    @Test
    public void Test_ID_w_AC06(){
        Page_AutoComplete autoComplete = new Page_AutoComplete();
        Helpers helpers = new Helpers();
        WebDriver driver = autoComplete.driver;
        helpers.getURL(autoComplete.getUrl()); //Voy a l url
        //Miro que los dos input existan.
        helpers.clickBy(autoComplete.singleColor);
        helpers.SendText(autoComplete.singleColor,"w");
        Assert.assertTrue(autoComplete.existElement_ListAutoComplete("white",autoComplete.listAutoCompleteMonoC));
        Assert.assertTrue(autoComplete.existElement_ListAutoComplete("Yellow",autoComplete.listAutoCompleteMonoC));
    }

    @Test
    public void Test_ID_w_AC07(){
        Page_AutoComplete autoComplete = new Page_AutoComplete();
        Helpers helpers = new Helpers();
        int indexElement;
        WebDriver driver = autoComplete.driver;
        helpers.getURL(autoComplete.getUrl()); //Voy a l url
        //Miro que los dos input existan.
        String[][] steps = {{"w", "yellow"}, {"w", "white"}};
        addElements_Input(steps,helpers,autoComplete,autoComplete.singleColor,autoComplete.listAutoCompleteMonoC);
        Assert.assertTrue(autoComplete.isElementAdded_Label(steps[steps.length -1][1],autoComplete.element_SingleColorInput)); // Verifica que el elmento sea white.
    }

}
