import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class AddToCartPage extends Base{
    public AddToCartPage() {
        PageFactory.initElements(Base.driver, this);
    }
    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement addToCartbtn;
    @FindBy(xpath = "//p[@class='content']")
    private WebElement addedtocartMsg;
    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
    private WebElement ShoppingCart;
    private WebElement mouseoverShoppingCartbtn(){
        WebElement goToCart=driver.findElement(By.xpath("//button[@class=\"button-1 cart-button\"]"));
        return goToCart;
    }
    @FindBy(xpath = "(//input[@type=\"text\"])[2]")
    private WebElement textQtyField;


    public void clickbtnCart(){
        addToCartbtn.click();
    }
    public String successMsg(){
        return addedtocartMsg.getText();
    }
    public WebElement mainshoppingcart(){
        ShoppingCart.click();
        return null;
    }
    public void mouseoverShoppingCart(){
        Actions actions =new Actions(driver);
//        actions.moveToElement(mainshoppingcart());
        actions.moveToElement(mouseoverShoppingCartbtn()).click();
//        actions.click().build().perform();
    }
    public int validatecartfield(){
        Random rnd=new Random();
        textQtyField.clear();
        int n= rnd.nextInt(20);
        return n;
    }

}
