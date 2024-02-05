package Helpers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class StartCloseBrowser {

    public static WebDriver driver;

    @BeforeClass

    public static void opennBrowser(){
         driver = BrowserFactory.openBrowser("chrome");
    }

    @AfterClass

    public static void closeBrowser(){
        BrowserFactory.closeBrowser();
    }

}
