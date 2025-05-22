package com.example.auto.util;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
//import org.json.JSONObject;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.List;

public class JsonRequestReader {

    public static String getRequestBody(String key) throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("src/test/java/Request/Request.json"));
        JSONObject data = (JSONObject) object;
        Object body = data.get(key);
        return body.toString(); // returns JSON string
    }
}
