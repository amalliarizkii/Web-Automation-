package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServiceCentrePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By headerTitle3 = By.id("page-title");

    private final By searchService = By.id("locatorTextSearch");

    private final By buttonSearchService = By.cssSelector(".button.button--primary.button--xxlarge");

    private final By marrickvilleService = By.linkText("Marrickville Service Centre");

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getHeaderTitle(){
        return driver.findElement(headerTitle3).getText();
    }

    public void ClickSearchField(){
        driver.findElement(searchService).click();
    }

    public void InputKeyword(String keyword){
        driver.findElement(searchService).sendKeys(keyword);
    }

    public void ClickButtonSearchService(){
        driver.findElement(buttonSearchService).click();
    }

    public void ClickMarrickVilleService(){
        driver.findElement(marrickvilleService).click();
    }


}
