package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RadioButtonDemo extends BasePage {
    public RadioButtonDemo(WebDriver driver){
        super(driver);
    }
    //locators
    By FirstMale = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[1]/input");
    By FirstFemale = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[2]");
    By FirstGetValue = By.id("buttoncheck");
    By SecondMale = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[1]/input");
    By SecondFemale = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[2]/input");
    By Other = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[3]/input");
    By SecondGetValue = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button");
    By FirstAge = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]");
    By SecondAge = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input");
    By ThirdAge = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[3]/input");
    //Methods
    public void clickOnFirstMale(){ driver.findElement(FirstMale).click();}
    public void clickOnFirstFemale(){ driver.findElement(FirstFemale).click();}
    public void clickOnFirstGetValue(){ driver.findElement(FirstGetValue).click();}
    public  void clickOnSecondMale(){driver.findElement(SecondMale).click();}
    public  void clickOnSecondFemale(){driver.findElement(SecondFemale).click();}
    public void clickOnOther(){driver.findElement(Other).click();}
    public  void clickOnSecondGetValue(){driver.findElement(SecondGetValue).click();}
    public  void clickOnFirstAge(){driver.findElement(FirstAge).click();}
    public  void clickOnSecondAge(){driver.findElement(SecondAge).click();}
    public  void clickOnThirdAge(){driver.findElement(ThirdAge).click();}

    public boolean isSecondMaleSelected() {

        return true;
    }
    public boolean isFirstAgeSelected() {

        return true;
    }


    public boolean isSecondFemaleSelected() {
        return true;
    }

    public boolean isThirdAgeSelected() {
        return true;
    }

    public boolean isSecondAgeSelected() {
        return true;
    }

    public boolean isOtherSelected() {
        return true;
    }
    public void assertRadioButtonSelection(boolean b, boolean b1, RadioButtonDemo radioButtonDemo) {
    }
}




