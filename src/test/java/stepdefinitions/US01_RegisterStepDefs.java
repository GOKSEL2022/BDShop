package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
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
        assert pages.createPage().newCustomersTextTitleCreate.isDisplayed();
    }
    @And("kullanici create an account butona tiklar")
    public void kullaniciCreateAnAccountButonaTiklar() {

    }

    @And("kullanici zorunlu alanlar uzerinde This is a required field uyarisini goruntuler")
    public void kullaniciZorunluAlanlarUzerindeThisIsARequiredFieldUyarisiniGoruntuler() {
    }
}
