package pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;

public class AlertsPage  extends BasePage {

    public SelenideElement alertButton = $("[id=alertButton]");
    public SelenideElement timerAlertButton = $("[id=timerAlertButton]");
    public SelenideElement confirmButton = $("[id=confirmButton]");
    public SelenideElement promptButton = $("[id=promtButton]");
    public SelenideElement promptResult = $("[id=promptResult]");

    public AlertsPage(String pageUrl) {
        super(pageUrl);
    }
}
