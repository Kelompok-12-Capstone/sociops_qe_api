package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.hasKey;

public class manageFundraising {
    protected static String url = "https://sociops-backend-production.up.railway.app/campaigns";
    protected static String geturl = "https://sociops-backend-production.up.railway.app/campaigns?page=1&page_size=100&type=FUNDRAISING&category=&status=ACCEPTED&sort=created_at_asc";
    protected String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjUiLCJuYW1lIjoiUGFrIEpvaG4iLCJyb2xlIjoiQURNSU4iLCJleHAiOjE2ODc3NTY4NDl9.ZGISTK0W_eRQusdlGvG_OpQKZrsOz-43RPTl6LL1y4A";

    @Step
    public String endpointtosendFund() {
        return url;
    }

    // EROR//
    @Step
    public void sendRequestNewFund() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "[DATA TEST] Inovasi untuk Masa Depan: Mendukung Riset dan Teknologi");
        requestBody.put("category_id", 12);
        requestBody.put("description",
                "[DATA TEST] Kami berkomitmen untuk mendukung riset dan teknologi sebagai sumber inovasi untuk masa depan. Kami memfasilitasi pengembangan penelitian, pembiayaan startup teknologi, dan kolaborasi antara ilmuwan, insinyur, dan komunitas teknologi untuk menciptakan solusi berkelanjutan.");
        requestBody.put("about", "XXX");
        requestBody.put("story", "XXX");
        requestBody.put("proposal", "XXX");
        requestBody.put("image", "XXX");
        requestBody.put("video", "XXX");
        requestBody.put("hashtag", "[DATA TEST] #InovasiMasaDepan");
        requestBody.put("target_recipient", "[DATA TEST] Riset dan teknologi inovatif");
        requestBody.put("location", "[DATA TEST] Silicon Valley, Amerika Serikat");
        requestBody.put("start_date", "2023-10-14T14:56:18.732Z");
        requestBody.put("end_date", "2023-12-14T14:56:18.732Z");
        requestBody.put("target_donation", 10000000);
        requestBody.put("total_action_donation", 50000);
        requestBody.put("detail_action_donation",
                "[DATA TEST] Setiap donasi akan digunakan untuk mendukung riset inovatif, pembiayaan startup teknologi, dan program kolaborasi di bidang riset dan teknologi.");
        requestBody.put("type", "FUNDRAISING");
        requestBody.put("status", "");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(endpointtosendFund());
    }

    @Step
    public void requestPOSTNoDesc() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "");
        requestBody.put("category_id", 0);
        requestBody.put("description", "");
        requestBody.put("story", "");
        requestBody.put("proposal", "");
        requestBody.put("image", "");
        requestBody.put("video", "");
        requestBody.put("hashtag", "");
        requestBody.put("target_recipient", "");
        requestBody.put("location", "");
        requestBody.put("start_date", "");
        requestBody.put("end_date", "");
        requestBody.put("target_donation", "");
        requestBody.put("total_action_donation", "");
        requestBody.put("detail_action_donation", "");
        requestBody.put("detail_action", "");
        requestBody.put("type", "FUNDRAISING");
        requestBody.put("status", "");

        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(endpointtosendFund());
    }

    @Step
    public void sendPOSTNorequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("", "");

        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(endpointtosendFund());
    }

    @Step
    public void sendREQPOSTNOFILL() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(endpointtosendFund());
    }

    @Step
    public String setEndpointGetAllFund() {
        return geturl;
    }

    @Step
    public void sendReqGetAllFund() {
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .queryParam("status", "ACCEPTED")
                .get(setEndpointGetAllFund());
    }

    @Step
    public void sendReqGetAllRejectFund() {
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .queryParam("status", "REJECTED")
                .get(setEndpointGetAllFund());
    }

    @Step
    public void sendReqGetallPendingFund() {
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .queryParam("status", "PENDING")
                .get(setEndpointGetAllFund());
    }

    @Step
    public String setEndpointGetIdFund() {
        return url + "/23";
    }

    @Step
    public void sendReqGetIdFund() {
        SerenityRest.given()
                .get(endpointtosendFund());
    }

    @Step
    public String setPATCHendpoint() {
        return url + "/33";
    }

    @Step
    public void sendReqPatchFund() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("status", "REJECTED");
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .patch(setPATCHendpoint());
    }

    @Step
    public String setendpointDeleteFund() {
        return url + "/28";
    }

    @Step
    public void sendReqDeleteFund() {
        SerenityRest.given().header("Authorization", "Bearer "
                + token)
                .header("Content-Type", "application/json")
                .delete(setendpointDeleteFund());
    }

    // Response

    @Step
    public void statusCodeReqFundManag() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step
    public void statusnoDescReqFundManag() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step
    public void statusCodeNoReqPOST() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step
    public void statusCodeGetallFund() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step
    public void statusCodeGetIdFund() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step
    public void statuscodePATCHFund() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step
    public void statusCodeDeleteFund() {
        restAssuredThat(response -> response.statusCode(200));
    }
}