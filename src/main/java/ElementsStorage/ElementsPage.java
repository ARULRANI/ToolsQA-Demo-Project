package ElementsStorage;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ElementsPage {
    //***Text Box ***//

    By TextBoxField = By.xpath("//span[text()='Text Box']");
    By fullNameField = By.xpath("//input[@id='userName']");
    By EmailField = By.xpath("//input[@id='userEmail']");
    By currentAddressField = By.xpath("//textarea[@placeholder='Current Address']");
    By submitButton = By.xpath("//button[contains(text(),'Submit')]");

    //***Check Box ***//
    By checkBox = By.xpath("//li[@id='item-1']//span[contains(text(),'Check Box')]");
    By selectCheckBox = By.xpath("//span[@class='rc-tree-checkbox']");





}
