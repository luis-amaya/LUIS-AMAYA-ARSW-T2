package edu.eci.arsw.coronavirus.services.impl;

import java.io.IOException;

import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.coronavirus.services.CoronavirusStatsServices;
import edu.eci.arsw.coronavirus.services.HttpConnectionService;

@Service
public class CoronavirusStatsServicesImpl implements CoronavirusStatsServices {

    @Autowired
    HttpConnectionService httpService;

    public CoronavirusStatsServicesImpl() {
    }

    @Override
    public JSONObject getCasesByCity(String city) throws UnirestException, IOException {
        JSONObject cityCases = httpService.connection(city);
        return cityCases;
    }

}
