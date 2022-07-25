package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebsiteAndDuePage;
import pages.NameCheckPage;

public class DataTablePageTest extends BaseTest {
    @Test
    public void nameCheckTest() {
        NameCheckPage nameCheckPage = new NameCheckPage(driver);
        nameCheckPage.openPage();
        nameCheckPage.findeFirstName();
        nameCheckPage.findeLastName();
        Assert.assertEquals(nameCheckPage.findeLastName(), "Bach", "There isn't this Last Name");
        Assert.assertEquals(nameCheckPage.findeFirstName(), "Frank", "There isn't this First Name");
    }

    @Test
    public void webSiteAndDueTest() {
        WebsiteAndDuePage websiteAndDuePage = new WebsiteAndDuePage(driver);
        websiteAndDuePage.openPage();
        websiteAndDuePage.findeDue();
        websiteAndDuePage.findeWebSite();
        Assert.assertEquals(websiteAndDuePage.findeDue(), "$51.00", "There isn't this text");
        Assert.assertEquals(websiteAndDuePage.findeWebSite(), "http://www.frank.com", "There isn't this email");
    }
}
