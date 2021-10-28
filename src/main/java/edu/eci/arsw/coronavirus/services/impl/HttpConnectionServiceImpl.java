package edu.eci.arsw.coronavirus.services.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import edu.eci.arsw.coronavirus.services.HttpConnectionService;

@Service
public class HttpConnectionServiceImpl implements HttpConnectionService {

    @Override
    public JSONObject connection(String city) throws UnirestException {
        HttpResponse<String> httpResponse = Unirest
                .get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?q=" + city
                        + "&appid=504445ef39msh69e7f3fa7718f84p11f7e6jsn9375a37e90a9")
                .asString();

        return new JSONObject(httpResponse.getBody());
    }

}
