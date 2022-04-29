package pages;

public class Page_Elements {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Index(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By Broken_Button = By.xpath("//*[@id='item-6']/span");
    private By Text_Box_Button = By.xpath("//*[@id='item-0']/span");



    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_Broken_Links(){
        helpers.clickBy(Broken_Button);
    }



    public void click_text_box(){
        helpers.clickBy(Text_Box_Button);
    }


}
