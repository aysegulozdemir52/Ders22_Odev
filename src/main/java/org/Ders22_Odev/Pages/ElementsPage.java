package org.Ders22_Odev.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage extends BasePage{
    public SelenideElement buttonsClick = $("#item-4");
    public SelenideElement clickMeClick = $(".col-md-6 div:nth-of-type(3) > .btn");
    public SelenideElement clickMeText = $("#dynamicClickMessage");


    public ElementsPage(String pageUrl) {
        super(pageUrl);
    }
}