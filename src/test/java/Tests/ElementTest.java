package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Page_index;
import Pages.Page_upload_and_download;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementTest extends BaseClass {

    @Test
    public void casoDePruebaBotonDownload() {
        Helpers helpers = new Helpers(driver);
        String url  = helpers.getXMLParameter("url");
        // 1. Ingresar al enlace "https://demoqa.com/"
        helpers.getURL(url);

        // 2. Dar click en la sección "Elements".
        Page_index page_index = new Page_index(driver);
        page_index.clickElements();

        // 3. Dar click en el apartado "Upload and Download"
        Page_upload_and_download page_upload_and_download =
                new Page_upload_and_download(driver);
        page_upload_and_download.clickUploadAndDownload();

        // 4. Dar click "Download"
        WebElement downloadElement = page_upload_and_download.clickDownload();
        helpers.Pause(2);

        Assert.assertEquals(downloadElement.getAttribute("id"), "downloadButton");
        Assert.assertEquals(downloadElement.getText() , "Download");
    }

    @Test
    public void casoDePruebaBotonUpload() {
        Helpers helpers = new Helpers(driver);
        String url  = helpers.getXMLParameter("url");
        // 1. Ingresar al enlace "https://demoqa.com/"
        helpers.getURL(url);

        //2. Dar click en la sección "Elements".
        Page_index page_index = new Page_index(driver);
        page_index.clickElements();

        //3.Dar click en el apartado "Upload and Download"
        Page_upload_and_download page_upload_and_download =
            new Page_upload_and_download(driver);
        page_upload_and_download.clickUploadAndDownload();

        //4.Dar click "Seleccionar archivo"
        page_upload_and_download.clickUpload();
        helpers.Pause(2);

        String filePath = page_upload_and_download.filePathUploaded();
        Assert.assertNotNull(filePath);
        Assert.assertTrue(filePath.contains("Button Download.txt"));
    }
}
