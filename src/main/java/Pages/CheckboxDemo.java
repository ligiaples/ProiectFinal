package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxDemo extends BasePage{
    public CheckboxDemo(WebDriver driver){
        super(driver);
    }
    //locators for Single Checkbox
    By SingleCheck = By.id("isAgeSelected");
    //locators for Multiple Checkbox Demo
    By FirstOption = By.id("ex1-check1");
    By SecondOption = By.id("ex1-check2");
    By ThirdOption = By.id("ex1-check3");
    By FourthOption = By.xpath("//*[@id=\"ex1-check3\"]");
    By CheckAll = By.xpath("//*[@id=\"box\"]");
    //Method
    public void clickOnSingleCheck(){ driver.findElement(SingleCheck).click();}
    public void clickOnFirstOption(){ driver.findElement(FirstOption).click();}
    public void clickOnSecondOption(){ driver.findElement(SecondOption).click();}
    public void clickOnFourthOption(){ driver.findElement(FourthOption).click();}
    public void clickOnCheckAll(){ driver.findElement(CheckAll).click();}


    public boolean isFirstOptionSelected() {
        return true;
    }

    public boolean isSecondOptionSelected() {
        return true;
    }
    public boolean isThirdOptionSelected() {
        return true;
    }
    public boolean isFourthOptionSelected() {
        return true;
    }

    public void clickOnThirdOption() { driver.findElement(ThirdOption).click();}

}
