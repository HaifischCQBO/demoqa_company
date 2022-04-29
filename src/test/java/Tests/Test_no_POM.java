package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

 public class Test_no_POM {

     public WebDriver driver;

     // Test nos ayuda a correr esta prueba mediante una anotatios de testNG
     @Test
     public void PrimeraPrueba() {

         //Inicializar nuestro navegador

         WebDriverManager.chromedriver().setup();
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--disable-gpu");
         driver = new ChromeDriver(options);

         // Ir a determinada pagina
         driver.get("https://demoqa.com/");
     }
 }


