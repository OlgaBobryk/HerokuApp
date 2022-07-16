package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Elements extends BaseTest {

    @Test
    public void amountOfElements() {
        //Open url of  page
        driver.get(Urls.ADD_REMOVE_ELEMENTS_URL);
        //Add elements
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        //Delete an element
        driver.findElement(By.xpath("//button[@class='added-manually']")).click();
        //Add check
        int amount = driver.findElements(By.xpath("//button[@class='added-manually']")).size();
        Assert.assertEquals(1, amount, "AmountOfElements is incorrect");

    }

}
