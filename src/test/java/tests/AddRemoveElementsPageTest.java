package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;

public class AddRemoveElementsPageTest extends BaseTest {

    @Test
    public void amountOfElements() {
        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);
        addRemoveElementsPage.openPage();
        addRemoveElementsPage.addElements();
        addRemoveElementsPage.addElements();
        addRemoveElementsPage.deleteElements();
        addRemoveElementsPage.amountOfElements();
        Assert.assertEquals(addRemoveElementsPage.amountOfElements(), 1, "AmountOfElements is incorrect");

    }

}
