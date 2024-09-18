package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.assertj.core.api.Assertions.assertThat;


public class AlertsPageTest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.alertsPage.open();
    }

    @Test
    public void alertsTest(){
        pageManager.alertsPage.alertButton.click();
        switchTo().alert().accept();
        pageManager.alertsPage.timerAlertButton.click();
        switchTo().alert().accept();
        pageManager.alertsPage.confirmButton.click();
        switchTo().alert().accept();
        pageManager.alertsPage.promptButton.click();
        switchTo().alert().sendKeys("Deniz");
        assertThat(pageManager.alertsPage.promptResult.getText()).isEqualTo("You entered Deniz");
    }
}
