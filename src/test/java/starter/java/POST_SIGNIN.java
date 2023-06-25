package starter.java;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_SIGNIN extends PageObject {

    protected String url = "https://sociops-backend-production.up.railway.app/auth/";

    @Step("I set POST sign in api endpoints")
    public String setPostSignInApiEndpoints() {
        return url + "signin";
    }

    @Step("I send POST sign in HTTP request")
    public void sendPostSignInHttpRequest() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "john@doe.com");
        requestBody.put("password", "JohnDoe123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignInApiEndpoints());
    }

    @Step("I recive valid data for login")
    public void validateDataForLogin() {
        restAssuredThat(response -> response.body("message", equalTo("SUCCESS")));
    }

    //NEGATIVE
    ///LOGIN_WITHOUT_PASSWORD

    @Step("I send POST sign in1 HTTP request")
    public void sendPostSignIn1HttpRequest() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "12345678");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignInApiEndpoints());
    }

    @Step("I recive valid HTTP response code 400")
    public void reciveHttpResponseCode400() {
        restAssuredThat(response-> response.statusCode(400));
    }

    //NEGATIVE
    ///LOGIN_WITH_UNREGIST_EMAIL

    @Step("I send POST sign in2 HTTP request")
    public void sendPostSignIn2HttpRequest() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "dimasrizqi@example.com");
        requestBody.put("password", "12345678");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignInApiEndpoints());
    }

    //NEGATIVE
    ///LOGIN_WITH_INCCORECT_TYPE_EMAIL

    @Step("I send POST sign in3 HTTP request")
    public void sendPostSignIn3HttpRequest() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "nailulizah12");
        requestBody.put("password", "12345678");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignInApiEndpoints());
    }

    //NEGATIVE
    ///LOGIN_WITHOUT_PASSWORD

    @Step("I send POST sign in4 HTTP request")
    public void sendPostSignIn4HttpRequest() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "nailulizah12@example.com");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignInApiEndpoints());
    }

    //NEGATIVE
    ///LOGIN_WITH_INCCORECT_TYPE_PASSWORD

    @Step("I send POST sign in5 HTTP request")
    public void sendPostSignIn5HttpRequest() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "nailulizah12@example.com");
        requestBody.put("password", "123456");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostSignInApiEndpoints());
    }

}
