package Helpers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver openBrowser(String browsername){

     if(browsername.equalsIgnoreCase("chrome")){
         System.setProperty("webdriver.chrome.driver", "C://Program Files//Selenium jars and drivers//Drivers//chromedriver.exe");
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");

         driver = new ChromeDriver(options);
     }
    else if(browsername.equalsIgnoreCase("firefox")){
         System.setProperty("webdriver.gecko.driver", "C://Program Files//Selenium jars and drivers//Drivers//geckodriver.exe");
         FirefoxOptions firefoxOptions = new FirefoxOptions();
         firefoxOptions.setCapability("marionette", true);
         driver = new FirefoxDriver(firefoxOptions);
     }
    else if(browsername.equalsIgnoreCase("edge")){
        System.setProperty("webdriver.edge.driver","C://Program Files//Selenium jars and drivers//Drivers//msedgedriver.exe");
        driver = new EdgeDriver();
     }
     driver.manage().window().maximize();
    return driver;

 }
    public static void closeBrowser(){
    driver.close();
    }

}


