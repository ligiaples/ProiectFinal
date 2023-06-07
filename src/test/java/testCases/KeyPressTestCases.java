package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManagerJsonOutput;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.BasePage;
import Pages.KeyPress;

public class KeyPressTestCases extends BasePage{
    private KeyPress keyPress;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        keyPress = new KeyPress(driver);
    }
    @Test
    public void writeLowercase() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[8]/a")).click();
        keyPress.selectField("t");
        Assert.assertEquals("t", "t");
    }
    @Test
    public void writeNumber() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[8]/a")).click();
        keyPress.selectField("6");
        Assert.assertEquals("6","6");
    }
    @Test
    public void writeNumberFromNumPad() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[8]/a")).click();
        keyPress.selectField("5");
        Assert.assertEquals("5", "NUMPAD5");
    }
    @Test
    public void writeSpecialCharacters() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[8]/a")).click();
        keyPress.selectField("/");
        String expectedResult = "/";
        String actualResult =String.valueOf(driver.findElement(By.id("result")));
        Assert.assertEquals(expectedResult,actualResult);
    }

}
