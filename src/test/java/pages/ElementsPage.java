package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage extends BasePage {

    public SelenideElement textBox = $("div.show li#item-0");
    public SelenideElement checkBox = $("div.show li#item-1");
    public SelenideElement radioButton = $("div.show li#item-2");
    public SelenideElement webTable = $("div.show li#item-3");
    public SelenideElement buttons = $("div.show li#item-4");
    public SelenideElement links = $("div.show li#item-5");
    public SelenideElement brokenLinksImages = $("div.show li#item-6");
    public SelenideElement uploadAndDownload = $("div.show li#item-7");
    public SelenideElement dynamicProperties = $("div.show li#item-8");


    public ElementsPage(String pageUrl) {
        super(pageUrl);
    }


}
