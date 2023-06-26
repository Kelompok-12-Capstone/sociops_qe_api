package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class VolunteerDelete {
    protected static String url = "https://sociops-backend-production.up.railway.app/campaigns/21";

    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYiLCJuYW1lIjoiTmFpbHVsIEl6YWgiLCJyb2xlIjoiQURNSU4iLCJleHAiOjE2ODc3OTQyMjB9.BjWypKJfAM2cQZdPOxrY1o2cGwlbYs_CRmAD_TWZ3zg";

    @Step("I set DELETE volunteer api endpoint")
    public String setApiEndpoint() {
        return url;
    }
    @Step("I send DELETE volunteer HTTP request")
    public void sendDeleteHttpRequest() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given().header("Authorization", "Bearer "
                        + token)
                .header("Content-Type", "application/json")
                .delete(setApiEndpoint()).then().statusCode(200);
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
