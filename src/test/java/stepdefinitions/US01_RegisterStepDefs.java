package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilies.ConfigReader;
import utilies.Driver;
import utilies.ReusableMethods;

import static utilies.ReusableMethods.clickWithJS;
public class US01_RegisterStepDefs {
    AllPages pages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici registerHome butona tiklar")
    public void kullaniciRegisterHomeButonaTiklar() {
        clickWithJS(pages.homePage().registerButonHome);
    }
    @And("kullanici register sayfasina yonlendirildigini dogrular")
    public void kullaniciRegisterSayfasinaYonlendirildiginiDogrular() {
        assert pages.registerPage().newCustomersTextTitleRegister.isDisplayed();
    }
    @And("kullanici create an account butona tiklar")
    public void kullaniciCreateAnAccountButonaTiklar() {
        clickWithJS(pages.registerPage().createAnAccountButtonRegister);
    }
    @And("kullanici zorunlu alanlar uzerinde This is a required field uyarisini goruntuler")
    public void kullaniciZorunluAlanlarUzerindeThisIsARequiredFieldUyarisiniGoruntuler() {
        assert pages.registerPage().thisIsARequiredFieldAlertRegister.isDisplayed();
    }

    @And("kullanici first name alanina bosluk birakarak valid girer")
    public void kullaniciFirstNameAlaninaBoslukBirakarakValidGirer() {
        pages.registerPage().firstNameTextboxRegister.sendKeys(Keys.SPACE+ ConfigReader.getProperty("firstNameRegister"));
    }
    @And("kullanici last name alanina bosluk birakarak valid girer")
    public void kullaniciLastNameAlaninaBoslukBirakarakValidGirer() {
        pages.registerPage().lastNameTextboxRegister.sendKeys(Keys.SPACE+ ConfigReader.getProperty("lastNameRegister"));
    }

    @And("kullanici first name ve last name alanlarinda zorunlu alan uyarisi olmadigini dogrular")
    public void kullaniciFirstNameVeLastNameAlanlarindaZorunluAlanUyarisiOlmadiginiDogrular() {
    }

    @And("kullanici first name alanina sayi ile birlikte valid girer")
    public void kullaniciFirstNameAlaninaSayiIleBirlikteValidGirer() {
    }
}
