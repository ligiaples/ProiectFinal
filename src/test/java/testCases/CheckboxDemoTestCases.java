package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.BasePage;
import Pages.CheckboxDemo;

public class CheckboxDemoTestCases extends BasePage {
    private CheckboxDemo checkboxDemo;

    @BeforeMethod

    public void setUp() {
        super.setUp();
        checkboxDemo = new CheckboxDemo(driver);
    }
    @Test
    public void SingleCheckbox() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxDemo.clickOnSingleCheck();
       Assert.assertEquals("Checked","Checked");
    }
    @Test
    public void TestFirstOptionFromMultipleCheckboxDemoIsSelected() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxDemo.clickOnFirstOption();
        Assert.assertTrue(checkboxDemo.isFirstOptionSelected());
    }
    @Test
    public void TestSecondOptionFromMultipleCheckboxDemoIsSelected() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxDemo.clickOnSecondOption();
        Assert.assertTrue(checkboxDemo.isSecondOptionSelected());
    }
    @Test
    public void TestThirdOptionFromMultipleCheckboxDemoIsSelected() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxDemo.clickOnThirdOption();
        Assert.assertTrue(checkboxDemo.isThirdOptionSelected());
    }
    @Test
    public void TestFourthOptionFromMultipleCheckboxDemoIsSelected() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxDemo.clickOnFourthOption();
        Assert.assertTrue(checkboxDemo.isFourthOptionSelected());
    }
    @Test
    public void AllOptionFromMultipleCheckboxDemoAreSelected() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxDemo.clickOnCheckAll();
        WebElement button = driver.findElement(By.id("box"));
        String buttonValue = button.getAttribute("value");
        Assert.assertEquals(buttonValue, "uncheck all", "Button value does not match expected value");

    }


}

