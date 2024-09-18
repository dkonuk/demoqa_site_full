package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.assertj.core.api.Assertions.assertThat;

public class RadioButtonTest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.radioButtonPage.open();
    }

    @Test
    public void radioButtonTest() {
        pageManager.radioButtonPage.yesRadioButton.click();
        assertThat(pageManager.radioButtonPage.selectionSuccess.getText()).isEqualTo("Yes");
        pageManager.radioButtonPage.impressiveRadioButton.click();
        assertThat(pageManager.radioButtonPage.selectionSuccess.getText()).isEqualTo("Impressive");
    }
}
