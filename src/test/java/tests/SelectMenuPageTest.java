package tests;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.interactions.Actions;
import com.codeborne.selenide.testng.ScreenShooter;

import static com.codeborne.selenide.Selectors.byText;
import static org.assertj.core.api.Assertions.assertThat;

@Listeners({ScreenShooter.class})
public class SelectMenuPageTest extends BaseTest {

    static {
        ScreenShooter.captureSuccessfulTests = false;
    }

    @BeforeMethod
    public void before(){
        pageManager.selectMenuPage.open();
    }

    @Test
    public void selectMenuTest(){
        pageManager.selectMenuPage.selectOptionMenu.click();
        pageManager.selectMenuPage.selectOptionMenu.find(byText("Group 2, option 1")).click();
        pageManager.selectMenuPage.selectOneMenu.click();
        pageManager.selectMenuPage.selectOneMenu.find(byText("Mrs.")).click();
        pageManager.selectMenuPage.oldStyleSelectMenu.selectOption(3);
        Actions actions = Selenide.actions();
        actions.click(pageManager.selectMenuPage.multipleSelectMenu).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        Actions actions2 = Selenide.actions();
        actions2.keyDown(Keys.COMMAND).click((pageManager.selectMenuPage.standardMultiSelectSaab)).keyUp(Keys.COMMAND).perform();
        actions2.keyDown(Keys.COMMAND).click((pageManager.selectMenuPage.standardMultiSelectVolvo)).keyUp(Keys.COMMAND).perform();




    }
}


