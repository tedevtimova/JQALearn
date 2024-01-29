package PageObjectModelsTests;

import Helpers.BrowserFactory;
import PageObjectModels.PageOne;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestClass extends BrowserFactory {

    @org.junit.Test

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = TestClass.openBrowser("chrome");
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html?m=1");
        Thread.sleep(1000);

        PageOne pageone = new PageOne(driver);
        pageone.acceptCookiies();

        pageone.enterFirstName("Teddy");
        Assert.assertEquals("Teddy",pageone.getNameValue());

        pageone.enterLastName("Evt");
        pageone.selectGender();
        Assert.assertTrue(pageone.genderIsSelected());

        pageone.selectExperience();
        Assert.assertTrue(pageone.expIsSelected());

        pageone.setDate("12/12/2020");
        Assert.assertEquals("12/12/2020",pageone.getDateValue());

        //scroll page down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,300)");

        pageone.selectProfession();
        Assert.assertTrue(pageone.profIsSelected());

        pageone.selectOptions();
        Assert.assertTrue(pageone.verifyAutomationCheckboxesOne());
        Assert.assertTrue(pageone.verifyAutomationCheckboxesTwo());

        pageone.selectContinent();

        pageone.selectCommands();
        Assert.assertTrue(pageone.verifyAutomationCheckboxesOne());
        Assert.assertTrue(pageone.verifyAutomationCheckboxesTwo());

        pageone.uploadFile("C://Users//TeodoraEvtimova//Desktop//first name css selector.png");

    }

}

