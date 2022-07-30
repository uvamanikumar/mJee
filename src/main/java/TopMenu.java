import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu extends Base{
    public TopMenu() {

        PageFactory.initElements(Base.driver, this);
    }
    private WebElement mainmenucomputer() {
        WebElement computer=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
        return computer;
    }
    @FindBy(xpath = "(//a[@href=\"/jewelry\"])[1]")
    private WebElement MenuJewelry;

    private WebElement computersMouseoverNotebook() {
        WebElement notebook=driver.findElement(By.xpath("(//a[@href=\"/notebooks\"])[1]"));
        return notebook;
    }

   @FindBy(xpath = "(//a[@href=\"/apparel\"])[1]")
    private WebElement mainmenuApparel;

    private WebElement apparelmouseoveraccessories() {
        WebElement accessories=driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"));
        return accessories;
    }
    @FindBy(xpath = "//img[@title=\"Show products in category Desktops\"]")
    private WebElement Desktop;
    @FindBy(xpath = "//img[@title=\"Show details for Lenovo IdeaCentre 600 All-in-One PC\"]")
    private WebElement thirdproduct;

    @FindBy(xpath = "//div[@class='product-name']")
    private WebElement productname;


    public void computer(){
        mainmenucomputer().click();
    }
    public void jewelry(){
        MenuJewelry.click();
    }
    public void mouseoverNotebook(){
        Actions actions =new Actions(driver);
        actions.moveToElement(mainmenucomputer());
        actions.moveToElement(computersMouseoverNotebook());
        actions.click().build().perform();
    }
    public void menuApparel(){
        mainmenuApparel.click();
    }


    public void mouseoverAccessories(){
        Actions actions=new Actions(driver);
        actions.moveToElement(mainmenuApparel);
        actions.moveToElement(apparelmouseoveraccessories());
        actions.click().perform();
    }
    public void ComputerDesktop(){
        Desktop.click();
    }
    public void desktopProduct(){
        thirdproduct.click();
    }
    public String prodNameTitle(){
        return productname.getText();
    }
}
