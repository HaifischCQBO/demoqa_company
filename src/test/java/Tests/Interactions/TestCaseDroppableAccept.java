package Tests.Interactions;

import Helpers.Helpers;
import Pages.interactions.PageDroppableAccept;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseDroppableAccept {
    @Test
    public void Acceptable(){
        Helpers helpers = new Helpers();
        PageDroppableAccept pageDroppableAccept = new PageDroppableAccept();
        helpers.getURL("https://demoqa.com/droppable");
        pageDroppableAccept.click_section();
        String width = pageDroppableAccept.postionInitialWrX();
        String height = pageDroppableAccept.postionInitialWrY();
        System.out.println(width);
        pageDroppableAccept.click_wr();
        Assert.assertTrue(pageDroppableAccept.confirmation_wr(width,height),"Error");
    }
    @Test
    public void Not_Acceptable(){
        Helpers helpers = new Helpers();
        PageDroppableAccept pageDroppableAccept = new PageDroppableAccept();
        helpers.getURL("https://demoqa.com/droppable");
        pageDroppableAccept.click_section();
        String width = pageDroppableAccept.positionInitialNwX();
        String height = pageDroppableAccept.positionInitialNrY();
        pageDroppableAccept.click_not_Acceptable();
        Assert.assertFalse(pageDroppableAccept.confirmationNr(width, height), "Error");
    }
}
