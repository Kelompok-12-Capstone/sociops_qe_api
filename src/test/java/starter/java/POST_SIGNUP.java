package starter.java;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_SIGNUP extends PageObject {

    protected String url = "https://sociops-backend-production.up.railway.app/auth/";

    //POSITIVE
    ///VALIDENDPOINT

    @Step("I set POST sign up api endpoints")
    public String setPostSignUpApiEndpoints() {
        return url + "signup";
    }

    @Step("I send POST sign up HTTP request")
    public void sendPostSignUpHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "dimas");
        requestBody.put("email", "dimasrizqi48@example.com");
        requestBody.put("password", "12345678");
        requestBody.put("role", "ADMIN");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignUpApiEndpoints());
    }

    @Step("I recive valid HTTP response code 201")
    public void reciveValidHttpResponseCode201() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I recive valid data for new user")
    public void validateDataForNewUser() {
        restAssuredThat(response -> response.body("message", equalTo("SUCCESS")));
    }

    //NEGATIVE
    ///INCORRECT_EMAIL_TYPE



    @Step("I send POST sign up1 HTTP request")
    public void sendPostSignUp1HttpRequest() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "dimas");
        requestBody.put("email", "dimasrizqis");
        requestBody.put("password", "12345678");
        requestBody.put("role", "ADMIN");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignUpApiEndpoints());
    }

    @Step("I recive invalid HTTP response code 400")
    public void reciveHttpResponseCode400() {
        restAssuredThat(response-> response.statusCode(400));
    }

    //NEGATIVE
    ///EXIST_EMAIL



    @Step("I send POST sign up2 HTTP request")
    public void sendPostSignUp2HttpRequest() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "dimas");
        requestBody.put("email", "nailulizah@example.com");
        requestBody.put("password", "12345678");
        requestBody.put("role", "ADMIN");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignUpApiEndpoints());
    }

    //NEGATIVE
    ///INCCORECT_PASSWORD_TYPE



    @Step("I send POST sign up3 HTTP request")
    public void sendPostSignUp3HttpRequest() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "dimas");
        requestBody.put("email", "dimasrizqis");
        requestBody.put("password", "12345");
        requestBody.put("role", "ADMIN");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignUpApiEndpoints());
    }

    //NEGATIVE
    ///WITHOUT_NAME

    @Step("I send POST sign up4 HTTP request")
    public void sendPostSignUp4HttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        requestBody.put("email", "dimasrizqi87@example.com");
        requestBody.put("password", "12345678");
        requestBody.put("role", "ADMIN");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignUpApiEndpoints());
    }

    //NEGATIVE
    ///WITH_INCCORECT_TYPE_ROLE
    @Step("I send POST sign up5 HTTP request")
    public void sendPostSignUp5HttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "dimas");
        requestBody.put("email", "dimasrizqi8@example.com");
        requestBody.put("password", "12345678");
        requestBody.put("role", "admin");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignUpApiEndpoints());
    }

    //NEGATIVE
    ///WITHOUT_ROLE

    @Step("I send POST sign up6 HTTP request")
    public void sendPostSignUp6HttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "dimas");
        requestBody.put("email", "dimasrizqi87@example.com");
        requestBody.put("password", "12345678");
        requestBody.put("role", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignUpApiEndpoints());
    }

    //NEGATIVE
    ///WITHOUT_EMAIL

    @Step("I send POST sign up7 HTTP request")
    public void sendPostSignUp7HttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "dimas");
        requestBody.put("email", "");
        requestBody.put("password", "12345678");
        requestBody.put("role", "ADMIN");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignUpApiEndpoints());
    }

    //NEGATIVE
    ///WITHOUT_PASSWORD

    @Step("I send POST sign up8 HTTP request")
    public void sendPostSignUp8HttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "dimas");
        requestBody.put("email", "dimasrizqi87@example.com");
        requestBody.put("password", "");
        requestBody.put("role", "ADMIN");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignUpApiEndpoints());
    }
}
