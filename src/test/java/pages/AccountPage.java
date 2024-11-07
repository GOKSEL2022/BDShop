package pages;

import org.openqa.selenium.support.PageFactory;
import utilies.Driver;

public class AccountPage {
    public AccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
