package ElementsStorage;

import lombok.Data;
import org.openqa.selenium.By;
@Data
public class HomePage {

    By ElementsModules = By.xpath("//a[@href='/elements']");
    By FormsModules = By.xpath("//a[@href='/forms']");
    By AlertsModules = By.xpath("//h5[contains(text(),'Alerts')]");
    By WidgetsModules = By.xpath("//h5[contains(text(),'Widgets')]");
    By interActionsModules = By.xpath("//h5[contains(text(),'Interactions')]");
    By BookStoreModules = By.xpath("//h5[contains(text(),'Book Store')]");
}
