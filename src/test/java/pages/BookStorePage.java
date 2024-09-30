package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BookStorePage extends BasePage {

    public SelenideElement userName = $("#userName");
    public SelenideElement password = $("#password");
    public SelenideElement loginButton = $("#login");
    public SelenideElement outputField = $("#output");
    public SelenideElement bookStoreButton = $("#gotoStore");
    public SelenideElement rowsPerPage = $x("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/span[2]/select[1]");
    public SelenideElement rowPerPageValue = $x("//option[contains(text(),'10 rows')]");
    public SelenideElement logoutButton = $x("//button[text()=\"Log out\"]");


    public BookStorePage(String pageUrl) {
        super(pageUrl);
    }
}
