package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddRemoveElementsPage extends BasePage {
    private By ADD_ELEMENT_BUTTON = By.xpath("//button[text()='Add Element']");
    private By DELETE_BUTTON = By.xpath("//button[@class='added-manually']");

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Urls.ADD_REMOVE_ELEMENTS_URL);
    }

    public void addElements() {
        driver.findElement(ADD_ELEMENT_BUTTON).click();
    }

    public void deleteElements() {
        driver.findElement(DELETE_BUTTON).click();
    }

    public int amountOfElements() {
        int amount = driver.findElements(DELETE_BUTTON).size();
        return amount;
    }
}
