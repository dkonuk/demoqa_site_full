package common;

import pages.*;

public class PageFactory {

    public static ElementsPage buildElementsPage() {
        return new ElementsPage("/elements");
    }
    public static ElementsTextBoxPage buildElementsTextBoxPage() {
        return new ElementsTextBoxPage("/text-box");
    }
    public static CheckBoxPage buildCheckBoxPage() {
        return new CheckBoxPage("/checkbox");
    }
    public static RadioButtonPage buildRadioButtonPage() {
        return new RadioButtonPage("/radio-button");
    }
    public static FormPage buildFormPage() {
        return new FormPage("/automation-practice-form");
    }
    public static AlertsWindowsPage buildAlertsWindowsPage() {
        return new AlertsWindowsPage("/browser-windows");
    }
    public static AlertsPage buildAlertsPage() {
        return new AlertsPage("/alerts");
    }
    public static FramesPage buildFramesPage() {
        return new FramesPage("/frames");
    }
    public static MenuPage buildMenuPage() {
        return new MenuPage("/menu");
    }
    public static SelectMenuPage buildSelectMenuPage() {
        return new SelectMenuPage("/select-menu");
    }
    public static SortablePage buildSortablePage(){
        return new SortablePage("/sortable");
    }
    public static SelectablePage buildSelectablePage(){
        return new SelectablePage("/selectable");
    }

}
