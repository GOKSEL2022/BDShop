package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilies.ConfigReader;
import utilies.Driver;
import static org.junit.Assert.assertFalse;
import static utilies.ReusableMethods.clickWithJS;
public class US01_RegisterStepDefs {
    AllPages pages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    String symbol="++--//^^%*!..$#{[]}&";
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
       assertFalse(pages.registerPage().thisIsARequiredFieldAlertRegister.isDisplayed());

    }

    @And("kullanici first name alanina sayi ile birlikte valid girer")
    public void kullaniciFirstNameAlaninaSayiIleBirlikteValidGirer() {
        pages.registerPage().firstNameTextboxRegister.sendKeys(Faker.instance().number().randomNumber()+ ConfigReader.getProperty("firstNameRegister"));
    }

    @And("kullanici last name alanina sayi ile birlikte valid girer")
    public void kullaniciLastNameAlaninaSayiIleBirlikteValidGirer() {
        pages.registerPage().lastNameTextboxRegister.sendKeys(Faker.instance().number().randomNumber()+ ConfigReader.getProperty("lastNameRegister"));
    }

    @And("kullanici first name alanina sembol ile birlikte valid girer")
    public void kullaniciFirstNameAlaninaSembolIleBirlikteValidGirer() {
        pages.registerPage().firstNameTextboxRegister.sendKeys(Faker.instance().lorem().character()+symbol+ ConfigReader.getProperty("firstNameRegister"));
    }

    @And("kullanici last name alanina sembol ile birlikte valid girer")
    public void kullaniciLastNameAlaninaSembolIleBirlikteValidGirer() {
        pages.registerPage().lastNameTextboxRegister.sendKeys(Faker.instance().lorem().character()+symbol+ ConfigReader.getProperty("lastNameRegister"));
    }

    @And("kullanici first name alanina valid deger girer")
    public void kullaniciFirstNameAlaninaValidDegerGirer() {
        pages.registerPage().firstNameTextboxRegister.sendKeys(ConfigReader.getProperty("firstNameRegister"));
    }

    @And("kullanici last name alanina valid deger girer")
    public void kullaniciLastNameAlaninaValidDegerGirer() {
        pages.registerPage().lastNameTextboxRegister.sendKeys(ConfigReader.getProperty("lastNameRegister"));
    }

    @And("kullanici eposta alanini bos birakarak create an account butona tiklar")
    public void kullaniciEpostaAlaniniBosBirakarakCreateAnAccountButonaTiklar() {
        //pages.registerPage().epostaTextboxRegister.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE);
        clickWithJS(pages.registerPage().createAnAccountButtonRegister);
    }@And("kullanici Eposta ve sifre alanlarinda alanlarinda This is a required field uyarisini goruntuler")
    public void kullaniciEpostaVeSifreAlanlarindaAlanlarindaThisIsARequiredFieldUyarisiniGoruntuler() {
        //assertFalse(pages.registerPage().thisIsARequiredFieldAlertEpostaRegister.isDisplayed());
        //assertFalse(pages.registerPage().thisIsARequiredFieldAlertSifreRegister.isDisplayed());
    }

    @And("kullanici register eposta alanina invalid deger girer")
    public void kullaniciRegisterEpostaAlaninaInvalidDegerGirer() {
    }
}
