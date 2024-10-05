package pages;

import org.openqa.selenium.support.PageFactory;
import utilies.Driver;


public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}