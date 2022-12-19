package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NumberPlatePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By headerTitle2 = By.id("page-title");

    private final By buttonService = By.cssSelector("[role='button']");

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getHeaderTitle(){
        return driver.findElement(headerTitle2).getText();
    }

    public void ClickButtonService(){
        driver.findElement(buttonService).click();
    }
}
