package starter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class Stepdefinitions {

    String baseUrl = "https://sociops-backend-production.up.railway.app";
    @Given("Admin call api for forgot send with payload")
    public void adminCallApiForForgotSendWithPayload() {

        JSONObject bodyrequest = new JSONObject();

        bodyrequest.put("email", "nailulizah@example.com");

        SerenityRest.given().contentType(ContentType.JSON).body(bodyrequest).post(baseUrl+"/auth/forgot/send").getStatusCode();
    }

    @Then("Verify status code {int}")
    public void verifyStatusCode(int statusCode) {
        Response response = SerenityRest.lastResponse();
        response.getStatusCode();
        response.then().statusCode(statusCode);
    }

    @Given("Admin call api for forgot verify with payload")
    public void adminCallApiForForgotVerifyWithPayload() {
        JSONObject bodyrequest = new JSONObject();

        bodyrequest.put("email", "nailulizah@example.com");
        bodyrequest.put("otp", "111111");


        SerenityRest.given().contentType(ContentType.JSON).body(bodyrequest).post(baseUrl+"/auth/forgot/verify").getStatusCode();
    }

    @Given("Admin call api for change password with payload")
    public void adminCallApiForChangePasswordWithPayload() {
        JSONObject bodyrequest = new JSONObject();

        bodyrequest.put("email", "nailulizah@example.com");
        bodyrequest.put("password", "123456788");
        bodyrequest.put("otp", "111111");


        SerenityRest.given().contentType(ContentType.JSON).body(bodyrequest).post(baseUrl+"/auth/forgot/change-password").getStatusCode();
    }
}
