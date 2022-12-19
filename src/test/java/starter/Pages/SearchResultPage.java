package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By headerTitle = By.id("page-title");

    private final By firstLink = By.linkText("Apply to collect number plates from another service centre");

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getHeaderTitle(){
        return driver.findElement(headerTitle).getText();
    }

    public void ClickFirstLink(){
        driver.findElement(firstLink).click();
    }


}
