package edu.eci.arsw.coronavirus.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONML;
import org.json.JSONObject;

public interface HttpConnectionService {
    JSONObject connection(String city) throws UnirestException;
}
