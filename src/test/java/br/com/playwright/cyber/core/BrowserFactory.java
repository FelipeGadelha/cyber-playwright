package br.com.playwright.cyber.core;

import java.util.Objects;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import br.com.playwright.cyber.runners.RunnerTest;

public class BrowserFactory {
	
	private static Playwright playwright;
	private static Browser browser;
	private static Page page;
	
	private BrowserFactory() {	}
	
	
	public static Page initPage() {
		if (Objects.isNull(playwright))	playwright = Playwright.create();
		
		boolean headless = RunnerTest.HEADLESS;
		browser = RunnerTest.BROWSER
				.instance(playwright)
				.launch(new LaunchOptions()
						.setHeadless(headless));
		
		if (Objects.isNull(page)) page = browser.newPage();
		return page;
	}
}
