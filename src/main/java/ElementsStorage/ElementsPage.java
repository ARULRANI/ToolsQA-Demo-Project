package ElementsStorage;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ElementsPage {
    By TextBoxField = By.xpath("//span[text()='Text Box']");
    By fullNameField = By.xpath("//input[@id='userName']");
    By EmailField = By.xpath("//input[@id='userEmail']");
    By currentAddressField = By.xpath("//textarea[@placeholder='Current Address']");
    By submitButton = By.xpath("//button[contains(text(),'Submit')]");




}
