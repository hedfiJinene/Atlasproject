package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;
import PartieObject.LogInObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LogInStepDef {
	  WebDriver driver= Setup.driver;
		  LogInObject connecter= new LogInObject(driver);
	
		  @Given("Saisir le lien {string}")
		  public void saisir_le_lien(String string) {
		     connecter.saisirUrl(string);
		  }

		  @When("Saisir E-mail {string}")
		  public void saisir_e_mail(String string) {
		     connecter.saisirMail(string);
		  }

		  @When("Saisir le mot de passe {string}")
		  public void saisir_le_mot_de_passe(String string) {
		     connecter.saisirMdp(string);
		  }

		  @When("Cliquer sur le bouton login")
		  public void cliquer_sur_le_bouton_login() {
		    connecter.Cliquelogin();
		  }

		  @When("Cliquer sur le bouton Dashboard")
		  public void cliquer_sur_le_bouton_dashboard() {
		     connecter.CliqueDashboard();
		  }

		  @Then("Vérifier l'url obtenue {string}")
		  public void vérifier_l_url_obtenue(String string) {
		     connecter.Vérifier_URL(string);
		  }

	}




