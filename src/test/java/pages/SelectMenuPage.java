package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SelectMenuPage extends BasePage{

    public SelenideElement selectOptionMenu = $("#withOptGroup");
    public SelenideElement selectOneMenu = $("#selectOne");
    public SelenideElement oldStyleSelectMenu = $("#oldSelectMenu");
    public SelenideElement multipleSelectMenu = $x("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]");
    public SelenideElement multipleSelectMenuAfterClick = $x("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]");
    public SelenideElement standardMultiSelectVolvo = $("[value=\"volvo\"]");
    public SelenideElement standardMultiSelectSaab = $("[value=\"saab\"]");

    public SelectMenuPage(String pageUrl) {
        super(pageUrl);
    }
}
