import org.testng.Assert;

public class Utility extends Base{
    RegisterPage registerPage=new RegisterPage();
    public void CheckRegBtn() throws InterruptedException {
        registerPage.ClickRegBtn();
        Assert.assertEquals(RegisterPage.driver.getCurrentUrl(),"https://demo.nopcommerce.com/register?returnUrl=%2F");
        registerPage.EnterfirstName("uva");
        registerPage.EnterLastName("mani");
        registerPage.ClickDOB();
        registerPage.EnterMailID();
        registerPage.EnterNewPwd("qwerty");
        registerPage.EnterConfrimPwd("qwerty");
        registerPage.RegBtnClick();
        Thread.sleep(2000);
        Assert.assertEquals(RegisterPage.driver.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
        registerPage.ClickContinueBtn();
    }
}
