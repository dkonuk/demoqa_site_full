package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utils.PropertyManager;

import static org.assertj.core.api.Assertions.assertThat;



public class BookStorePageTest extends BaseTest {
    @BeforeMethod
    public void before(){
        pageManager.bookStorePage.open();
        pageManager.bookStorePage.userName.setValue(PropertyManager.getProperty("USER_NAME"));
        pageManager.bookStorePage.password.setValue(PropertyManager.getProperty("PASSWORD"));
        pageManager.bookStorePage.loginButton.click();
        pageManager.bookStorePage.getUrl();

    }
    @Test
    public void bookStorePageTest(){
        pageManager.bookStorePage.bookStoreButton.click();
        Actions actions = Selenide.actions();
        actions.pause(1000).perform();
        ElementsCollection rowsPerPageOptions = pageManager.bookStorePage.rowsPerPage.getOptions();
        for (int i=0;i<rowsPerPageOptions.size();i++){
            pageManager.bookStorePage.rowsPerPage.selectOption(i);
        }
        pageManager.bookStorePage.rowsPerPage.selectOption(1);
        assertThat(pageManager.bookStorePage.rowPerPageValue.getValue()).isEqualTo("10");

    }
    @AfterMethod
    public void after(){
        pageManager.bookStorePage.logoutButton.click();
    }

}
