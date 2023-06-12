package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
    public class BasePage {
        protected WebDriver driver;
        private String baseUrl = "https://www.lambdatest.com/selenium-playground/";
        public BasePage() {
// Default constructor
        }
        public BasePage(WebDriver driver) {

            this.driver = driver;
        }
        @BeforeClass
        public void setUp() {
            System.setProperty("web-driver.chrome.driver",
                    "C:\\Users\\Ligia\\Desktop\\selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
        }
        @AfterMethod /*folosim @AfterMethod daca dorim sa
        inchidem browserul dupa fiecare test case in parte*/
        public void tearDown() {

            driver.quit();
        }

    }


