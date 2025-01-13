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

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextboxRegister;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextboxRegister;

    @FindBy(xpath = "(//*[.='This is a required field.'])[1]")
    public WebElement thisIsARequiredFieldAlertEmailRegister;

    @FindBy(xpath = "(//*[.='This is a required field.'])[2]")
    public WebElement thisIsARequiredFieldAlertPasswordRegister;

    @FindBy(xpath = "(//*[.='This is a required field.'])[3]")
    public WebElement thisIsARequiredFieldAlertConfirmPasswordRegister;

    @FindBy(xpath = "(//*[.='This is a required field.'])[4]")
    public WebElement pleaseTypeTheLettersAndNumbersBelowTextRegister;

    @FindBy(xpath = "//*[@id='email_address']")
    public WebElement emailTextboxRegister;
}
