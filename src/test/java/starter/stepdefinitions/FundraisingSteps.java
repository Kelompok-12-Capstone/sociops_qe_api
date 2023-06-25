package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.*;
public class FundraisingSteps {
    @Steps
    manageFundraising manageFundraising;

    @Given ("I set POST api endpoints manage fundraising admin")
    public void sendEndpoPostNew(){
        manageFundraising.endpointtosendFund();
    }
    @When ("I send POST HTTP request manage the fundraising")
    public void sendReqPostNew(){
        manageFundraising.sendRequestNewFund();
    }
    @Then ("I receive HTTP response code 200")
    public void receiveResponse(){
        manageFundraising.statusCodeReqFundManag();
    }
}