package com.templateproject.templateproject.client;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class WebClient {

    @Autowired
    private OkHttpClient client;

    public JSONObject call(Request req, String api) {
        JSONObject object = null;
        try {
            Response response = client.newCall(req).execute();
            if (response.code() == 200) {
                object = new JSONObject(response.body().string());
            } else {
                log.info("invalid response from {} API response {}, for request {}", api,
                        response.body().string(), req.toString());
            }
        } catch (IOException | JSONException e) {
            log.error("error while calling {} API error message: {}", api, e.getMessage());
        }
        return object;
    }

}
