package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FormPage extends BasePage {

    public SelenideElement firstNameField = $("#firstName");
    public SelenideElement lastNameField = $("#lastName");
    public SelenideElement emailField = $("#userEmail");
    public SelenideElement maleRadioButton = $("[for=\"gender-radio-1\"]");
    public SelenideElement femaleRadioButton = $("[for=\"gender-radio-2\"]");
    public SelenideElement otherRadioButton = $("[for=\"gender-radio-3\"]");
    public SelenideElement phoneNumberField = $("#userNumber");
    public SelenideElement dateOfBirthField = $("#dateOfBirthInput");
    public SelenideElement subjectsField = $("[class=\"css-1g6gooi\"]");
    public SelenideElement hobbiesField1 = $("[for=\"gender-radio-1\"]");
    public SelenideElement hobbiesField2 = $("[for=\"gender-radio-2\"]");
    public SelenideElement hobbiesField3 = $("[for=\"gender-radio-3\"]");
    public SelenideElement currentAddressField = $("#currentAddress");
    public SelenideElement stateField = $x("//div[contains(text(),'Select State')]");
    public SelenideElement cityField = $("#city");
    public SelenideElement submitButton = $("#submit");
    public SelenideElement studentName = $x("//tbody/tr[1]/td[2]");



    public FormPage (String pageUrl) {
        super(pageUrl);
    }
}
