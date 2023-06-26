package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.VolunteerCreate;
import starter.java.VolunteerDelete;
import starter.java.VolunteerGetAll;
import starter.java.VolunteerGetById;

public class volunteerSteps {

    @Steps
    VolunteerCreate create = new VolunteerCreate();
    @Steps
    VolunteerDelete delete = new VolunteerDelete();
    @Steps
    VolunteerGetAll getAll = new VolunteerGetAll();
    @Steps
    VolunteerGetById getById = new VolunteerGetById();
    @Given("I set POST new volunteer api endpoints")
    public void setPostVolunteerEndpoint(){
        create.setPostApiEndpoint();
    }
    @When("I send POST new volunteer HTTP request")
    public void sendHttpPostRequest(){
        create.sendPostHttpRequest();
    }
    @When("I send POST new volunteer HTTP request with invalid data")
    public void sendHttpPostInvalidRequest(){
        create.sendPostInvalidHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse200(){
        create.receiveHttpResponseCode200();
    }
    @Then("I receive valid HTTP response code 500")
    public void receiveValidHttpResponse500(){
        create.receiveHttpResponseCode500();
    }
    @And("I receive valid post data for new volunteer")
    public void receiveValidPostVolunteer(){
        create.validateDataNewPost();
    }
    @Given("I set GET volunteer by id api endpoints")
    public void setGetVolunteerIdEndpoint(){
        getById.setApiEndpoint();
    }
    @When("I send GET volunteer by id HTTP request")
    public void sendHttpGetIdRequest(){
        getById.sendGetHttpRequest();
    }
    @And("I receive valid get data for single volunteer data")
    public void receiveValidGetDataVolunteer(){
        getById.validateDataSinglePost();
    }
    @Given("I set DELETE volunteer api endpoint")
    public void setDeleteVolunteerEndpoint(){
        delete.setApiEndpoint();
    }
    @When("I send DELETE volunteer HTTP request")
    public void sendHttpDeleteRequest(){
        delete.sendDeleteHttpRequest();
    }
    @Given("I set GET all volunteer api endpoints")
    public void setGetVolunteerAllEndpoint(){
        getAll.setApiEndpoint();
    }
    @When("I send GET all volunteer HTTP request")
    public void sendHttpGetAllRequest(){
        getAll.sendGetHttpRequest();
    }
    @And("I receive valid get data for all volunteer data")
    public void receiveValidGetVolunteerAll(){
        getAll.validateData();
    }

}
