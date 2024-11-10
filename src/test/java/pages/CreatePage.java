package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class CreatePage {
    public CreatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='New Customers']")
    public WebElement newCustomersTextTitleCreate;

    @FindBy(xpath = "(//*[.='Create an Account'])[2]")
    public WebElement createAnAccountButtonCreate;

    @FindBy(xpath = "(//*[.='This is a required field.'])[1]")
    public WebElement thisIsARequiredFieldAlertCreate;
}
