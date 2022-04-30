package Pages.Widgets;


import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_Slider {
    public WebDriver driver;
    public Helpers helpers;

    public Page_Slider(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**Web elements
     *
     * */


    public By slider_select = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[4]");
    public By range = By.xpath("//*[@id=\"sliderContainer\"]");





    /**Functions
     *
     * */

    public void click_slider(){
        helpers.scrollDown(500);
        helpers.clickBy(slider_select);
    }

    public void slider(){
        helpers.clickBy(range);
        Actions actions = new Actions(driver);

        WebElement element01 = driver.findElement(By.xpath("//input[@value='30']"));
        WebElement element02 = driver.findElement(By.xpath("//input[@value='50']"));

        actions.dragAndDrop(element02, element01);
    }

}

