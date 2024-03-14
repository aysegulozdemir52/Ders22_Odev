package org.Ders22_Odev.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage extends BasePage {
    public SelenideElement addButtonClick = $("#addNewRecordButton");
    public SelenideElement nameDoldur = $("#firstName");
    public SelenideElement surNameDoldur = $("#lastName");
    public SelenideElement emailDoldur = $("#userEmail");
    public SelenideElement ageDoldur = $("#age");
    public SelenideElement salaryDoldur = $("#salary");
    public SelenideElement departmentDoldur = $("#department");
    public SelenideElement submitClick = $("#submit");
    public SelenideElement duzenle = $("span#edit-record-4");
    public SelenideElement newAge = $("div.rt-table > div.rt-tbody > div:nth-child(4) > div > div:nth-child(3)");
    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }
}