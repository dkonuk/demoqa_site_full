package tests;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.codeborne.selenide.commands.PressEnter;

import static org.assertj.core.api.Assertions.assertThat;

public class FormPageTest extends BaseTest {
    @BeforeMethod
    public void before(){
        pageManager.formPage.open();
    }

    @Test
    public void formPageTest(){
        pageManager.formPage.firstNameField.setValue("John");
        pageManager.formPage.lastNameField.setValue("Doe");
        pageManager.formPage.emailField.setValue("n5PpM@example.com");
        pageManager.formPage.maleRadioButton.click();
        pageManager.formPage.femaleRadioButton.click();
        pageManager.formPage.otherRadioButton.click();
        pageManager.formPage.phoneNumberField.setValue("1234567890");
        pageManager.formPage.hobbiesField1.click();
        pageManager.formPage.hobbiesField2.click();
        pageManager.formPage.hobbiesField3.click();
        pageManager.formPage.currentAddressField.setValue("123 Main St");
        pageManager.formPage.submitButton.click();
        assertThat(pageManager.formPage.studentName.getText()).isEqualTo("John Doe");



    }
}
