package com.example.auto.util;

import com.google.gson.JsonParser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {
    public static String getRequestBody(String key) throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("src/test/java/Request/Request.json"));
        JSONObject data = (JSONObject)object;
        Object body = data.get(key);
        return body.toString(); // returns JSON string
    }
}
