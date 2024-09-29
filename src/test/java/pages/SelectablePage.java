package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SelectablePage extends BasePage {

    public SelenideElement crasJustoOdio = $x("//li[text()='Cras justo odio']");
    public SelenideElement dapibusAcFacilis = $x("//li[text()='Dapibus ac facilisis in']");
    public SelenideElement morbiLeoRisus = $x("//li[text()='Morbi leo risus']");
    public SelenideElement portaAcConsecteturAc = $x("//li[text()='Porta ac consectetur ac']");
    public SelenideElement gridTab = $("#demo-tab-grid");
    public SelenideElement oneTab = $x("//li[text()='One']");
    public SelenideElement twoTab = $x("//li[text()='Two']");
    public SelenideElement threeTab = $x("//li[text()='Three']");
    public SelenideElement fourTab = $x("//li[text()='Four']");
    public SelenideElement fiveTab = $x("//li[text()='Five']");
    public SelenideElement sixTab = $x("//li[text()='Six']");
    public SelenideElement sevenTab = $x("//li[text()='Seven']");
    public SelenideElement eightTab = $x("//li[text()='Eight']");
    public SelenideElement nineTab = $x("//li[text()='Nine']");

    public SelectablePage(String pageUrl) {
        super(pageUrl);
    }
}
