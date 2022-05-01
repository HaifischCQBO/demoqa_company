package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;

public class Driver {

    public WebDriver webDriver;

    public Driver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();
        System.out.println("MAXIMIZE OK");
    }

    /**
     * cargar la pagina
     */
    public void loadSite(String siteUrl){
        webDriver.get(siteUrl);
    }

    /**
     * Validar titulo del sitio
     */
    public boolean validateSiteTitle(String siteUrl){
        String title = webDriver.getTitle();
        return Objects.equals(title, siteUrl);
    }

    /**
     * Cambiar el color del body(extra)
     */
    public void changeBodyColor(String BodyId, String color){
        ((JavascriptExecutor) webDriver).executeScript("" +
                "document.getElementById(" +
                "'"+ BodyId+ "" +
                "').style.backgroundColor = '"+ color+"';"
        );
    }

    /**
     * Click usando JS
     */

    public void clickUsingJs(String jsCommand){
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript(jsCommand);
    }

    /**
     * Validando titulo de iframe
     */
    public void validateIframeTitle(){
        var element = webDriver.switchTo().frame(webDriver.findElement(By.id("frame1")));
        var element2 = element.findElement(By.id("sampleHeading"));
        System.out.println("El titulo es: " + element2.getText());
    }

}