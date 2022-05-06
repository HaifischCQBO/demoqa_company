package Tests.Interactions;

import Helpers.Helpers;
import Pages.interactions.PageDroppable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCDroppable {

    /**TEST CASE 1**/
    @Test
    public void Will_Revert(){
        Helpers helpers = new Helpers();
        PageDroppable pageDroppable = new PageDroppable();
        helpers.getURL("https://demoqa.com/droppable");
        pageDroppable.click_section();
        String width = pageDroppable.postionInitialWrX();
        String height = pageDroppable.postionInitialWrY();
        System.out.println(width);
        pageDroppable.click_wr();
        Assert.assertTrue(pageDroppable.confirmation_wr(width,height),"Error");
    }

    /**TEST CASE 1**/
    @Test
    public void No_Revert(){
        Helpers helpers = new Helpers();
        PageDroppable pageDroppable = new PageDroppable();
        helpers.getURL("https://demoqa.com/droppable");
        pageDroppable.click_section();
        String width = pageDroppable.positionInitialNwX();
        String height = pageDroppable.positionInitialNrY();
        pageDroppable.click_not_revert();
        Assert.assertFalse(pageDroppable.confirmationNr(width, height), "Error");
    }
}
