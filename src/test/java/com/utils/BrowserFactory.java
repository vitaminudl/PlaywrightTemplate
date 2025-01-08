package com.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;

public class BrowserFactory {
    private static Playwright playwright;
    private static Browser browser;

    public static Browser getBrowser(BrowserType browserType) {
        if (browser == null) {
            playwright = Playwright.create();
            browser = browserType.launch(playwright);
        }
        return browser;
    }

    public static void closeBrowser() {
        if (browser != null) {
            browser.close();
            playwright.close();
        }
    }
}
