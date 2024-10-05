package hooks;
import io.cucumber.java.Before;
import org.testng.annotations.AfterMethod;

public class Hooks {


    @Before()
    public void hooks(){

    }

    @AfterMethod
    public void tearDown() {

    }
}