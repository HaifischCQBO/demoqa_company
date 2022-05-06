package Tests.Interactions;

import Helpers.Helpers;
import Pages.interactions.PageDroppableSimple;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseDroppableSimple {
    @Test
    public void Drag_Me(){
        Helpers helpers = new Helpers();
        PageDroppableSimple pageDroppableSimple = new PageDroppableSimple();
        helpers.getURL("https://demoqa.com/droppable");
        pageDroppableSimple.click_section();
        String width = pageDroppableSimple.postionInitialWrX();
        String height = pageDroppableSimple.postionInitialWrY();
        System.out.println(width);
        pageDroppableSimple.click_wr();
        Assert.assertTrue(pageDroppableSimple.confirmation_wr(width,height),"Error");
    }
}
