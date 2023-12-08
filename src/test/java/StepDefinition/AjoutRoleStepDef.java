package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;
import PartieObject.AjoutRoleObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutRoleStepDef {
	WebDriver driver= Setup.driver;
	 AjoutRoleObject ajout_role= new AjoutRoleObject (driver);
	
	@Given("Cliquer sur le menu Roles")
	public void cliquer_sur_le_menu_roles() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Cliquer sur le bouton add role")
	public void cliquer_sur_le_bouton_add_role() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Remplir le nom de role")
	public void remplir_le_nom_de_role() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Choisir le permission")
	public void choisir_le_permission() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Cliquer sur le menu save")
	public void cliquer_sur_le_menu_save() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
