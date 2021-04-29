package br.com.playwright.cyber.core;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public enum Browsers {
	CHROME("chrome") {
		@Override
		public BrowserType instance(Playwright play) {
			return play.chromium();
		}
	}, 
	FIREFOX("firefox") {
		@Override
		public BrowserType instance(Playwright play) {
			return play.firefox();
		}
	};
	
	private String browser;
	
	Browsers(String browser) {
		this.browser = browser;
	}
	
	public String getBrowser() {
		return browser;
	}
	
	public abstract BrowserType instance(Playwright play);

}
