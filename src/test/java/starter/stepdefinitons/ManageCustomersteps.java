package starter.stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.GET_ManageCustomer;

public class ManageCustomersteps {

    @Steps
    GET_ManageCustomer getManageCustomer;


    //Get all user
    @Given("I set GET all user api endpoints")
    public void setGetAllUserApiEndpoints() {
        getManageCustomer.setGetAllUserApiEndpoints();
    }

    @When("I send GET all user HTTP request")
    public void sendGetAllUserHttpRequest() {
        getManageCustomer.sendGetAllUserHttpRequest();
    }

    @Then("I recive valid data")
    public void reciveValidData() {
        getManageCustomer.validateData();
    }

    //Get all user with param page

    @Given("I set GET all user1 api endpoints")
    public void setGetAllUser1ApiEndpoints() {
        getManageCustomer.setGetAllUser1ApiEndpoints();
    }

    @When("I send GET all user1 HTTP request")
    public void sendGetAllUser1HttpRequest() {
        getManageCustomer.sendGetAllUser1HttpRequest();
    }

    //Get all user with param size

    @Given("I set GET all user2 api endpoints")
    public void setGetAllUser2ApiEndpoints() {
        getManageCustomer.setGetAllUser2ApiEndpoints();
    }

    @When("I send GET all user2 HTTP request")
    public void sendGetAllUser2HttpRequest() {
        getManageCustomer.sendGetAllUser2HttpRequest();
    }

    //Get all user with params sort ascending

    @Given("I set GET all user3 api endpoints")
    public void setGetAllUser3ApiEndpoints() {
        getManageCustomer.setGetAllUser3ApiEndpoints();
    }

    @When("I send GET all user3 HTTP request")
    public void sendGetAllUser3HttpRequest() {
        getManageCustomer.sendGetAllUser3HttpRequest();
    }

    //Get all user with param sort descending

    @Given("I set GET all user4 api endpoints")
    public void setGetAllUser4ApiEndpoints() {
        getManageCustomer.setGetAllUser4ApiEndpoints();
    }

    @When("I send GET all user4 HTTP request")
    public void sendGetAllUser4HttpRequest() {
        getManageCustomer.sendGetAllUser4HttpRequest();
    }

    //Get all fundraising participants

    @Given("I set GET all fundraising participants api endpoints")
    public void setGetAllFundraisingApiEndpoints() {
        getManageCustomer.setGetAllFundraisingApiEndpoints();
    }

    @When("I send GET all fundraising participants HTTP request")
    public void sendGetAllFundraisingHttpRequest() {
        getManageCustomer.sendGetAllFundraisingParticipants();
    }

    //Get all volunteer participants

    @Given("I set GET all volunteer participants api endpoints")
    public void setGetAllVolunteerApiEndpoints() {
        getManageCustomer.setGetAllVolunteerApiEndpoints();
    }

    @When("I send GET all volunteer participants HTTP request")
    public void sendGetAllVolunteerHttpRequest() {
        getManageCustomer.sendGetAllVolunteerHttpRequest();
    }
}
