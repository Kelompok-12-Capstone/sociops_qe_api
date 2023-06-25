package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.POST_SIGNIN;

public class SignInsteps {

    @Steps
    POST_SIGNIN postSignin;

    @Given("I set POST sign in api endpoints")
    public void setPostSignInApiEndpoints() {
        postSignin.setPostSignInApiEndpoints();
    }

    @When("I send POST sign in HTTP request")
    public void sendPostSignInHttpRequest() {
        postSignin.sendPostSignInHttpRequest();
    }

    @Then("I recive valid data for login")
    public void reciveValidDataForLogin() {
        postSignin.validateDataForLogin();
    }

    //NEGATIVE
    ///LOGIN_WITHOUT_EMAIL

    @When("I send POST sign in1 HTTP request")
    public void sendPostSignIn1HttpRequest() {
        postSignin.sendPostSignIn1HttpRequest();
    }

    @And("I recive valid HTTP response code 400")
    public void reciveValidHttpResponseCode404() {
        postSignin.reciveHttpResponseCode400();
    }

    //NEGATIVE
    ///LOGIN_WITH_UNREGIST_EMAIL

    @When("I send POST sign in2 HTTP request")
    public void sendPostSignIn2HttpRequest() {
        postSignin.sendPostSignIn2HttpRequest();
    }

    //NEGATIVE
    ///LOGIN_WITH_INCCORECT_TYPE_EMAIL

    @When("I send POST sign in3 HTTP request")
    public void sendPostSignIn3HttpRequest() {
        postSignin.sendPostSignIn3HttpRequest();
    }

    //NEGETIV
    ///LOGIN_WITHOUT_PASSWORD

    @When("I send POST sign in4 HTTP request")
    public void sendPostSignIn4HttpRequest() {
        postSignin.sendPostSignIn4HttpRequest();
    }

    //NEGATIVE
    ///LOGIN_WITH_INCCORCT_TYPE_PASSWORD

    @When("I send POST sign in5 HTTP request")
    public void sendPostSignIn5HttpRequest() {
        postSignin.sendPostSignIn5HttpRequest();
    }
}
