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
    public SelenideElement subjectsField = $("[id=\"subjectsContainer\"]");
    public SelenideElement hobbiesField1 = $("[id=\"hobbies-checkbox-1\"]");
    public SelenideElement hobbiesField2 = $("[id=\"hobbies-checkbox-2\"]");
    public SelenideElement hobbiesField3 = $("[id=\"hobbies-checkbox-3\"]");
    public SelenideElement currentAddressField = $("#currentAddress");
    //public SelenideElement stateField = $x("//div[contains(text(),'Select State')]");
    public SelenideElement stateField = $("[id=\"state\"]");
    public SelenideElement cityField = $("#city");
    public SelenideElement submitButton = $("#submit");
    public SelenideElement studentName = $x("//tbody/tr[1]/td[2]");
    public SelenideElement subjectsCheck = $x("//tbody/tr[6]/td[2]");
    public SelenideElement hobbiesCheck = $x("//tbody/tr[7]/td[2]");
    public SelenideElement stateCheck = $x("//tbody/tr[8]/td[2]");
    public SelenideElement cityCheck = $x("//tbody/tr[9]/td[2]");




    public FormPage (String pageUrl) {
        super(pageUrl);
    }
}
