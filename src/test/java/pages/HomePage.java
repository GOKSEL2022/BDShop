package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;


public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='authorization-link']")
    public WebElement loginButonHome;
    //*[@href='#social-login-popup']
    //a[normalize-space()='Log In']

    @FindBy(xpath = "//*[@class='mgz-icon mgz-icon-close']")
    public WebElement alertCloseButonHome;

    @FindBy(xpath = "(//div[normalize-space()='Invalid login or password.'])[2]")
    public WebElement invalidLoginAPasswordAlertHome;

    @FindBy(xpath = "(//*[.='MERHABA,'])[1]")
    public WebElement kayitliKullaniciMerhabaTextHome;

    @FindBy(xpath = "(//*[.='Register'])[1]")
    public WebElement registerButonHome;
}