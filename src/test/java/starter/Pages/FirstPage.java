package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@DefaultUrl("https://www.service.nsw.gov.au")
public class FirstPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By searchField = By.cssSelector("[data-personalisation-type='default'] input");

    private final By buttonSearch = By.cssSelector("[data-personalisation-type='default'] [type='submit']");


    public void InputSearch(String numberplate){
        driver.findElement(searchField).sendKeys(numberplate);
    }

    public void ClickButtonSearch(){
        driver.findElement(buttonSearch).click();
    }












}
