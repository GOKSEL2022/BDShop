package stepdefinitions;

import io.cucumber.java.en.*;
import pages.AllPages;
import utilies.ConfigReader;
import utilies.Driver;

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
}
