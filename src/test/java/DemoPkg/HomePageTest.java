package DemoPkg;

import ElementsStorage.ElementsPage;
import ElementsStorage.HomePage;
import UtilityPkg.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
    WebDriver driver;
    HomePage homePageTest = new HomePage();
    ElementsPage elementsPage = new ElementsPage();
    ConfigReader configReader = new ConfigReader();

    @BeforeClass
    public void SetUp(){
        driver  = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void elementsModule(){
        driver.findElement(homePageTest.getElementsModules()).click();
        driver.findElement(elementsPage.getTextBoxField()).click();
        driver.findElement(elementsPage.getFullNameField()).sendKeys(configReader.ConfigReader("fullName"));
        driver.findElement(elementsPage.getEmailField()).sendKeys(configReader.ConfigReader("email"));
        driver.findElement(elementsPage.getCurrentAddressField()).sendKeys(configReader.ConfigReader("currentAddress"));
        driver.findElement(elementsPage.getSubmitButton()).click();
    }

    @Test
    public void textBoxModule(){
        driver.findElement(homePageTest.getElementsModules()).click();
        driver.findElement(elementsPage.getCheckBox()).click();
        driver.findElement(elementsPage.getSelectCheckBox()).click();
    }



}
