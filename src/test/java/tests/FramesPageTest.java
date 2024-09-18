package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.switchTo;
import static org.assertj.core.api.Assertions.assertThat;

public class FramesPageTest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.framesPage.open();
    }

    @Test
    public void frameTest(){
        switchTo().frame("frame1");
        assertThat(pageManager.framesPage.frame1Text.getText()).isEqualTo("This is a sample page");
        switchTo().defaultContent();
        switchTo().frame("frame2");
        assertThat(pageManager.framesPage.frame2Text.getText()).isEqualTo("This is a sample page");
    }
}
