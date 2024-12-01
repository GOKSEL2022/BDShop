package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.AllPages;
import utilies.ConfigReader;
import utilies.Driver;
import static utilies.ReusableMethods.clickWithJS;
import static utilies.ReusableMethods.clickWithTimeOut;

public class US02_LoginStepDefinitions {
    AllPages pages=new AllPages();  Actions actions=new Actions(Driver.getDriver());
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
        //clickWithJS(pages.homePage().loginButonHome);
        actions.moveToElement(pages.homePage().loginButonHome).perform();
        actions.doubleClick(pages.homePage().loginButonHome).perform();
        //clickWithTimeOut(pages.homePage().loginButonHome,10);
        //pages.homePage().loginButonHome.click();

        /*
        if (!pages.homePage().alertCloseButonHome.isDisplayed()){
            clickWithJS(pages.homePage().loginButonHome);
        }else if (pages.homePage().alertCloseButonHome.isDisplayed())
            clickWithJS(pages.homePage().alertCloseButonHome);
            clickWithJS(pages.homePage().loginButonHome);
         */
    }
    @And("kullanici loginLogin butona tiklar")
    public void kullaniciLoginLoginButonaTiklar() {
        clickWithJS(pages.loginPage().loginButonLogin);
    }
    @And("kullanici email ve password alanlarinda This is a required field uyarisini goruntuler")
    public void kullaniciEmailVePasswordAlanlarindaThisIsARequiredFieldUyarisiniGoruntuler() {
        assert pages.loginPage().errorMessageThisIsARequiredFiel1dLogin.isDisplayed();
        assert pages.loginPage().errorMessageThisIsARequiredFiel2dLogin.isDisplayed();
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
    @And("kullanici eposta alanina valid deger girer")
    public void kullaniciEpostaAlaninaValidDegerGirer() {
        pages.loginPage().epostaTextboxLogin.sendKeys(ConfigReader.getProperty("validMail"));
    }
    @And("kullanici sifre alanina valid deger girer")
    public void kullaniciSifreAlaninaValidDegerGirer() {
        pages.loginPage().sifreTextboxLogin.sendKeys(ConfigReader.getProperty("validSifre"));
    }
    @And("kullanici hesabiyla sayfaya giris yapildigi dogrulanir")
    public void kullaniciHesabiylaSayfayaGirisYapildigiDogrulanir() {
        assert pages.homePage().kayitliKullaniciMerhabaTextHome.isDisplayed();
    }
    @And("kullanici remember me checkboxin secimini kaldirir")
    public void kullaniciRememberMeCheckboxinSeciminiKaldirir() {
        if (pages.loginPage().rememberMeCheckboxLogin.isSelected()){
            clickWithJS(pages.loginPage().rememberMeCheckboxLogin);
        }
    }
    @And("kullanici eposta alanina invalid deger girer")
    public void kullaniciEpostaAlaninaInvalidDegerGirer() {
        pages.loginPage().epostaTextboxLogin.sendKeys(ConfigReader.getProperty("invalidMail"));
    }
    @And("kullanici sifre alanina invalid deger girer")
    public void kullaniciSifreAlaninaInvalidDegerGirer() {
        pages.loginPage().sifreTextboxLogin.sendKeys(ConfigReader.getProperty("invalidSifre"));
    }

    @And("kullanici forgot linke tiklar")
    public void kullaniciForgotLinkeTiklar() {
        clickWithJS(pages.loginPage().forgotLinkLogin);
    }
    @And("kullanici forgot password sayfasinda sifresini sifirlayabilecegini dogrular")
    public void kullaniciForgotPasswordSayfasindaSifresiniSifirlayabileceginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("forgotpassword");
    }

    @And("kullanici reset my password butona tiklar")
    public void kullaniciResetMyPasswordButonaTiklar() {
        clickWithJS(pages.loginPage().resertMyPasswordButonLogin);
    }

    @And("kullanici zorunlu alanlarda This is a required field uyarisini goruntuler")
    public void kullaniciZorunluAlanlardaThisIsARequiredFieldUyarisiniGoruntuler() {
        assert pages.loginPage().errorMessageThisIsARequiredFiel1dLogin.isDisplayed();
    }

    @And("kullanici hesabiyla sayfaya giris isleminin basarisiz oldugu dogrulanir")
    public void kullaniciHesabiylaSayfayaGirisIslemininBasarisizOlduguDogrulanir() {
        assert pages.loginPage().basarisizKullaniciGirisiAlertLogin.isDisplayed();
    }
    @And("kullanici tab tusu ile sifre alanina gelerek valid sifre girer")
    public void kullaniciTabTusuIleSifreAlaninaGelerekValidSifreGirer() {
        pages.loginPage().epostaTextboxLogin.sendKeys(ConfigReader.getProperty("validMail"),Keys.TAB,"validSifre",
                Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
    }

    @And("kullanici tab tusu ile loginLogin butona gelir ve entera tiklar")
    public void kullaniciTabTusuIleLoginLoginButonaGelirVeEnteraTiklar() {
    }

    @And("kullanici hesabim ikona gelir")
    public void kullaniciHesabimIkonaGelir() {
        actions.moveToElement(pages.homePage().hesabimIkon).perform();
    }

    @And("kullanici log out linke tiklar")
    public void kullaniciLogOutLinkeTiklar() {
    }

    @And("kullanici kullanici hesaptan cikis yapildigini dogrular")
    public void kullaniciKullaniciHesaptanCikisYapildiginiDogrular() {
    }
}
