package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NameCheckPage extends BasePage {
    private By EMAIL=By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']");
    private By LAST_NAME= By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]");
    private By FIRST_NAME= By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]");


    public NameCheckPage(WebDriver driver) {
        super(driver);
    }
    public void openPage(){
        driver.get(Urls.DATA_TABLES_URL);
    }
    public String findeLastName(){
       return driver.findElement(LAST_NAME).getText();
    }
    public String findeFirstName(){
       return driver.findElement(FIRST_NAME).getText();
    }
}
