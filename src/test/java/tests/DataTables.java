package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTables extends BaseTest {
    @Test
    public void nameCheckTest() {
        //Open url of page
        driver.get(Urls.DATA_TABLES_URL);
        //Add check
        driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']"));
        WebElement elementLastName = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]"));
        String lastNameActual = elementLastName.getText();
        WebElement elementFirstName = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]"));
        String firstNameActual = elementFirstName.getText();
        Assert.assertEquals("Bach", lastNameActual, "There isn't this Last Name");
        Assert.assertEquals("Frank", firstNameActual, "There isn't this First Name");
    }

    @Test
    public void emailAndDueTest() {
        //Open url of page
        driver.get(Urls.DATA_TABLES_URL);
        //Add check
        driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']"));
        WebElement elementDue=driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains (text(), '$')]"));
        String dueActual=elementDue.getText();
        WebElement elementEmail=driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains (text(), 'www')]"));
        String emailActual=elementEmail.getText();
        Assert.assertEquals("$51.00",dueActual,"There isn't this text");
        Assert.assertEquals("http://www.frank.com", emailActual, "There isn't this email");
    }
}
