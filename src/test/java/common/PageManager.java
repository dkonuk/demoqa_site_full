package common;

import driver.DriverFactory;
import pages.*;

public class PageManager {
    public ElementsPage elementsPage;
    public ElementsTextBoxPage elementsTextBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public FormPage formPage;
    public AlertsWindowsPage alertsWindowsPage;
    public AlertsPage alertsPage;
    public FramesPage framesPage;

    public PageManager() {
        DriverFactory.initDriver();
        elementsPage = PageFactory.buildElementsPage();
        elementsTextBoxPage = PageFactory.buildElementsTextBoxPage();
        checkBoxPage = PageFactory.buildCheckBoxPage();
        radioButtonPage = PageFactory.buildRadioButtonPage();
        formPage = PageFactory.buildFormPage();
        alertsWindowsPage = PageFactory.buildAlertsWindowsPage();
        alertsPage = PageFactory.buildAlertsPage();
        framesPage = PageFactory.buildFramesPage();

    }
}
