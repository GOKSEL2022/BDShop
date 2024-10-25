package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.AllPages;
import utilies.ConfigReader;
import utilies.Driver;
import static utilies.ReusableMethods.clickWithJS;
public class US01_HomeStepDefinitions {
    AllPages pages=new AllPages();
    SoftAssert softAssert=new SoftAssert();
    @Given("kullanici url ye gider")
    public void kullaniciUrlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("kullanici anasayfanin acildigini dogrular")
    public void kullaniciAnasayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getTitle().equalsIgnoreCase("BD SHOP | Online Shopping BD | YouTube Gadget & Gear Shop");
    }
    @And("kullanici loginHome butona tiklar")
    public void kullaniciLoginHomeButonaTiklar() {
        if (!pages.homePage().alertCloseButonHome.isDisplayed()){
            clickWithJS(pages.homePage().loginButonHome);
        }else if (pages.homePage().alertCloseButonHome.isDisplayed())
            clickWithJS(pages.homePage().alertCloseButonHome);
            clickWithJS(pages.homePage().loginButonHome);
    }
    @And("kullanici loginLogin butona tiklar")
    public void kullaniciLoginLoginButonaTiklar() {
        clickWithJS(pages.loginPage().loginButonLogin);
    }
    @And("kullanici email ve password alanlarinda This is a required field uyarisini goruntuler")
    public void kullaniciEmailVePasswordAlanlarindaThisIsARequiredFieldUyarisiniGoruntuler() {
        softAssert.assertTrue(pages.loginPage().errorMessageThisIsARequiredFiel1dLogin.isDisplayed());
        softAssert.assertTrue(pages.loginPage().errorMessageThisIsARequiredFiel2dLogin.isDisplayed());
        softAssert.assertAll();
    }
    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
    @And("kullanici eposta alanina bosluk birakarak valid deger girer")
    public void kullaniciEpostaAlaninaBoslukBirakarakValidDegerGirer() {
        pages.loginPage().epostaTextboxLogin.sendKeys(Keys.SPACE,ConfigReader.getProperty("validMail"));
    }
    @And("kullanici sifre alanina bosluk birakarak valid deger girer")
    public void kullaniciSifreAlaninaBoslukBirakarakValidDegerGirer() {
        pages.loginPage().sifreTextboxLogin.sendKeys(Keys.SPACE,ConfigReader.getProperty("validSifre"));
    }
    @And("kullanici eposta alanina ozel karakterle birlikte valid deger girer")
    public void kullaniciEpostaAlaninaOzelKarakterleBirlikteValidDegerGirer() {
        pages.loginPage().epostaTextboxLogin.sendKeys("++//**##%!'=?"+ ConfigReader.getProperty("validMail"));
    }
    @And("kullanici sifre alanina ozel karakterle birlikte  valid deger girer")
    public void kullaniciSifreAlaninaOzelKarakterleBirlikteValidDegerGirer() {
        pages.loginPage().sifreTextboxLogin.sendKeys("++//**##%!'=?"+ConfigReader.getProperty("validSifre"));
    }
    @And("kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler")
    public void kullaniciEmailVePasswordAlanlarindaInvalidLoginOrPasswordUyarisiniGoruntuler() {
        assert pages.homePage().invalidLoginAPasswordAlertHome.isDisplayed();
    }
    @And("kullanici eposta alanina sayilarla birlikte valid deger girer")
    public void kullaniciEpostaAlaninaSayilarlaBirlikteValidDegerGirer() {
        pages.loginPage().epostaTextboxLogin.sendKeys("123456789"+ ConfigReader.getProperty("validMail"));
    }
    @And("kullanici sifre alanina sayilarla birlikte  valid deger girer")
    public void kullaniciSifreAlaninaSayilarlaBirlikteValidDegerGirer() {
        pages.loginPage().sifreTextboxLogin.sendKeys("123456789"+ConfigReader.getProperty("validSifre"));
    }
    @And("kullanici eposta alanina bosluk girer")
    public void kullaniciEpostaAlaninaBoslukGirer() {
        pages.loginPage().sifreTextboxLogin.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
    @And("kullanici sifre alanina bosluk girer")
    public void kullaniciSifreAlaninaBoslukGirer() {
        pages.loginPage().epostaTextboxLogin.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
}
