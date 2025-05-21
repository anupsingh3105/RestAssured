package com.example.auto.util;

import io.github.cdimascio.dotenv.Dotenv;

public class Util {

    public static String getEnv(String key) {
        try {
            Dotenv dotenv = Dotenv.configure().directory(System.getProperty("user.dir") + "/").filename("secret.env").load();
            return dotenv.get(key);
        } catch (Exception e) {
            System.err.println("Not able to fetch env value.");
            return null;
        }
    }
}
