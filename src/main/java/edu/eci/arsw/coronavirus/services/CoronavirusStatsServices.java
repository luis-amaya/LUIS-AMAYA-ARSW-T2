package edu.eci.arsw.coronavirus.services;

import java.io.IOException;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public interface CoronavirusStatsServices {
    JSONObject getCasesByCity(String city) throws UnirestException, IOException;
}
