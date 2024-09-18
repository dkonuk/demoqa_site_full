package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage extends BasePage {

    public SelenideElement homeToggleButton = $("button[title=\"Toggle\"]");
    public SelenideElement desktopCheckBox = $("#tree-node-desktop");
    public SelenideElement documentsCheckBox = $("#tree-node-desktop");
    public SelenideElement downloadsCheckBox = $("#tree-node-documents");
    public SelenideElement resultDisplay = $("#result");

    public CheckBoxPage(String pageUrl) {
        super(pageUrl);
    }

}
