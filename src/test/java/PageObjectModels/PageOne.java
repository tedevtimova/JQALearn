package PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PageOne {

    WebDriver driver;

    public PageOne(WebDriver driver){
        this.driver = driver;
    }
    //accept cookies
       By acceptcookies = By.xpath("//button[@id='ez-accept-necessary']");
    public void acceptCookiies(){
        driver.findElement(acceptcookies).click();
    }
    //find first name
    By firstname = By.name("firstname");
    public void enterFirstName(String fname){
        driver.findElement(firstname).sendKeys(fname);
    }
    //get text entered in First name field
    public String getNameValue(){
         String nametext = driver.findElement(firstname).getAttribute("value");
         return nametext;
    }
    //find last name
    By lastname = By.name("lastname");
    public void enterLastName(String lname){
      driver.findElement(lastname).sendKeys(lname);
    }
    //select gender
    By gender = By.id("sex-1");
     public void selectGender(){
         driver.findElement(gender).click();
     }
     //verify if gender is selected
    public Boolean genderIsSelected(){
         Boolean gens = driver.findElement(gender).isSelected();
         return gens;
    }
     //select experience
    By exp = By.xpath("//input[@id='exp-0']");
     public void selectExperience(){
         driver.findElement(exp).click();
    }
    //verify if experience is selected
    public Boolean expIsSelected(){
     Boolean expstatus = driver.findElement(exp).isSelected();
     return expstatus;
    }

    //select date
    By datecheck = By.cssSelector("input#datepicker");
     public void setDate(String date){
         driver.findElement(datecheck).sendKeys(date);
     }

    //get text entered in Date field
    public String getDateValue(){
        String datetext = driver.findElement(datecheck).getAttribute("value");
        return datetext;
    }

     //select profession
    By profession = By.id("profession-0");
    public void selectProfession(){
        driver.findElement(profession).click();
    }
    //verify if profession is selected
    public Boolean profIsSelected(){
        Boolean profstatus = driver.findElement(profession).isSelected();
        return profstatus;
    }
    //select two Automation tools
    By list = By.xpath("//input[@name='tool']");

    public void selectOptions(){
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL)
                .click(driver.findElements(list).get(0))
                .click(driver.findElements(list).get(2))
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
    }
   //Verify if automation checkboxes are selected
    public boolean verifyAutomationCheckboxesOne(){
        Boolean checkone = driver.findElements(list).get(0).isSelected();
        return checkone;
    }

    public boolean verifyAutomationCheckboxesTwo(){
        Boolean checktwo = driver.findElements(list).get(0).isSelected();
        return checktwo;
    }

    //select continents
    By cont = By.cssSelector("#continents>:nth-child(1)");
    public void selectContinent(){
        driver.findElement(cont).click();
    }

    //Multiselect for select commands
 By element = By.xpath("//select[@id='selenium_commands']");
    public void selectCommands(){
        Select commands = new Select(driver.findElement(element));
        commands.selectByIndex(1);
        commands.selectByIndex(4);
    }

    //verify if select commands options are selected
    By selectone = By.xpath("//option[contains(text(),'Navigation Commands')]");
    public Boolean itemOneSelected(){
        Boolean itemone = driver.findElement(selectone).isSelected();
        return itemone;
    }

    By selecttwo = By.xpath("//option[contains(text(),'WebElement Commands')]");
    public Boolean itemTwoSelected(){
        Boolean itemtwo = driver.findElement(selecttwo).isSelected();
        return itemtwo;
    }

    //Upload file
    By upload = By.id("photo");
    public void uploadFile(String address){
        driver.findElement(upload).sendKeys(address);
    }

}
