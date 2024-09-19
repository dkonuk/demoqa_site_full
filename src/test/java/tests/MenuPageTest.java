package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuPageTest extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.menuPage.open();
    }

    @Test
    public void menuTest(){
        pageManager.menuPage.mainItem.click();
        pageManager.menuPage.mainItem2.hover();
        pageManager.menuPage.subItem.click();
        pageManager.menuPage.mainItem2.hover();
        pageManager.menuPage.subList.hover();
        pageManager.menuPage.subSubItem.click();
        pageManager.menuPage.mainItem3.click();
    }
}
