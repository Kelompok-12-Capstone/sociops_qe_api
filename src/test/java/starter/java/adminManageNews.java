package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;

public class adminManageNews {

    protected String url = "https://sociops-backend-production.up.railway.app/";
    protected String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjUiLCJuYW1lIjoiUGFrIEpvaG4iLCJyb2xlIjoiQURNSU4iLCJleHAiOjE2ODc3MjY5ODN9.7WfpfZfxsKIkLfL6maSf_3OEpiciuAJMsuNYpUH0i90";

    @Step("I set POST api endpoints manage news admin")
    public String setPostEpManageNewsA() {
        return url + "news";
    }

    @Step("I set GET api endpoints all news")
    public String setGetEpAllNews() {
        return url + "news?page=1";
    }

    @Step("I set GET api endpoints news by id")
    public String setGetEpNewsByID() {
        return url + "news/12";
    }

    @Step("I set GET api endpoints news by out of bound ID")
    public String setGetEpNewsByOutOfBoundID() {
        return url + "news/1600";
    }

    @Step("I set GET api endpoints news by invalid ID")
    public String setGetEpNewsByInvalidID() {
        return url + "news/-12";
    }

    /// Positive
    @Step("I send POST HTTP request manage news admin correct format")
    public void sendPostReqManageNewsACorrect() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Seru!2 Salurkan Donasi");
        requestBody.put("description",
                "andira2 - Proin et euismod diam. Duis fermentum felis nisi");

        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEpManageNewsA()).then().statusCode(200);
    }

    @Step("I send GET HTTP request all news")
    public void sendGetReqAllNews() {
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .get(setGetEpAllNews());
    }

    @Step("I send GET HTTP request new by id")
    public void sendGetReqNewsByID() {
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .get(setGetEpNewsByID());
    }

    /// Negative
    @Step("I send POST HTTP request manage news admin without fill title payload")
    public void sendPostReqManageNewsANoInputTitle() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "");
        requestBody.put("description",
                "andira2 - Proin et euismod diam. Duis fermentum felis nisi");

        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEpManageNewsA()).then().statusCode(400);
    }

    @Step("I send POST HTTP request manage news admin without fill description payload")
    public void sendPostReqManageNewsANoInputDescription() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Seru!2 Salurkan Donasi");
        requestBody.put("description",
                "");

        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEpManageNewsA()).then().statusCode(400);
    }

    @Step("I send POST HTTP request manage news admin only fill 1 char in title payload")
    public void sendPostReqManageNewsA1CharTitle() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", " ");
        requestBody.put("description",
                "andira2 - Proin et euismod diam. Duis fermentum felis nisi");

        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEpManageNewsA()).then().statusCode(400);
    }

    @Step("I send POST HTTP request manage news admin only fill 1 char in description payload")
    public void sendPostReqManageNewsA1CharDescription() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Seru!2 Salurkan Donasi");
        requestBody.put("description",
                " ");

        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEpManageNewsA()).then().statusCode(400);
    }

    @Step("I send GET HTTP request new by out of bound id")
    public void sendGetReqNewsByOutOfBoundID() {
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .get(setGetEpNewsByOutOfBoundID());
    }

    @Step("I send GET HTTP request new by invalid id")
    public void sendGetReqNewsByInvalidID() {
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .get(setGetEpNewsByOutOfBoundID());
    }

    /// Response

    @Step("I receive HTTP response code 200 manage news admin")
    public void response200ManageNewsA() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive HTTP response code 400 manage news admin")
    public void response400ManageNewsA() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I receive HTTP response code 404 manage news admin")
    public void response404ManageNewsA() {
        restAssuredThat(response -> response.statusCode(404));
    }
}