package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class VolunteerGetById {
    protected static String url = "https://sociops-backend-production.up.railway.app/campaigns/20";

    @Step("I set GET volunteer by id api endpoints")
    public String setApiEndpoint() {
        return url;
    }
    @Step("I send GET volunteer by id HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get data for single volunteer data")
    public void validateDataSinglePost() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
