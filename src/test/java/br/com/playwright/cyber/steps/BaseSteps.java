package br.com.playwright.cyber.steps;

import br.com.playwright.cyber.pages.CheckoutPage;
import br.com.playwright.cyber.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseSteps {

	private HomePage homePage;
	private CheckoutPage checkoutPage;
	
	
	@Given("que acesso o site")
	public void queAcessoOSite() {
		homePage = new HomePage();
		homePage.navigate();
	}

	@When("add uma roupa no carrinho")
	public void addUmaRoupaNoCarrinho() {
	    homePage.addCart();
	}

	@And("dou checkout")
	public void douCheckout() {
		checkoutPage = homePage.preceedToCheckout();    
	}

	@Then("Visualizo minha roupa no sumario")
	public void visualizoMinhaRoupaNoSumario() {
	    checkoutPage.getProductName();
	}

}
