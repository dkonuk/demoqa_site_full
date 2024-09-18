package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.commands.PressEnter;

public class ElementsTextBoxPage extends BasePage {

    public SelenideElement fullNameBox = $("#userName");
    public SelenideElement emailBox = $("#userEmail");
    public SelenideElement currentAddressBox = $("#currentAddress");
    public SelenideElement permanentAddressBox = $("#permanentAddress");
    public SelenideElement submitButton = $("#submit");
    public SelenideElement nameField = $("p[id=\"name\"]");
    public SelenideElement emailField = $("p[id=\"email\"]");
    public SelenideElement currentAddressField = $("p[id=\"currentAddress\"]");
    public SelenideElement permanentAddressField = $("p[id=\"permanentAddress\"]");


    public ElementsTextBoxPage(String pageUrl) {
        super(pageUrl);
    }
}
