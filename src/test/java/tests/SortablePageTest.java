package tests;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static com.codeborne.selenide.Selenide.actions;

public class SortablePageTest extends BaseTest {

    @BeforeMethod
    public void before() {
        pageManager.sortablePage.open();
    }

    @Test
    public void testSortable() {
        pageManager.sortablePage.sortableOne.click();
        assertThat(pageManager.sortablePage.sortableOne.getText()).isEqualTo("One");
        SelenideElement[] sortables = {
                pageManager.sortablePage.sortableTwo,
                pageManager.sortablePage.sortableThree,
                pageManager.sortablePage.sortableFour,
                pageManager.sortablePage.sortableFive,
                pageManager.sortablePage.sortableSix
        };

        for (int i = 0; i < sortables.length-1; i++) {
            actions().dragAndDrop(pageManager.sortablePage.sortableOne, sortables[i + 1]).perform();
        }
        SelenideElement[] sortablesGrid = {
                pageManager.sortablePage.sortableGridTwo,
                pageManager.sortablePage.sortableGridThree,
                pageManager.sortablePage.sortableGridFour,
                pageManager.sortablePage.sortableGridFive,
                pageManager.sortablePage.sortableGridSix,
                pageManager.sortablePage.sortableGridSeven,
                pageManager.sortablePage.sortableGridEight,
                pageManager.sortablePage.sortableGridNine
        };
        pageManager.sortablePage.sortableGridTab.click();
        for (int i = 0; i < sortablesGrid.length-1; i++) {
            actions().dragAndDrop(pageManager.sortablePage.sortableGridOne, sortablesGrid[i + 1]).perform();
        }


    }
}