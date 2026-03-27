package DemoPkg;

import ElementsStorage.ElementsPage;
import ElementsStorage.HomePage;
import UtilityPkg.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
    private static final Logger log = LogManager.getLogger(HomePageTest.class);
    WebDriver driver;
    HomePage homePageTest = new HomePage();
    ElementsPage elementsPage = new ElementsPage();
    ConfigReader configReader = new ConfigReader();

    @BeforeClass
    public void SetUp(){
        driver  = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        log.info("Browser Successfully launched");
    }

    @Test
    public void elementsModule(){
        driver.findElement(homePageTest.getElementsModules()).click();
        driver.findElement(elementsPage.getTextBoxField()).click();
        driver.findElement(elementsPage.getFullNameField()).sendKeys(configReader.ConfigReader("fullName"));
        driver.findElement(elementsPage.getEmailField()).sendKeys(configReader.ConfigReader("email"));
        driver.findElement(elementsPage.getCurrentAddressField()).sendKeys(configReader.ConfigReader("currentAddress"));
        driver.findElement(elementsPage.getSubmitButton()).click();
        log.info("ElementsModule Successfully verified");
    }

    @Test
    public void textBoxModule(){
        driver.findElement(homePageTest.getElementsModules()).click();
        driver.findElement(elementsPage.getCheckBox()).click();
        driver.findElement(elementsPage.getSelectCheckBox()).click();
    }



}
