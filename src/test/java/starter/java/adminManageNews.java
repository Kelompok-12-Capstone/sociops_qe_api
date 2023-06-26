package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;

public class adminManageNews {

    protected String url = "https://sociops-backend-production.up.railway.app/";
    protected String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjUiLCJuYW1lIjoiUGFrIEpvaG4iLCJyb2xlIjoiQURNSU4iLCJleHAiOjE2ODc4MTQ0ODl9.oCZZPLmsD1_9-4lpjfAdxtv2YLdDmhQJ0IVkeBIRl_c";

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
        requestBody.put("title", "[DATA TEST] Inovasi untuk Masa Depan: Menggagas Solusi Baru untuk Tantangan Global");
        requestBody.put("description",
                "andira2 - [DATA TEST] Jakarta, 25 Juni 2023 - Inovasi menjadi kunci dalam menghadapi tantangan global yang semakin kompleks. Dalam konferensi inovasi yang diadakan hari ini, para pemimpin, ilmuwan, dan inovator berkumpul untuk berbagi gagasan dan solusi baru yang dapat membawa perubahan positif di berbagai bidang.");

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
                "andira2 - [DATA TEST] Jakarta, 25 Juni 2023 - Inovasi menjadi kunci dalam menghadapi tantangan global yang semakin kompleks. Dalam konferensi inovasi yang diadakan hari ini, para pemimpin, ilmuwan, dan inovator berkumpul untuk berbagi gagasan dan solusi baru yang dapat membawa perubahan positif di berbagai bidang.");

        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEpManageNewsA()).then().statusCode(400);
    }

    @Step("I send POST HTTP request manage news admin without fill description payload")
    public void sendPostReqManageNewsANoInputDescription() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "[DATA TEST] Inovasi untuk Masa Depan: Menggagas Solusi Baru untuk Tantangan Global");
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
                "andira2 - [DATA TEST] Jakarta, 25 Juni 2023 - Inovasi menjadi kunci dalam menghadapi tantangan global yang semakin kompleks. Dalam konferensi inovasi yang diadakan hari ini, para pemimpin, ilmuwan, dan inovator berkumpul untuk berbagi gagasan dan solusi baru yang dapat membawa perubahan positif di berbagai bidang.");

        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEpManageNewsA()).then().statusCode(400);
    }

    @Step("I send POST HTTP request manage news admin only fill 1 char in description payload")
    public void sendPostReqManageNewsA1CharDescription() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "[DATA TEST] Inovasi untuk Masa Depan: Menggagas Solusi Baru untuk Tantangan Global");
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