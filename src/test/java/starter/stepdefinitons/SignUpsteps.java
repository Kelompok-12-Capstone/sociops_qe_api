package starter.stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.POST_SIGNUP;

public class SignUpsteps {

    @Steps
    POST_SIGNUP postSignup;

    ///VALID_ENDPPOINT
    @Given("I set POST sign up api endpoints")
    public void setPostSignUpApiEndpoints() {
        postSignup.setPostSignUpApiEndpoints();
    }

    @When("I send POST sign up HTTP request")
    public void sendPostSignUpHttpRequest() {
        postSignup.sendPostSignUpHttpRequest();
    }

    @And("I recive valid HTTP response code 201")
    public void reciveValidHttpResponseCode201() {
        postSignup.reciveValidHttpResponseCode201();
    }

    @Then("I recive valid data for new user")
    public void reciveValidDataForNewUser() {
        postSignup.validateDataForNewUser();
    }

    ///INCORRECT_EMAIL_TYPE



    @When("I send POST sign up1 HTTP request")
    public void sendPostSignUp1HttpRequest() {
        postSignup.sendPostSignUp1HttpRequest();
    }

    @And("I recive invalid HTTP response code 400")
    public void reciveInvalidHttResponseCode400() {
        postSignup.reciveHttpResponseCode400();
    }

    ///EXIST_EMAIL_TYPE



    @When("I send POST sign up2 HTTP request")
    public void sendPostSignUp2HttpRequest() {
        postSignup.sendPostSignUp2HttpRequest();
    }

    ///INCOREECT_PASSWORD_TYPE



    @When("I send POST sign up3 HTTP request")
    public void sendPostSignUp3HttpRequest() {
        postSignup.sendPostSignUp3HttpRequest();
    }

    //NEGATIVE
    ///WITHOUT_NAME

    @When("I send POST sign up4 HTTP request")
    public void sendPostSignUp4HttpRequest() {
        postSignup.sendPostSignUp4HttpRequest();
    }

    //NEGATIVE
    ///WITH_INCORRECT_TYPE_ROLE

    @When("I send POST sign up5 HTTP request")
    public void sendPostSignUp5HttpRequest() {
        postSignup.sendPostSignUp5HttpRequest();
    }

    //NEGATIVE
    ///WITHOUT_ROLE

    @When("I send POST sign up6 HTTP request")
    public void sendPostSignUp6HttpRequest() {
        postSignup.sendPostSignUp6HttpRequest();
    }

    //NEGATIVE
    ///WITHOUT_EMAIL

    @When("I send POST sign up7 HTTP request")
    public void sendPostSignUp7HttpRequest() {
        postSignup.sendPostSignUp7HttpRequest();
    }

    //NEGATIVE
    ///WITHOUT_PASSWORD

    @When("I send POST sign up8 HTTP request")
    public void sendPostSignUp8HttpRequest() {
        postSignup.sendPostSignUp8HttpRequest();
    }
}
