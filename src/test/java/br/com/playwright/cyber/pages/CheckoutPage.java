package br.com.playwright.cyber.pages;

public class CheckoutPage extends BasePage{

	
	public void getProductName() {
		page.textContent("xpath=p/a[class='product-name']");
	}
	
	
}
