package edu.eci.arsw.coronavirus.services;

import java.io.IOException;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

/**
 * @author Luis Amaya
 */
public interface CoronavirusStatsServices {
    JSONObject getCasesByCountry(String Country) throws UnirestException, IOException;
}
