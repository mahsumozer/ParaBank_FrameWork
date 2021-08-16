package testbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ConfigsReader;
import utils.constants;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static  WebDriver driver;

        public static void setUp() {
            ConfigsReader.readProperties(constants.CONFIGURATION_FILEPATH);

           switch (ConfigsReader.getPropertiesValue("browser")){
               case"chrome":
                  WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;

               case"firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver=new ChromeDriver();
                   break;


               default:
                   System.out.println("There is an issue");
           }
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
           driver.get(ConfigsReader.getPropertiesValue("url"));

           PageInitialize.initializePageObjects();
        }


        public static void teardown(){
        if (driver!=null){
           driver.quit();
        }
    }
}
