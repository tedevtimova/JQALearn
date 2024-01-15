import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;


public class FirstTestCase {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Program Files//Selenium jars and drivers//Drivers//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //1. Open this link - https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html?m=1");
        //wait till accept cookies is visible
        Thread.sleep(1000);
        //accept cookies
        driver.findElement(By.xpath("//button[@id='ez-accept-necessary']")).click();
        //2. Enter first and last name (textbox).
        driver.findElement(By.name("firstname")).sendKeys("Teddy");
        driver.findElement(By.name("lastname")).sendKeys("Evtimova");
        //3. Select gender (radio button).
        driver.findElement(By.id("sex-1")).click();
        //scroll page down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,300)");
        //4. Select years of experience (radio button).
        driver.findElement(By.xpath("//input[@id='exp-0']")).click();
        //5. Enter date.
        driver.findElement(By.cssSelector("input#datepicker")).sendKeys("12/12/2020");
        //6. Select Profession (Checkbox).
        driver.findElement(By.id("profession-0")).click();
        //7. Select Automation tools you are familiar with (multiple checkboxes).
        List<WebElement> list = driver.findElements(By.xpath("//input[@name='tool']"));

        Actions act = new Actions(driver);

            act.keyDown(Keys.CONTROL)
                    .click(list.get(0))
                    .click(list.get(2))
                    .keyUp(Keys.CONTROL)
                    .build()
                    .perform();

        //8. Select Continent (Select box).
        driver.findElement(By.cssSelector("#continents>:nth-child(1)")).click();
        //9. Select multiple commands from a multi-select box.
        Select commands = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
        commands.selectByIndex(1);
        commands.selectByIndex(4);

        //10. file upload using sendKeys
        driver.findElement(By.id("photo")).sendKeys("C://Users//TeodoraEvtimova//Desktop//first name css selector.png");
    }
}

