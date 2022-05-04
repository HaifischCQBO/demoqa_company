package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_upload_and_download {

    public WebDriver driver;
    public Helpers helpers;

    public Page_upload_and_download(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    private final By uploadAndDownload = By.xpath("//ul[@class='menu-list']//*[@id='item-7']");
    private final By download = By.xpath("//*[@id='downloadButton']");
    private final By upload = By.xpath(".//input[@type='file']");
    private final By filePath = By.xpath("//*[@id='uploadedFilePath']");

    public void clickUploadAndDownload(){
        WebElement uploadAndDownloadElement = driver.findElement(uploadAndDownload);
        helpers.clickElement(uploadAndDownloadElement);
    }
    public WebElement clickDownload(){
        WebElement downloadElement = driver.findElement(download);
        helpers.clickElement(downloadElement);
        return downloadElement;
    }

    public void clickUpload(){
        WebElement seleccionarArchivo = driver.findElement(upload);
        helpers.SendText(upload, "Documentation/test_image.jpg");
        helpers.clickElement(seleccionarArchivo);
    }

    public String filePathUploaded(){
        return helpers.getText(filePath);
    }
}
