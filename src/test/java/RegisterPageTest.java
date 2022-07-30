import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends Base{
    RegisterPage registerPage;
    Utility utility;
    public RegisterPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        registerPage = new RegisterPage();
        utility=new Utility();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void tcregfunction() throws InterruptedException {
        utility.CheckRegBtn();

    }

}

