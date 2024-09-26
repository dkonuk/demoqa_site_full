package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.codeborne.selenide.commands.PressEnter;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class FormPageTest extends BaseTest {
    @BeforeMethod
    public void before(){
        pageManager.formPage.open();
    }

    @Test
    public void formPageTest() throws InterruptedException {
        pageManager.formPage.firstNameField.setValue("John");
        pageManager.formPage.lastNameField.setValue("Doe");
        pageManager.formPage.emailField.setValue("n5PpM@example.com");
        pageManager.formPage.maleRadioButton.click();
        pageManager.formPage.femaleRadioButton.click();
        pageManager.formPage.otherRadioButton.click();
        pageManager.formPage.phoneNumberField.setValue("1234567890");
        Actions actions = Selenide.actions();
        actions.scrollToElement(pageManager.formPage.subjectsField).perform();
        actions.click(pageManager.formPage.subjectsField).pause(500).sendKeys("English").pause(500).sendKeys(Keys.ENTER).perform();
        pageManager.formPage.hobbiesField1.parent().click();
        pageManager.formPage.hobbiesField2.parent().click();
        pageManager.formPage.hobbiesField3.parent().click();
        pageManager.formPage.currentAddressField.setValue("123 Main St");
         pageManager.formPage.stateField.scrollTo();
        actions.click(pageManager.formPage.stateField).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        actions.click(pageManager.formPage.cityField).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        pageManager.formPage.submitButton.scrollTo().click();
        assertThat(pageManager.formPage.studentName.shouldBe(visible).getText()).isEqualTo("John Doe");
        assertThat(pageManager.formPage.subjectsCheck.shouldBe(visible).getText()).isEqualTo("English");
        assertThat(pageManager.formPage.hobbiesCheck.getText()).isEqualTo("Sports, Reading, Music");
        assertThat(pageManager.formPage.stateField.getText()).isEqualTo("Uttar Pradesh");
        assertThat(pageManager.formPage.cityField.getText()).isEqualTo("Lucknow");




    }
}
