package com.java.assesement.country;

import com.google.gson.Gson;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mohamed fawzy
 */
public class ApiClient {

    public static Country getCountryInfo() throws IOException {
        Request request = new Request.Builder()
            .url("https://get.geojs.io/v1/ip/country.json")
            .build();
        OkHttpClient client = new OkHttpClient.Builder().build();
        Call call = client.newCall(request);
        Response response = call.execute();
        Map<String ,String> responseBody = new Gson().fromJson(new String(response.body().bytes()), HashMap.class);
        String name = String.valueOf(responseBody.get("name"));
        String country = String.valueOf(responseBody.get("country"));
        String ip = String.valueOf(responseBody.get("ip"));
        return new Country(name, country, ip);
    }
}
