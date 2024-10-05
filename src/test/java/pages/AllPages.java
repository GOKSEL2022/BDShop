package pages;

public class AllPages {

    public AllPages() {
    }

    private HomePage homePage;
    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

}
