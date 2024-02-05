package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {

    public static void implicitWait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static WebDriverWait getExplicitWait(WebDriver driver){
        return new WebDriverWait(driver,4);
        
    }
}
