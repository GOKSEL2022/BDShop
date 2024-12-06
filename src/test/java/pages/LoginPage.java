package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='btn-social-login-authentication']")
    public WebElement loginButonLogin;

    ////*[@type='submit'])[2]

    @FindBy(xpath = "(//*[.='This is a required field.'])[1]")
    public WebElement errorMessageThisIsARequiredFiel1dLogin;

    @FindBy(xpath = "(//*[.='This is a required field.'])[2]")
    public WebElement errorMessageThisIsARequiredFiel2dLogin;

    @FindBy(xpath = "//*[@id='email-login']")
    public WebElement epostaTextboxLogin;

    @FindBy(xpath = "//*[@id='pass-popup']")
    public WebElement sifreTextboxLogin;

    @FindBy(xpath = "//*[@id='remember_meLBIkeFh3sS']")
    public WebElement rememberMeCheckboxLogin;

    @FindBy(xpath = "//*[@href='https://www.bdshop.com/customer/account/forgotpassword/']")
    public WebElement forgotLinkLogin;

    @FindBy(xpath = "(//*[.='Reset My Password'])[1]")
    public WebElement resertMyPasswordButonLogin;

    @FindBy(xpath = "//*[.='The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.']")
    public WebElement basarisizKullaniciGirisiAlertLogin;

    @FindBy(xpath = "(//*[.='Log Out'])[1]")
    public WebElement logoutLinkLogin;




}
