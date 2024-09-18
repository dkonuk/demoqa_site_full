package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckBoxPageTest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.checkBoxPage.open();
    }

    @Test
    public void checkBoxTest() {
        pageManager.checkBoxPage.homeToggleButton.click();
        pageManager.checkBoxPage.desktopCheckBox.parent().click();
        pageManager.checkBoxPage.documentsCheckBox.parent().click();
        pageManager.checkBoxPage.downloadsCheckBox.parent().click();
        assertThat(pageManager.checkBoxPage.resultDisplay.isDisplayed()).isTrue();
    }
}
