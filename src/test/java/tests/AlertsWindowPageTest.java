package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AlertsWindowPageTest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.alertsWindowsPage.open();
    }

    @Test
    public void newTabTest(){
        pageManager.alertsWindowsPage.newTabButton.click();
        switchTo().window(1);
        assertThat(pageManager.alertsWindowsPage.newTabMessage.getText()).isEqualTo("This is a sample page");
        closeWindow();
        switchTo().window(0);
        pageManager.alertsWindowsPage.newWindowButton.click();
        switchTo().window(1);
        assertThat(pageManager.alertsWindowsPage.newTabMessage.getText()).isEqualTo("This is a sample page");
        closeWindow();
        switchTo().window(0);
        pageManager.alertsWindowsPage.newWindowMessageButton.click();
        switchTo().window(1);
        //assertThat(pageManager.alertsWindowsPage.newWindowMessage.getText()).contains("Knowledge");
        closeWindow();
        switchTo().window(0);
    }
}
