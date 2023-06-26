package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class VolunteerCreate {
    protected static String url = "https://sociops-backend-production.up.railway.app/campaigns";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYiLCJuYW1lIjoiTmFpbHVsIEl6YWgiLCJyb2xlIjoiQURNSU4iLCJleHAiOjE2ODc3OTQyMjB9.BjWypKJfAM2cQZdPOxrY1o2cGwlbYs_CRmAD_TWZ3zg";
    @Step("I set POST new volunteer features endpoints")
    public String setPostApiEndpoint() {
        return url ;
    }
    @Step("I send POST new volunteer HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","[DATA TEST] Inovasi untuk Masa Depan: Mendukung Riset dan Teknologi");
        requestBody.put("category_id",12);
        requestBody.put("description","[DATA TEST] Kami berkomitmen untuk mendukung riset dan teknologi sebagai sumber inovasi untuk masa depan. Kami memfasilitasi pengembangan penelitian, pembiayaan startup teknologi, dan kolaborasi antara ilmuwan, insinyur, dan komunitas teknologi untuk menciptakan solusi berkelanjutan.");
        requestBody.put("image","XXX");
        requestBody.put("video","XXX");
        requestBody.put("hashtag","[DATA TEST] #InovasiMasaDepan");
        requestBody.put("location","xxx");
        requestBody.put("start_date","2023-06-14T14:56:18.732Z");
        requestBody.put("end_date","2023-06-14T14:56:18.732Z");
        requestBody.put("detail_action","[DATA TEST] Setiap donasi akan digunakan untuk mendukung riset inovatif, pembiayaan startup teknologi, dan program kolaborasi di bidang riset dan teknologi.");
        requestBody.put("type","VOLUNTEER");
        requestBody.put("status","");

        SerenityRest.given().header("Authorization", "Bearer "
                        + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoint()).then().statusCode(200);
    }
    @Step("I send POST new volunteer HTTP request with invalid data")
    public void sendPostInvalidHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","[DATA TEST] Inovasi untuk Masa Depan: Mendukung Riset dan Teknologi");
        requestBody.put("category_id",99);
        requestBody.put("description","[DATA TEST] Kami berkomitmen untuk mendukung riset dan teknologi sebagai sumber inovasi untuk masa depan. Kami memfasilitasi pengembangan penelitian, pembiayaan startup teknologi, dan kolaborasi antara ilmuwan, insinyur, dan komunitas teknologi untuk menciptakan solusi berkelanjutan.");
        requestBody.put("image","XXX");
        requestBody.put("video","XXX");
        requestBody.put("hashtag","[DATA TEST] #InovasiMasaDepan");
        requestBody.put("location","xxx");
        requestBody.put("start_date","2023-06-14T14:56:18.732Z");
        requestBody.put("end_date","2023-06-14T14:56:18.732Z");
        requestBody.put("detail_action","[DATA TEST] Setiap donasi akan digunakan untuk mendukung riset inovatif, pembiayaan startup teknologi, dan program kolaborasi di bidang riset dan teknologi.");
        requestBody.put("type","VOLUNTEER");
        requestBody.put("status","");

        SerenityRest.given().header("Authorization", "Bearer "
                        + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoint()).then().statusCode(500);
    }


    @Step("I receive valid HTTP response code 200")
    public void receiveHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response code 500")
    public void receiveHttpResponseCode500() {
        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("I receive valid post data for new volunteer")
    public void validateDataNewPost() {
        restAssuredThat(response -> response.body("data",notNullValue()));;
    }
}
