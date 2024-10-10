package stepdefinitions;

import io.cucumber.java.en.*;
import pages.AllPages;
import utilies.ConfigReader;
import utilies.Driver;
import utilies.ReusableMethods;

import static utilies.ReusableMethods.clickWithJS;

public class US01_HomeStepDefinitions {
    AllPages pages=new AllPages();
    @Given("kullanici url ye gider")
    public void kullaniciUrlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("kullanici anasayfanin acildigini dogrular")
    public void kullaniciAnasayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getTitle().contains("BD SHOP | Online Shopping BD | YouTube Gadget & Gear Shop");
    }

    @And("kullanici loginHome butona tiklar")
    public void kullaniciLoginHomeButonaTiklar() {
        clickWithJS(pages.homePage().loginButonHome);
    }
    @And("kullanici loginLogin butona tiklar")
    public void kullaniciLoginLoginButonaTiklar() {
        clickWithJS(pages.loginPage().loginButonLogin);
    }
    @And("kullanici email ve password alanlarinda This is a required field uyarisini goruntuler")
    public void kullaniciEmailVePasswordAlanlarindaThisIsARequiredFieldUyarisiniGoruntuler() {
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
    }
}
