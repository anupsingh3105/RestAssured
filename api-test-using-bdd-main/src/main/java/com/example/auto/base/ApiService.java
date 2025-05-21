package com.example.auto.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;

import static com.example.auto.util.Util.getEnv;


public class ApiService {

    public ApiService(String baseUri) {
        RestAssured.baseURI = baseUri;
    }

    public HashMap<String, String> requestHeader() {
        HashMap<String, String> headers = new HashMap<>();
      //  headers.put("x-rapidapi-key", getEnv("secret_key"));
        //headers.put("x-rapidapi-host", getEnv("host_url"));
       // headers.put("Accept", "application/json");
        headers.put("x-api-key", "reqres-free-v1");

        return headers;
    }

    public Response getRequest(String endpoint) {

        return RestAssured.given().headers(requestHeader()).when().get(endpoint);
    }

    public Response postRequest(String endpoint, Object body) {
        return RestAssured.given().headers(requestHeader()).body(body).when().post(endpoint);
    }
}
