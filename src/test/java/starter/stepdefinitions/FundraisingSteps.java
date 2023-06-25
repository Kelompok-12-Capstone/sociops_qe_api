package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.manageFundraising;

public class FundraisingSteps {
    @Steps
    manageFundraising manageFundraising;

    @Given("I set POST api endpoints manage fundraising admin")
    public void sendEndpoPostNew() {
        manageFundraising.endpointtosendFund();
    }

    @When("I send POST HTTP request manage the fundraising")
    public void sendReqPostNew() {
        manageFundraising.sendRequestNewFund();
    }

    @Then("I receive HTTP response code 200")
    public void receiveResponse() {
        manageFundraising.statusCodeReqFundManag();
    }

    @When("I send POST HTTP request with no desc program")
    public void sendPOSTNoDesc() {
        manageFundraising.requestPOSTNoDesc();
    }

    @Then("I receive HTTP response code 500")
    public void responsecodeNoDesc() {
        manageFundraising.statusnoDescReqFundManag();
    }

    @When("I send POST HTTP request without typing the type")
    public void sendReqNoreqPOST() {
        manageFundraising.sendPOSTNorequest();
    }

    @Then("I receive HTTP response code 400")
    public void responNoreqPOST() {
        manageFundraising.statusCodeNoReqPOST();
    }

    @When("I send POST HTTP request without fill the body request")
    public void sendReqNofillPOST() {
        manageFundraising.sendREQPOSTNOFILL();
    }

    @Given("I set GET all the category api endpoints manage fundraising admin")
    public void setGETallFund() {
        manageFundraising.setEndpointGetAllFund();
    }

    @When("I send GET HTTP request Accepted")
    public void sendReqGetAllFund() {
        manageFundraising.sendReqGetAllFund();
    }

    @Then("I receive GET all HTTP response code 200")
    public void responseCodeGetAllFund() {
        manageFundraising.statusCodeGetallFund();
    }

    @When("I send GET HTTP request Rejected")
    public void sendGetallRejectFund() {
        manageFundraising.sendReqGetAllRejectFund();
    }

    @When("I send GET HTTP request Pending")
    public void sendGetallPendingFund() {
        manageFundraising.sendReqGetallPendingFund();
    }

    @Given("I set GET fundraising api endpoints by ID")
    public void setendpointGetIDFund() {
        manageFundraising.setEndpointGetIdFund();
    }

    @When("I send GET ID HTTP request")
    public void sendGETIDReqFund() {
        manageFundraising.sendReqGetIdFund();
    }

    @Then("I receive GET by ID HTTP response code 200")
    public void statusCodeGetIdFund() {
        manageFundraising.statusCodeGetIdFund();
    }

    @Given("I set PATCH  api endpoints to manage status fundraising admin")
    public void setPATCHendpoin() {
        manageFundraising.setPATCHendpoint();
    }

    @When("I send PATCH HTTP request")
    public void sendReqPATCH() {
        manageFundraising.sendReqPatchFund();
    }

    @Then("I receive PATCH HTTP response code 200")
    public void statuscodePATCHFund() {
        manageFundraising.statuscodePATCHFund();
    }

    @Given("I set DELETE api endpoints manage fundraising admin")
    public void setDeleteEndpoint() {
        manageFundraising.setendpointDeleteFund();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteReq() {
        manageFundraising.sendReqDeleteFund();
    }

    @Then("I receive DELETE HTTP response code 200")
    public void statuscodeDeleteFund() {
        manageFundraising.statusCodeDeleteFund();
    }
}
