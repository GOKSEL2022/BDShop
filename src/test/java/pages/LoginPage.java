package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[.='Log In'])[4]")
    public WebElement loginButonLogin;

    ////*[@type='submit'])[2]

    @FindBy(xpath = "(//*[.='This is a required field.'])[1]")
    public WebElement errorMessageThisIsARequiredFiel1dLogin;

    @FindBy(xpath = "(//*[.='This is a required field.'])[2]")
    public WebElement errorMessageThisIsARequiredFiel2dLogin;
}
