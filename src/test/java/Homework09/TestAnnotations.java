package Homework09;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestAnnotations {
    private static WebDriver driver;

    @BeforeClass

    public static void openBrowser(){

        System.setProperty("webdriver.chrome.driver", "C://Program Files//Selenium jars and drivers//Drivers//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

         driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @org.junit.Test

    public void findElements() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html?m=1");
        Thread.sleep(1000);
        //accept cookies
        driver.findElement(By.xpath("//button[@id='ez-accept-necessary']")).click();

        //1
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Teddy");
        Assert.assertEquals("Teddy",firstName.getAttribute("value"));

        //2
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Evtimova");
        Assert.assertEquals("Evtimova",lastName.getAttribute("value"));

        //3
        WebElement gender = driver.findElement(By.id("sex-1"));
        gender.click();
        Assert.assertTrue(gender.isSelected());

        //scroll page down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,300)");

       //4
        WebElement exp = driver.findElement(By.xpath("//input[@id='exp-0']"));
        exp.click();
        Assert.assertTrue(exp.isSelected());

        //5
        WebElement date = driver.findElement(By.cssSelector("input#datepicker"));
        date.sendKeys("12/12/2020");
        Assert.assertEquals("12/12/2020",date.getAttribute("value"));

        //6
        WebElement profession = driver.findElement(By.id("profession-0"));
        profession.click();
        Assert.assertTrue(profession.isSelected());

        //7.
        List<WebElement> list = driver.findElements(By.xpath("//input[@name='tool']"));

        Actions act = new Actions(driver);

        act.keyDown(Keys.CONTROL)
                .click(list.get(0))
                .click(list.get(2))
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
        Assert.assertTrue(list.get(0).isSelected() && list.get(2).isSelected());

        //8
       WebElement cont = driver.findElement(By.cssSelector("#continents>:nth-child(1)"));
       cont.click();
       Assert.assertTrue(cont.isSelected());

        //9 Multiselect
        Select commands = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
        commands.selectByIndex(1);
        commands.selectByIndex(4);
       WebElement check1 = driver.findElement(By.xpath("//option[contains(text(),'Navigation Commands')]"));
       Assert.assertTrue(check1.isSelected());
        WebElement check2 = driver.findElement(By.xpath("//option[contains(text(),'WebElement Commands')]"));
        Assert.assertTrue(check2.isSelected());

        //10. file upload
        WebElement element = driver.findElement(By.id("photo"));
        element.sendKeys("C://Users//TeodoraEvtimova//Desktop//first name css selector.png");

    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }

}
