package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class RadioButtonPage extends BasePage {

    public SelenideElement yesRadioButton = $("[for=\"yesRadio\"]");
    public SelenideElement impressiveRadioButton = $("[for=\"impressiveRadio\"]");
    public SelenideElement selectionSuccess = $("[class=\"text-success\"]");

    public RadioButtonPage(String pageUrl) {
        super(pageUrl);
    }
}
