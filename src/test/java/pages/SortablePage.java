package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SortablePage  extends BasePage {

    public SelenideElement sortableOne = $x("// div [text()='One']");
    public SelenideElement sortableTwo = $x("// div [text()='Two']");
    public SelenideElement sortableThree = $x("// div [text()='Three']");
    public SelenideElement sortableFour = $x("// div [text()='Four']");
    public SelenideElement sortableFive = $x("// div [text()='Five']");
    public SelenideElement sortableSix = $x("// div [text()='Six']");

    public SelenideElement sortableGridTab = $("#demo-tab-grid");
    public SelenideElement sortableGridOne = $x("//*[@class=\"create-grid\"]// div [text()='One']");
    public SelenideElement sortableGridTwo = $x("//*[@class=\"create-grid\"]// div [text()='Two']");
    public SelenideElement sortableGridThree = $x("//*[@class=\"create-grid\"]// div [text()='Three']");
    public SelenideElement sortableGridFour = $x("//*[@class=\"create-grid\"]// div [text()='Four']");
    public SelenideElement sortableGridFive = $x("//*[@class=\"create-grid\"]// div [text()='Five']");
    public SelenideElement sortableGridSix = $x("//*[@class=\"create-grid\"]// div [text()='Six']");
    public SelenideElement sortableGridSeven = $x("//*[@class=\"create-grid\"]// div [text()='Seven']");
    public SelenideElement sortableGridEight = $x("//*[@class=\"create-grid\"]// div [text()='Eight']");
    public SelenideElement sortableGridNine = $x("//*[@class=\"create-grid\"]// div [text()='Nine']");




    public SortablePage(String pageUrl) {
        super(pageUrl);
    }
}
