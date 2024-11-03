package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilies.Driver;
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
    }
}
