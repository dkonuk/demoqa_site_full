package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MenuPage  extends BasePage {

    public SelenideElement mainItem = $x("//a[.='Main Item 1']");
    public SelenideElement mainItem2 = $x("//a[.='Main Item 2']");
    public SelenideElement subItem = $x("//a[.='Sub Item']");
    public SelenideElement subList = $x("//a[contains(text(),'SUB SUB LIST »')]");
    public SelenideElement subSubItem = $x("//a[.='Sub Sub Item 1']");
    public SelenideElement mainItem3 = $x("//a[.='Main Item 3']");


//*[@id="nav"]/li[2]/ul/li[3]/a

    public MenuPage(String pageUrl) {
        super(pageUrl);
    }
}
