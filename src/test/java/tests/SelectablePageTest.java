package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectablePageTest extends BaseTest {
    @BeforeMethod
    public void before(){
        pageManager.selectablePage.open();
    }

    @Test
    public void selectablePageTest(){
        pageManager.selectablePage.crasJustoOdio.click();
        pageManager.selectablePage.dapibusAcFacilis.click();
        pageManager.selectablePage.morbiLeoRisus.click();
        pageManager.selectablePage.portaAcConsecteturAc.click();
        pageManager.selectablePage.portaAcConsecteturAc.click();
        pageManager.selectablePage.morbiLeoRisus.click();
        pageManager.selectablePage.dapibusAcFacilis.click();
        pageManager.selectablePage.crasJustoOdio.click();
        pageManager.selectablePage.gridTab.click();
        pageManager.selectablePage.oneTab.click();
        pageManager.selectablePage.twoTab.click();
        pageManager.selectablePage.threeTab.click();
        pageManager.selectablePage.fourTab.click();
        pageManager.selectablePage.fiveTab.click();
        pageManager.selectablePage.sixTab.click();
        pageManager.selectablePage.sevenTab.click();
        pageManager.selectablePage.eightTab.click();
        pageManager.selectablePage.nineTab.click();
        pageManager.selectablePage.nineTab.click();
        pageManager.selectablePage.eightTab.click();
        pageManager.selectablePage.sevenTab.click();
        pageManager.selectablePage.sixTab.click();
        pageManager.selectablePage.fiveTab.click();
        pageManager.selectablePage.fourTab.click();
        pageManager.selectablePage.threeTab.click();
        pageManager.selectablePage.twoTab.click();
        pageManager.selectablePage.oneTab.click();


    }
}
