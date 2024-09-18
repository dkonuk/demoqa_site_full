package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementsPageTest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.elementsPage.open();
    }

    @Test
    public void elementsLinksTest(){
        assertThat(pageManager.elementsPage.textBox.getText()).isEqualTo("Text Box");
        assertThat(pageManager.elementsPage.checkBox.getText()).isEqualTo("Check Box");
        assertThat(pageManager.elementsPage.radioButton.getText()).isEqualTo("Radio Button");
        assertThat(pageManager.elementsPage.webTable.getText()).isEqualTo("Web Tables");
        assertThat(pageManager.elementsPage.buttons.getText()).isEqualTo("Buttons");
        assertThat(pageManager.elementsPage.links.getText()).isEqualTo("Links");
        assertThat(pageManager.elementsPage.brokenLinksImages.getText()).isEqualTo("Broken Links - Images");
        assertThat(pageManager.elementsPage.uploadAndDownload.getText()).isEqualTo("Upload and Download");
        assertThat(pageManager.elementsPage.dynamicProperties.getText()).isEqualTo("Dynamic Properties");
    }


}
