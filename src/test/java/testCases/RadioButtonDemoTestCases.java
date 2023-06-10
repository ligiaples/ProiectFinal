package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.BasePage;
import Pages.RadioButtonDemo;


public class RadioButtonDemoTestCases extends BasePage {
    private RadioButtonDemo radioButtonDemo;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonDemo = new RadioButtonDemo(driver);
    }
    @Test
    public void VerifyOfSelectMaleButton() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnFirstMale();
        radioButtonDemo.clickOnFirstGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Male' is checked"));
    }
    @Test
    public void VerifyOfSelectFemaleButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnFirstFemale();
        radioButtonDemo.clickOnFirstGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Female' is checked"));
    }
    @Test
    public void VerifyOfSelectSecondMaleButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondMale();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Male"));
    }
    @Test
    public void VerifyOfSelectSecondFemaleButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondFemale();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Female"));
    }
    @Test
    public void VerifyOfSelectOtherButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnOther();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Other"));
    }
    @Test
    public void VerifyOfSelectFirstAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnFirstAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("0-5"));
    }
    @Test
    public void VerifyOfSelectSecondAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("5 - 15"));
    }
    @Test
    public void VerifyOfSelectThirdAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnThirdAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("15 - 50"));
    }
    @Test
    public void VerifyOfSelectSecondMaleAndFirstAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondMale();
        radioButtonDemo.clickOnFirstAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isSecondMaleSelected());
        Assert.assertTrue(radioButtonDemo.isFirstAgeSelected());
    }
    @Test
    public void VerifyOfSelectSecondMaleAndSecondAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondMale();
        radioButtonDemo.clickOnSecondAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isSecondMaleSelected());
        Assert.assertTrue(radioButtonDemo.isSecondAgeSelected());
    }
    @Test
    public void VerifyOfSelectSecondMaleAndThirdAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondMale();
        radioButtonDemo.clickOnThirdAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isSecondMaleSelected());
        Assert.assertTrue(radioButtonDemo.isThirdAgeSelected());
    }
    @Test
    public void VerifyOfSelectSecondFemaleAndFirstAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondFemale();
        radioButtonDemo.clickOnFirstAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isSecondFemaleSelected());
        Assert.assertTrue(radioButtonDemo.isFirstAgeSelected());
    }
    @Test
    public void VerifyOfSelectSecondFemaleAndSecondAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondFemale();
        radioButtonDemo.clickOnSecondAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isSecondFemaleSelected());
        Assert.assertTrue(radioButtonDemo.isSecondAgeSelected());
    }
    @Test
    public void VerifyOfSelectSecondFemaleAndThirdAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondFemale();
        radioButtonDemo.clickOnThirdAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isSecondFemaleSelected());
        Assert.assertTrue(radioButtonDemo.isThirdAgeSelected());
    }
    @Test
    public void VerifyOfSelectOtherAndFirstAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnOther();
        radioButtonDemo.clickOnFirstAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isOtherSelected());
        Assert.assertTrue(radioButtonDemo.isFirstAgeSelected());
    }
    @Test
    public void VerifyOfSelectOtherAndSecondAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnOther();
        radioButtonDemo.clickOnSecondAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isOtherSelected());
        Assert.assertTrue(radioButtonDemo.isSecondAgeSelected());
    }
    @Test
    public void VerifyOfSelectOtherAndThirdAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnOther();
        radioButtonDemo.clickOnThirdAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isOtherSelected());
        Assert.assertTrue(radioButtonDemo.isThirdAgeSelected());
    }



    }
