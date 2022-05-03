package TestFrame;

import Helpers.Driver;
import interfaces.Constants;

public class TestCaseTwo {
    public static void main(String[] args) throws InterruptedException {

        Driver myDriver = new Driver();

        myDriver.loadSite("https://demoqa.com/nestedframes");

        myDriver.changeBodyColor(Constants.bodyId, "red" );

        Thread.sleep(1000);

        myDriver.changeBodyColor(Constants.bodyId, "blue" );

        myDriver.clickUsingJs("document.getElementsByClassName('card mt-4 top-card')[2].click()");

        myDriver.clickUsingJs("document.getElementsByClassName(\"element-group\")[2].querySelector(\".menu-list\").getElementsByClassName(\"btn btn-light\")[3].click()");

        Thread.sleep(2000);


    }
}
