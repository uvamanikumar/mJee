import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends Base {
    TopMenu topMenu;
    Utility utility;

    public TopMenuTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        topMenu = new TopMenu();
        utility = new Utility();
    }

    @AfterMethod
    public void tearDown() {

        driver.close();
    }

    @Test
    public void menufunctionality1() throws InterruptedException {
        utility.CheckRegBtn();
        topMenu.computer();
        Assert.assertTrue(driver.getCurrentUrl().contains("computers"));
    }

    @Test
    public void menufunctionality2() throws InterruptedException {
        utility.CheckRegBtn();
        topMenu.jewelry();
        Assert.assertTrue(driver.getCurrentUrl().contains("jewelry"));
    }
    @Test
    public void mouseoverNotebook() throws InterruptedException{
        utility.CheckRegBtn();
        topMenu.computer();
        topMenu.mouseoverNotebook();
        Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));

    }
    @Test
    public void mouseoverAccessories() throws InterruptedException{
        utility.CheckRegBtn();
        topMenu.menuApparel();
        topMenu.mouseoverAccessories();
        Assert.assertTrue(driver.getCurrentUrl().contains("accessories"));

    }
    @Test
    public void topmenuCompDesktop() throws InterruptedException{
        utility.CheckRegBtn();
        topMenu.computer();
        topMenu.ComputerDesktop();
        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"));
        Thread.sleep(2000);
        topMenu.desktopProduct();
        Assert.assertTrue(topMenu.prodNameTitle().contains("Lenovo IdeaCentre 600 All-in-One PC"));
    }

}
