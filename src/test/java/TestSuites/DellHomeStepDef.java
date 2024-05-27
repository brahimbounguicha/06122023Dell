package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.DellHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DellHomeStepDef {
	@Given("admin is on homepage")
	public void admin_is_on_homepage() throws Exception {
	Config.confchrome();
	Config.driver = new ChromeDriver();
	Config.maximisewindow();
	Config.driver.get(Utils.getproprety("Web_Link"));
	}

	@When("admin mousehover on menu {string} and submenu {string}")
	public void admin_mousehover_on_menu_and_submenu(String menuName, String subMenuName) throws Exception {
	    DellHome page = new DellHome();
	    page.mouseHoverOnMenuByName(menuName, subMenuName);
	}

	@When("admin click on product {string}")
	public void admin_click_on_product(String produitName) {
		 DellHome page = new DellHome();
		 page.clickOnProduit(produitName);
	}

	@Then("admin is directed to the page {string}")
	public void admin_is_directed_to_the_page(String NomProduit) {
		DellHome page = new DellHome();
		String ActualMessage = page.verifMessage();
		Assert.assertEquals(NomProduit, ActualMessage);
	    
	}

}
