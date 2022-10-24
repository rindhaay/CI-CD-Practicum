package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class AdminSteps {
    @Steps
    LoginPage loginpage;

    @Steps
    HomePage homepage;
    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginpage.openPage();
    }
    @When("I input valid username")
    public void inputValidUsername() {
        loginpage.inputUsername("Admin");
    }
    @And("I input valid password")
    public void inputValidPassword(){
        loginpage.inputPassword("admin123");
    }
    @And("I click login button")
    public void clickLoginButton(){
        loginpage.clickLoginButton();
    }
    @And("I am on the home page")
    public void onTheHomePage(){
        homepage.validateOnHomePage();
    }
    @Then("I click admin page")
    public void clickAdminPage(){
        homepage.clickAdminButton();
    }
}
