package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarrickvillePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By headerTitle4 = By.id("page-title");

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getHeaderTitle(){
        return driver.findElement(headerTitle4).getText();
    }
}
