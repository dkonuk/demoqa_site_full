package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AlertsWindowsPage  extends BasePage {
    public SelenideElement newTabButton = $("[id=tabButton]");
    public SelenideElement newWindowButton = $("[id=windowButton]");
    public SelenideElement newWindowMessageButton = $("[id=messageWindowButton]");
    public SelenideElement newTabMessage = $("#sampleHeading");
    public SelenideElement newWindowMessage = $x("//body");


    public AlertsWindowsPage(String pageUrl) {
        super(pageUrl);
    }
}
