package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebsiteAndDuePage extends BasePage{
    private By EMAIL=By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']");
    private By DUE=By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains (text(), '$')]");
    private By WEB_SITE = By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains (text(), 'www')]");


    public WebsiteAndDuePage(WebDriver driver) {
        super(driver);
    }
    public void openPage(){
        driver.get(Urls.DATA_TABLES_URL);
    }
    public String findeDue(){
        return driver.findElement(DUE).getText();
    }
    public String findeWebSite(){
        return driver.findElement(WEB_SITE).getText();
    }
}
