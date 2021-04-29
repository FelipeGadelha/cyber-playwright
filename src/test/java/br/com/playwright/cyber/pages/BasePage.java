package br.com.playwright.cyber.pages;

import com.microsoft.playwright.Page;

import br.com.playwright.cyber.core.BrowserFactory;

public abstract class BasePage {
	
	protected Page page;

	public BasePage() {
		page = BrowserFactory.initPage();
	}
	

}
