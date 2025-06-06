package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
    WebDriver driver;
    public OffersPage(WebDriver driver){
        this.driver=driver;
    }
    //private By search=By.cssSelector("#search-field");
    By search=By.cssSelector("input[type='search']");
    private By productName=By.cssSelector("tr td:nth-child(1)");

    public void searchItem(String name){
        driver.findElement(search).sendKeys(name);

    }

    public String getProductName(){
        return driver.findElement(productName).getText();
    }
}
