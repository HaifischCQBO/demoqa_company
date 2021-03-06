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
    public By range = By.xpath("//*[@id='sliderContainer']");
    public By rangeCircle = By.xpath("//div[@class='range-slider__tooltip range-slider__tooltip--auto range-slider__tooltip--bottom']");

    public By rangeInput = By.xpath("//*[@id='sliderValue']");



    /**Functions
     *
     * */

    public void click_slider(){
        helpers.scrollDown(500);
        helpers.clickElement(slider_select);
    }

    public void slider(){
        helpers.clickElement(range);
        Actions actions = new Actions(driver);

        WebElement element01 = driver.findElement(rangeCircle);

        actions.dragAndDropBy(element01, 10, 0);
    }

    public String valor(){
        return helpers.getValue(rangeInput);
    }

}

