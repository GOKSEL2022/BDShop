package pages;

public class AllPages {

    public AllPages() {
    }

    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;
    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public RegisterPage registerPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

}
