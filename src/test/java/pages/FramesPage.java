package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class FramesPage extends BasePage {
    public SelenideElement frame1 = $("[id=frame1]");
    public SelenideElement frame1Text = $("[id=sampleHeading]");
    public SelenideElement frame2 = $("[id=frame2]");
    public SelenideElement frame2Text = $("[id=sampleHeading]");



    public FramesPage(String pageUrl) {
        super(pageUrl);
    }
}
