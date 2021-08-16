package utils;

import StepDefinitions.LoginFeatureStepDefinitions;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.PageInitialize;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class CommonMethod extends PageInitialize {

    /**
     * logs
     */


  public   static Logger logger= LogManager.getLogger(LoginFeatureStepDefinitions.class);







    /**
     * Method that sends text to any given element
     *
     * @param element
     * @param text
     */

    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);

    }

    /**
     * Method returns object of js executor type
     * @return
     */
    public static JavascriptExecutor getJSeXECUTOR(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        return js;
    }

    /**
     * Method perform click using Javascript executor
     * @param element
     */

    public static void JsClick(WebElement element){
       getJSeXECUTOR().executeScript("argument[0].click();",element);
    }


    public static void scrollUp(int pixel){
        getJSeXECUTOR().executeScript("window.scrollBy(0,-"+pixel+")");
    }

    public void scrollDown(int pixel){
        getJSeXECUTOR().executeScript("window.scrollBy(0,"+pixel+")");
    }

    /**
     * which wait
     * @return webdriver wait
     */
    public static WebDriverWait getWaitObject(){
        return  new WebDriverWait(driver,constants.EXPLICIT_WAIT);
    }


    public static void waitForClickability(WebElement element){
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));

    }
    public static void waitforVisibility(WebElement element){
        getWaitObject().until(ExpectedConditions.elementToBeSelected(element));
    }

    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

    /**
     * Take screenShot
     * @param fileName
     * @throws IOException
     */

    public static byte[] takeScreen(String fileName)  {
        TakesScreenshot ts =(TakesScreenshot) driver;
        byte[] bytes=ts.getScreenshotAs(OutputType.BYTES);

        File src=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src,new File(constants.SCREENSHOT_FILEPATH+fileName + LocalDateTime.now()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
