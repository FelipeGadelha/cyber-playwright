package br.com.playwright.cyber.pages;

public class HomePage extends BasePage {

	private String url = "http://automationpractice.com/index.php";
	
	public void navigate() {
		page.navigate(url);
	}
	
	public void search(String text) {
		page.fill("[aria-label='Enter your search term']", text);
		page.press("[aria-label='Enter your search term']", "Enter");
	}

	public void addCart() {
		
		if(page.isVisible("")) {
			System.err.println("------------- true");
		}
		System.err.println("------------- false");
		
		page.hover("//html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[1]/div/a[2]/span");
		page.click("//html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[1]/div/a[2]/span");
	}

	public CheckoutPage preceedToCheckout() {
		page.click("//a[class='btn btn-default button button-medium']");
		return new CheckoutPage();
	}
	
}
