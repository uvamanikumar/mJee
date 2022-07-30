import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Base {
    public RegisterPage() {

        PageFactory.initElements(Base.driver, this);
    }

    @FindBy(xpath = "//a[@class=\"ico-register\"]")
    private WebElement RegisterBtn;
    @FindBy(xpath = "//input[@id=\"FirstName\"]")
    private WebElement FirstNameField;
    @FindBy(xpath = "//input[@id=\"LastName\"]")
    private WebElement LastNameField;
    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]")
    private WebElement DOBDate;
    @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]")
    private WebElement DOBMonth;
    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]")
    private WebElement DOBYear;
    @FindBy(xpath = "//input[@name=\"Email\"]")
    private WebElement EmailField;
    @FindBy(xpath = "//input[@id=\"Password\"]")
    private WebElement NewPwd;
    @FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
    private WebElement ConfrimNewPwd;
    @FindBy(xpath = "//button[@id=\"register-button\"]")
    private WebElement ClickRegBtn;
    @FindBy(xpath = "//a[@class=\"button-1 register-continue-button\"]")
    private WebElement ContinueBtn;


    public void ClickRegBtn() {
        RegisterBtn.click();
    }

    public void EnterfirstName(String FirstName ) {
        FirstNameField.sendKeys("uva");
    }

    public void EnterLastName(String LastName) {
        LastNameField.sendKeys("Mani");
    }

    public void ClickDOB() {
        Select DobSelectByDate = new Select(DOBDate);
        DobSelectByDate.selectByVisibleText("24");
        Select DobSelectByMonth = new Select(DOBMonth);
        DobSelectByMonth.selectByIndex(5);
        Select DobSelectByYear = new Select(DOBYear);
        DobSelectByYear.selectByValue("1977");
    }

    public void EnterMailID() {
        String generatedstring= RandomString.make();
        String email=generatedstring+"@gmail.com";
        EmailField.sendKeys(generatedstring+email);
    }

    public void EnterNewPwd(String newpwd) {
        NewPwd.sendKeys("qwerty");  }

    public void EnterConfrimPwd(String confrimPwd) {

        ConfrimNewPwd.sendKeys("qwerty");
    }
    public void RegBtnClick(){

        ClickRegBtn.click();
    }
    public void ClickContinueBtn(){
        ContinueBtn.click();
    }
}


