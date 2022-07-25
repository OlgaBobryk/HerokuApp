package pages;

import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }
}
