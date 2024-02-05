package PageObjectModelsTests;

import Helpers.BrowserFactory;
import Helpers.StartCloseBrowser;
import Helpers.Waits;
import PageObjectModels.PageOne;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestClass extends StartCloseBrowser {

    @Test

    public void test(){

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html?m=1");
        Waits.implicitWait(driver);

        PageOne pageone = new PageOne(driver);
        pageone.acceptCookies();

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

        pageone.uploadFile("C://Users//TeodoraEvtimova//Desktop//Wallpapers//1wallpaperflare.com_wallpaper.jpg");

    }

}

