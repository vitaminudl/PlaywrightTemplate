package com.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;

public enum BrowserType {
    CHROMIUM("chromium"),
    FIREFOX("firefox"),
    WEBKIT("webkit");

    private final String browserName;

    BrowserType(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }

    public Browser launch(Playwright playwright) {
        switch (this) {
            case CHROMIUM:
                return playwright.chromium().launch();
            case FIREFOX:
                return playwright.firefox().launch();
            case WEBKIT:
                return playwright.webkit().launch();
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + this);
        }
    }
}
