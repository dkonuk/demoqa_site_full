package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Condition.text;
import static org.assertj.core.api.Assertions.assertThat;

public class ElementsTextBoxTest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.elementsPage.open();
        pageManager.elementsPage.textBox.click();
    }

    @Test
    public void elementsTextBoxTest(){

        pageManager.elementsTextBoxPage.fullNameBox.setValue("John Doe");
        pageManager.elementsTextBoxPage.emailBox.setValue("pC3yQ@example.com");
        pageManager.elementsTextBoxPage.currentAddressBox.setValue("123 Main St");
        pageManager.elementsTextBoxPage.permanentAddressBox.setValue("456 Second St");
        pageManager.elementsTextBoxPage.submitButton.click();
        pageManager.elementsTextBoxPage.nameField.shouldHave(text("John Doe"));

    }

}
