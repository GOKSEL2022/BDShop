package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='New Customers']")
    public WebElement newCustomersTextTitleRegister;

    @FindBy(xpath = "(//*[.='Create an Account'])[2]")
    public WebElement createAnAccountButtonRegister;

    @FindBy(xpath = "(//*[.='This is a required field.'])[1]")
    public WebElement thisIsARequiredFieldAlertRegister;
}
