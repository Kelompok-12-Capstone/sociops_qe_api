package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.adminManageNews;

public class adminManageNewsSteps {

    @Steps
    adminManageNews adminManageNews;

    //// Positive

    @Given("I set POST api endpoints manage news admin")
    public void setPostEpManageNews() {
        adminManageNews.setPostEpManageNewsA();
    }

    @Given("I set GET api endpoints all news")
    public void setGetEpAllNews() {
        adminManageNews.setGetEpAllNews();
    }

    @Given("I set GET api endpoints news by id")
    public void setGetEpNewsByID() {
        adminManageNews.setGetEpNewsByID();
    }

    @When("I send POST HTTP request manage news admin correct format")
    public void sendPostReqManageNewsACorrect() {
        adminManageNews.sendPostReqManageNewsACorrect();
    }

    @When("I send GET HTTP request all news")
    public void sendGetReqAllNews() {
        adminManageNews.sendGetReqAllNews();
    }

    @When("I send GET HTTP request new by id")
    public void sendGetReqNewsByID() {
        adminManageNews.sendGetReqNewsByID();
    }

    //// Negative

    @Given("I set GET api endpoints news by out of bound id")
    public void setGetEpNewsByOutOfBoundID() {
        adminManageNews.setGetEpNewsByOutOfBoundID();
    }

    @Given("I set GET api endpoints news by invalid id")
    public void setGetEpNewsByInvalidID() {
        adminManageNews.setGetEpNewsByInvalidID();
    }

    @When("I send POST HTTP request manage news admin without fill title payload")
    public void sendPostReqManageNewsANoInputTitle() {
        adminManageNews.sendPostReqManageNewsANoInputTitle();
    }

    @When("I send POST HTTP request manage news admin without fill description payload")
    public void sendPostReqManageNewsANoInputDescription() {
        adminManageNews.sendPostReqManageNewsANoInputDescription();
    }

    @When("I send POST HTTP request manage news admin only fill 1 char in title payload")
    public void sendPostReqManageNewsA1CharTitle() {
        adminManageNews.sendPostReqManageNewsA1CharTitle();
    }

    @When("I send POST HTTP request manage news admin only fill 1 char in description payload")
    public void sendPostReqManageNewsA1CharDescription() {
        adminManageNews.sendPostReqManageNewsA1CharDescription();
    }

    @When("I send GET HTTP request new by out of bound id")
    public void sendGetReqNewsByOutOfBoundID() {
        adminManageNews.sendGetReqNewsByOutOfBoundID();
    }

    @When("I send GET HTTP request new by invalid id")
    public void sendGetReqNewsByInvalidID() {
        adminManageNews.sendGetReqNewsByInvalidID();
    }

    /// Response

    @Then("I receive HTTP response code 200 manage news admin")
    public void response200ManageNewsA() {
        adminManageNews.response200ManageNewsA();
    }

    @Then("I receive HTTP response code 400 manage news admin")
    public void response400ManageNewsA() {
        adminManageNews.response400ManageNewsA();
    }

    @Then("I receive HTTP response code 404 manage news admin")
    public void response404ManageNewsA() {
        adminManageNews.response404ManageNewsA();
    }
}
