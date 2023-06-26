package starter.user;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_ManageCustomer extends PageObject {

    protected String url = "https://sociops-backend-production.up.railway.app/";

    protected String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjIzIiwibmFtZSI6IkRpbWFzIiwicm9sZSI6IkFETUlOIiwiZXhwIjoxNjg3ODE0NDk5fQ.PBYPIEO4L9lWw5L7DFT0AuZkcOQo2zP5hpX6koUnd2s";

    //Get all user

    @Step("I set GET all user api endpoints")
    public String setGetAllUserApiEndpoints() {
        return url + "users";
    }

    @Step("I send GET all user HTTP request")
    public void sendGetAllUserHttpRequest() {
        SerenityRest.given().header("Authorization",
                "Bearer " + token)
                .when().get(setGetAllUserApiEndpoints());
    }

    @Step("I recive valid data")
    public void validateData() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Get all user with param page

    @Step("I set GET all user1 api endpoints")
    public String setGetAllUser1ApiEndpoints() {
        return url + "users?page=1";
    }

    @Step("I send GET all user1 HTTP request")
    public void sendGetAllUser1HttpRequest() {
        SerenityRest.given().header("Authorization",
                        "Bearer " + token)
                .when().get(setGetAllUser1ApiEndpoints());
    }

    //Get all user with param page size

    @Step("I set GET all user2 api endpoints")
    public String setGetAllUser2ApiEndpoints() {
        return url + "users?page_size=10";
    }

    @Step("I send GET all use2 HTTP request")
    public void sendGetAllUser2HttpRequest() {
        SerenityRest.given().header("Authorization",
                        "Bearer " + token)
                .when().get(setGetAllUser2ApiEndpoints());
    }

    //Get all user with param sort ascending

    @Step("I set GET all user3 api endpoints")
    public String setGetAllUser3ApiEndpoints() {
        return url + "users?sort=created_at_asc";
    }

    @Step("I send GET all user3 HTTP request")
    public void sendGetAllUser3HttpRequest() {
        SerenityRest.given().header("Authorization",
                        "Bearer " + token)
                .when().get(setGetAllUser3ApiEndpoints());
    }

    //Get all user with param sort descending

    @Step("I set GET all user4 api endpoints")
    public String setGetAllUser4ApiEndpoints() {
        return url + "users?sort=created_at_desc";
    }

    @Step("I send GET all user4 HTTP request")
    public void sendGetAllUser4HttpRequest() {
        SerenityRest.given().header("Authorization",
                        "Bearer " + token)
                .when().get(setGetAllUser4ApiEndpoints());
    }

    //Get all fundraising participants

    @Step("I set GET all fundraising participants api endpoints")
    public String setGetAllFundraisingApiEndpoints() {
        return url + "users/participants?campaign_type=FUNDRAISING";
    }

    @Step("I send GET all fundraising participants HTTP request")
    public void sendGetAllFundraisingParticipants() {
        SerenityRest.given().header("Authorization",
                "Bearer " + token).when().get(setGetAllFundraisingApiEndpoints());
    }

    //Get all volunteer participants

    @Step("I set GET all volunteer participants api endpoints")
    public String setGetAllVolunteerApiEndpoints() {
        return url + "users/participants?campaign_type=VOLUNTEER";
    }

    @Step("I send GET all volunteer participants HTTP request")
    public void sendGetAllVolunteerHttpRequest() {
        SerenityRest.given().header("Authorization",
                "Bearer " + token).when().get(setGetAllVolunteerApiEndpoints());
    }
}
