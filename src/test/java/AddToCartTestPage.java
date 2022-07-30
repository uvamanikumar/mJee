import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTestPage extends Base{
    AddToCartPage addToCartPage;
    Utility utility;
    TopMenu topMenu;
    public AddToCartTestPage(){
        super();
    }
    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        topMenu = new TopMenu();
        utility = new Utility();
        addToCartPage=new AddToCartPage();
    }
//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//    }
    @Test
    public void checkaddtocart()throws InterruptedException{
        utility.CheckRegBtn();
        topMenu.computer();
        topMenu.ComputerDesktop();
        topMenu.desktopProduct();
        addToCartPage.clickbtnCart();
        Thread.sleep(2000);
        Assert.assertEquals(addToCartPage.successMsg(),"The product has been added to your shopping cart");
        Thread.sleep(3000);
        addToCartPage.mainshoppingcart();
        addToCartPage.mouseoverShoppingCart();
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
        addToCartPage.validatecartfield();

    }
}
