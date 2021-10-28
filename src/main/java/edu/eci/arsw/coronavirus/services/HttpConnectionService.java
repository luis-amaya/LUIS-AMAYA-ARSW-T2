package edu.eci.arsw.coronavirus.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

/**
 * @author Luis Amaya
 */
public interface HttpConnectionService {
    JSONObject connection(String city) throws UnirestException;
}
