package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Login']")
    public WebElement loginButonLogin;

    @FindBy(xpath = "(//*[.='This is a required field.'])[1]")
    public WebElement errorMessageThisIsARequiredFiel1dLogin;

    @FindBy(xpath = "(//*[.='This is a required field.'])[2]")
    public WebElement errorMessageThisIsARequiredFiel2dLogin;
}
