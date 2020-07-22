
import AppPages.HomePage;
import AppPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepdefs extends Util {

    @Given("the user is in the home page and click sign in")
    public void theUserIsInTheHomePageAndClickSignIn() {
        driver.navigate().to(Util.BASE_URL);
        home = new HomePage(driver);
        home.signIn();
    }

    @When("the authetication page is opened")
    public void theAutheticationPageIsOpened() {
     LoginPage login= home.signIn();
     Assert.assertEquals(login.getPageTitle(),Util.LOGIN_PAGE_TITLE,"Error in opening the AUTHENTICATION page !" );
     Assert.assertEquals(true,login.checkEmailField().isDisplayed(),"The Email filed is not displayed!");
     Assert.assertEquals(true,login.checkCreateButton().isDisplayed(),"The create account button is not displayed!");
    }

    @Then("the user enter a valid email and press create an account")
    public void theUserEnterAValidEmailAndPressCreateAnAccount() {
        LoginPage login= home.signIn();
        login.createAccount(Util.VALID_EMAIL);
    }

    @When("the form to fill in the data appears")
    public void theFormToFillInTheDataAppears() {
        LoginPage login= home.signIn();
        Assert.assertEquals(login.getSubheading(),Util.PAGE_SUBHEADING,"The form is not displayed!");

    }

    @Then("the user enter all his personal informations and click register")
    public void theUserEnterAllHisPersonalInformationsAndClickRegister() {

    }

    @Then("the account is succesfuly created")
    public void theAccountIsSuccesfulyCreated() {

    }



}
