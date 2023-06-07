package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.BasePage;
import Pages.SimpleFormPage;
public class SimpleFormTestCases extends BasePage {
    private SimpleFormPage simpleFormPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }

    @Test
    public void writeTextThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test"));
    }

    @Test
    public void writeTextAndNumbersThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test123");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test123"));
    }

    @Test
    public void writeNumbersThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("123");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("123"));
    }

    @Test
    public void writeSpecialCharactersThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("!?.,");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("!?.,"));
    }

    @Test
    public void writeTextNumbersAndSpecialCharactersThenClickOnTheGetCheckedValueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test123!");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test123!"));
    }

    @Test
    public void enterPositiveNumberInBothFieldThenClickOnGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoInputFieldsEnterA("2");
        simpleFormPage.selectTwoInputFieldsEnterB("3");
        simpleFormPage.clickOnGetValuesButton();
        Assert.assertEquals(5, 5);
    }

    @Test
    public void enterPositiveSmallerThanNegativeNumberInFieldThenClickOnGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoInputFieldsEnterA("2");
        simpleFormPage.selectTwoInputFieldsEnterB("-3");
        simpleFormPage.clickOnGetValuesButton();
        Assert.assertEquals(-1, -1);
    }

    @Test
    public void enterPositiveBiggerThanNegativeNumberInFieldThenClickOnGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoInputFieldsEnterA("5");
        simpleFormPage.selectTwoInputFieldsEnterB("-3");
        simpleFormPage.clickOnGetValuesButton();
        Assert.assertEquals(2, 2);
    }

    @Test
    public void enterNegativeNumberInBothFieldThenClickOnGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoInputFieldsEnterA("-2");
        simpleFormPage.selectTwoInputFieldsEnterB("-3");
        simpleFormPage.clickOnGetValuesButton();
        Assert.assertEquals(-5, -5);
    }

    @Test
    public void enter0InBothFieldThenClickOnGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoInputFieldsEnterA("0");
        simpleFormPage.selectTwoInputFieldsEnterB("0");
        simpleFormPage.clickOnGetValuesButton();
        Assert.assertEquals(0, 0);
    }

    @Test
    public void enterPositiveNumberInAFieldThenClickOnGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoInputFieldsEnterA("2");
        simpleFormPage.selectTwoInputFieldsEnterB("0");
        simpleFormPage.clickOnGetValuesButton();
        Assert.assertEquals(2, 2);
    }

    @Test
    public void enterMaxIntInAFieldThenClickOnGetValuesButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTwoInputFieldsEnterA("2147483646");
        simpleFormPage.selectTwoInputFieldsEnterB("1");
        simpleFormPage.clickOnGetValuesButton();
        Assert.assertEquals(2147483647,2147483647);
    }

        @Test
        public void enterPositiveNumberInAFieldNothingInBThenClickOnGetValuesButton () throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
            simpleFormPage.selectTwoInputFieldsEnterA("2");
            simpleFormPage.clickOnGetValuesButton();
            Assert.assertTrue(driver.getPageSource().contains("NaN"));
        }
        @Test
        public void enterPositiveNumberInBFieldThenClickOnGetValuesButton () throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
            simpleFormPage.selectTwoInputFieldsEnterB("2");
            simpleFormPage.clickOnGetValuesButton();
            Assert.assertTrue(driver.getPageSource().contains("NaN"));
        }


    }
