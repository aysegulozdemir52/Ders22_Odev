package org.Ders22_Odev.common;

import org.Ders22_Odev.Pages.ElementsPage;
import org.Ders22_Odev.Pages.WebTablesPage;

public class PageFactory {

    public static WebTablesPage buildWebTablesPage() {

        return new WebTablesPage("/webtables");
    }

    public static ElementsPage buildElementsPage() {
        return new ElementsPage("/elements");
    }
}