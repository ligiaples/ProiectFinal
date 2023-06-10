package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class KeyPress extends BasePage{
    public KeyPress(WebDriver driver) {
        super(driver);
    }
    //locators from KeY Press page
    By Field = By.id("my_field");
    By Result = By.id("result");

    // //Method to  Key Press

    public void selectField(String arg1) {
        driver.findElement(Field).sendKeys(arg1);
    }

    public void selectResult() {driver.findElement(Result);}

    }

