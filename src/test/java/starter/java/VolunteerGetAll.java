package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class VolunteerGetAll {
    protected static String url = "https://sociops-backend-production.up.railway.app/campaigns?page=1&page_size=100&type=FUNDRAISING&category=&status=ACCEPTED&sort=created_at_asc";

    @Step("I set GET all volunteer api endpoints")
    public String setApiEndpoint() {
        return url ;
    }
    @Step("I send GET all volunteer HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get data for all volunteer data")
    public void validateData() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
