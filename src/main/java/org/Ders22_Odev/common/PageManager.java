package org.Ders22_Odev.common;

import org.Ders22_Odev.drivers.DriverFactory;
import org.Ders22_Odev.Pages.ElementsPage;
import org.Ders22_Odev.Pages.WebTablesPage;

public class PageManager {
    public WebTablesPage webTablesPage;

    public ElementsPage elementsPage;

    public PageManager() {

        DriverFactory.initDriver();

        webTablesPage = PageFactory.buildWebTablesPage();
        elementsPage = PageFactory.buildElementsPage();

    }
}